package com.company.estockmarketcompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estockmarket.company.entity.Company;



@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

	Company findByCompanyCode(Integer companyCode);
}
