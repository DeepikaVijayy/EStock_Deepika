package com.estockmarket.stocks.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Stock {

	@Id
	private Integer id;
	private Integer companyCode;
	private List<StockDetails> stockDetails;

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
