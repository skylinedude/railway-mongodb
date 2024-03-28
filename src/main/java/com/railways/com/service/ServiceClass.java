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
	user.setId(420);
	user.setForest_name("Kabini forest");
	user.setLocation("H.D.Kote");
	user.setAnimal_count(69);
	con.insert(user);
}
	public DataModel showdata(DataModel user1) {
	user1.setId(110);
	var info=con.findById(user1.getId()).orElse(user1);
	return info;
}
}
