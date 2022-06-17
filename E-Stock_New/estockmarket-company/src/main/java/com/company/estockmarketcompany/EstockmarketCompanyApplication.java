package com.company.estockmarketcompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

import com.company.estockmarketcompany.service.CompanyService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.company.estockmarketcompany.*"})
@EntityScan(basePackages = {"com.estockmarket.company.entity"})
@EnableJpaRepositories(basePackages = {"com.company.estockmarketcompany.repository"})
@EnableTransactionManagement
public class EstockmarketCompanyApplication {

	@Autowired
	CompanyService companyService;
	
	public static void main(String[] args) {
		SpringApplication.run(EstockmarketCompanyApplication.class, args);
	}

	@Bean
	public static RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public void clearDB() {
		companyService.deleteAllCompany();
	}
}
