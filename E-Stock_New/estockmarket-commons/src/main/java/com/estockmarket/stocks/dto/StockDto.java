package com.estockmarket.stocks.dto;

import java.util.Date;
import java.util.List;

import com.estockmarket.stocks.document.StockDetails;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

public class StockDto {

	@JsonInclude(JsonInclude.Include.NON_NULL) 
	private Integer id;
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	private Integer companyCode;
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	private List<StockDetails> stockDetails;
	@JsonInclude(JsonInclude.Include.NON_NULL) 
	private String errorMessage;

	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String message) {
		this.errorMessage = message;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(Integer companyCode) {
		this.companyCode = companyCode;
	}
	public List<StockDetails> getStockDetails() {
		return stockDetails;
	}
	public void setStockDetails(List<StockDetails> stockDetails) {
		this.stockDetails = stockDetails;
	}
	
	
}
