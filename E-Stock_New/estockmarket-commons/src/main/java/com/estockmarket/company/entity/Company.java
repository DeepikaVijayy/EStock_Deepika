package com.estockmarket.company.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="COMPANY")
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="COMPANY_CODE")
	private Integer companyCode;
	@Column(name="COMPANY_NAME")
	private String companyName;
	@Column(name="COMPANY_CEO")
	private String companyCeo;
	@Column(name="COMPANY_TURNOVER")
	private String companyTurnover;
	@Column(name="COMPANY_WEBSITE")
	private String companyWebsite;
	@Column(name="STOCK_EXCHANGE")
	private String stockExchange;
}
