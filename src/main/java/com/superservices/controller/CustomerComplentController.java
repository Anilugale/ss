package com.superservices.controller;

import com.superservices.model.Complent;
import com.superservices.model.CustomerComplent;
import java.util.List;

import org.apache.log4j.Logger;
import com.superservices.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.superservices.services.CustomerComplentServices;


@Controller
@RequestMapping("/ticket")
public class CustomerComplentController {

	@Autowired
	       CustomerComplentServices customerComplentServices;

	static final Logger logger = Logger.getLogger(CustomerComplentController.class);

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status addEmployee(@RequestBody CustomerComplent employee) {
		try {
			customerComplentServices.addEntity(employee);
			return new Status(1, "product added Successfully !");
		} catch (Exception e) {
			 e.printStackTrace();
			return new Status(0, e.toString());
		}

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody
	CustomerComplent getEmployee(@PathVariable("id") long id) {
		CustomerComplent employee = null;
		try {
			employee = customerComplentServices.getEntityById(id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody
	List<CustomerComplent> getEmployee() {

		List<CustomerComplent> employeeList = null;
		try {
			employeeList = customerComplentServices.getEntityList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return employeeList;
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Status deleteEmployee(@PathVariable("id") long id) {

		try {
			customerComplentServices.deleteEntity(id);
			return new Status(1, "Product deleted Successfully !");
		} catch (Exception e) {
			return new Status(0, e.toString());
		}

	}

  
        
     
}
