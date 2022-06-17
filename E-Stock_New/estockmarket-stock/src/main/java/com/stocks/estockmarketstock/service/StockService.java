package com.stocks.estockmarketstock.service;

import java.util.List;

import com.estockmarket.stocks.document.StockDetails;
import com.estockmarket.stocks.dto.StockDto;

public interface StockService {

	StockDto createStock(Integer companyCode, StockDetails stockDetails);

	StockDto getStock(Integer companyCode);

	void deleteStock(StockDto stock);

	List<StockDto> getAllStock();

	void deleteAllStocks();
	
	void deleteAllCustomSequence();
}
