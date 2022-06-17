package com.estockmarket.company.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class CompanyDto {

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	private Integer companyCode;
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	private String companyName;
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	private String companyCeo;
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	private String companyTurnover;
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	private String companyWebsite;
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	private String stockExchange;
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	private String errorMessage;
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Integer getCompanyCode() {
		return companyCode;
	}
	public String getStockExchange() {
		return stockExchange;
	}
	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}
	public void setCompanyCode(Integer companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyCeo() {
		return companyCeo;
	}
	public void setCompanyCeo(String companyCeo) {
		this.companyCeo = companyCeo;
	}
	public String getCompanyTurnover() {
		return companyTurnover;
	}
	public void setCompanyTurnover(String companyTurnover) {
		this.companyTurnover = companyTurnover;
	}
	public String getCompanyWebsite() {
		return companyWebsite;
	}
	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}
	
	
}
