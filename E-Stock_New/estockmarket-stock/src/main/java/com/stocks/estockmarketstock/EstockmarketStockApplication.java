package com.stocks.estockmarketstock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

import com.stocks.estockmarketstock.service.StockService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.stocks.estockmarketstock.*","com.estockmarket.stocks.*"})
@EnableTransactionManagement
public class EstockmarketStockApplication {
	
	@Autowired
	StockService stockService;
	
	public static void main(String[] args) {
		SpringApplication.run(EstockmarketStockApplication.class, args);
	}

	@Bean
	public static RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public void clearDB() {
		stockService.deleteAllStocks();
		stockService.deleteAllCustomSequence();
	}
}
