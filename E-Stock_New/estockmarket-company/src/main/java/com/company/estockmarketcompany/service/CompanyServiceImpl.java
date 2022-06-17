package com.company.estockmarketcompany.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.company.estockmarketcompany.repository.CompanyRepository;
import com.estockmarket.company.dto.CompanyDto;
import com.estockmarket.company.entity.Company;
import com.estockmarket.utils.Constants;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyRepository companyRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${stock.url}")
	private String stockUrl;
	
	@Override
	public CompanyDto companyRegister(CompanyDto companyDto) {
		Company company =new Company();
		BeanUtils.copyProperties(companyDto, company);
		Company registeredCompany=companyRepository.save(company);
		CompanyDto registeredCompanyDto=new CompanyDto();
		if(registeredCompany != null) {
		BeanUtils.copyProperties(registeredCompany, registeredCompanyDto);
		}
		return registeredCompanyDto;
	}

	@Override
	public CompanyDto getCompany(Integer companyCode) {
		Company company=companyRepository.findByCompanyCode(companyCode);
		CompanyDto companyDto=new CompanyDto();
		if(company != null) {
		BeanUtils.copyProperties(company, companyDto);
		}
		return companyDto;
	}

	@Override
	public List<CompanyDto> getAllCompany() {
		List<Company> companyList=companyRepository.findAll();
		List<CompanyDto> companyDtoList=new ArrayList<>();
		if(companyList.size() > 0) {
			companyList.stream().forEach(c -> {
				CompanyDto compDto=new CompanyDto();
				BeanUtils.copyProperties(c, compDto);
				companyDtoList.add(compDto);
			});
		}
		return companyDtoList;
	}

	@Override
	public String deleteCompany(Integer companyCode) {
		StringBuilder sb=new StringBuilder(stockUrl);
		sb.append(companyCode);
		ResponseEntity<String> resultObj=restTemplate.getForEntity(sb.toString(), String.class);
		String result=resultObj.getBody();
		if(result.equalsIgnoreCase(Constants.SUCCESS)) {
			companyRepository.deleteById(companyCode);
			return Constants.SUCCESS;
		}
		if(result.equalsIgnoreCase(Constants.STOCK_NOT_FOUND)) {
			CompanyDto companyDto=getCompany(companyCode);
			if(companyDto.getCompanyCode() != null) {
				companyRepository.deleteById(companyCode);
				return Constants.SUCCESS;
			}else {
				return Constants.COMPANY_NOT_FOUND;
			}
		}
		else {
			return Constants.FAILED;
		}
	}

	@Override
	public void deleteAllCompany() {
		companyRepository.deleteAll();
	}

}
