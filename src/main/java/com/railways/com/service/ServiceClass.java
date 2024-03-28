package com.railways.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railways.com.dao.DaoLayer;
import com.railways.com.model.DataModel;

@Service
public class ServiceClass {

@Autowired
private DaoLayer con;
public void addData(DataModel user) {
	user.setId(10);
	user.setForest_name("Kabini forest");
	user.setLocation("H.D.Kote");
	user.setAnimal_count(69);
	con.insert(user);
}
}
