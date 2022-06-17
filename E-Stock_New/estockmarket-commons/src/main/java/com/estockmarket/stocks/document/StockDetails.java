package com.estockmarket.stocks.document;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class StockDetails {
	private Double stockPrice;
	private Date stockPriceDttm;
	
	public Double getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(Double stockPrice) {
		this.stockPrice = stockPrice;
	}
	public Date getStockPriceDttm() {
		return stockPriceDttm;
	}
	public void setStockPriceDttm(Date stockPriceDttm) {
		this.stockPriceDttm = stockPriceDttm;
	}
	
	
}
