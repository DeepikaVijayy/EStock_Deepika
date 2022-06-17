package com.stocks.estockmarketstock.service;

import java.util.Date;
import java.util.List;

import com.estockmarket.stocks.document.StockDetails;

public interface StockDetailsService {

	List<StockDetails> findByStockPriceDttm(Integer companyCode, Date startDate, Date endDate);
}
