package com.stocks.estockmarketstock.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estockmarket.stocks.document.StockDetails;
import com.stocks.estockmarketstock.repository.StockDetailsRepository;

@Service
public class StockDetailsServiceImpl implements StockDetailsService {
	
	@Autowired
	StockDetailsRepository stockDetailsRepository;

	@Override
	public List<StockDetails> findByStockPriceDttm(Integer companyCode, Date startDate, Date endDate) {
			List<StockDetails> stockListDate = stockDetailsRepository.findByStockPriceDttm(companyCode, startDate, endDate);
			/*
			 * List<StockDto> stockDtoList=new ArrayList<StockDto>();
			 * if(!stockListDate.isEmpty()) { stockListDate.stream().forEach(s -> { StockDto
			 * stockDto=new StockDto(); BeanUtils.copyProperties(s, stockDto);
			 * stockDtoList.add(stockDto); }); }
			 */
			return stockListDate;
		}
	

}
