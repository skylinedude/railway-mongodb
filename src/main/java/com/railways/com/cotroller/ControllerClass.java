package com.railways.com.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.railways.com.model.DataModel;
import com.railways.com.service.ServiceClass;

@RestController
public class ControllerClass {

@Autowired
private ServiceClass cont;

@GetMapping("railway/forest")
public String showData(DataModel data) {
	cont.addData(data);
	return "data added";
}
	@GetMapping("railway/show-forest")
public DataModel showingData(DataModel data1) {
	return cont.showdata(data1);
}
}
