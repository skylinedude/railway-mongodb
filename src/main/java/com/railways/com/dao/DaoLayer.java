package com.railways.com.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.railways.com.model.DataModel;

public interface DaoLayer extends MongoRepository<DataModel, Integer> {

}
