package com.company.estockmarketcompany.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.estockmarket.company.dto.CompanyDto;
import com.estockmarket.company.entity.Company;


public interface CompanyService {

	CompanyDto companyRegister(CompanyDto company);

	CompanyDto getCompany(Integer companyCode);

	List<CompanyDto> getAllCompany();

	String deleteCompany(Integer companyCode);

	void deleteAllCompany();
}
