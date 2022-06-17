package com.stocks.estockmarketstock.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.estockmarket.stocks.document.CustomSequences;

@Repository
public interface CustomSequencesRepo extends MongoRepository<CustomSequences, Integer> {

}
