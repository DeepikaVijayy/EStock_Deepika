package com.stocks.estockmarketstock.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.estockmarket.stocks.document.StockDetails;

@Repository
public interface StockDetailsRepository extends MongoRepository<StockDetails, Integer>{

	List<StockDetails> findByStockPriceDttm(Integer companyCode, Date startDate, Date endDate);
}
