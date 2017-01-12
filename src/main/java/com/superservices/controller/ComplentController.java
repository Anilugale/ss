package com.superservices.controller;

import com.superservices.model.Complent;
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

import com.superservices.services.ComplentServices;
import java.util.ArrayList;


@Controller
@RequestMapping("/complent")
public class ComplentController {

	@Autowired
	       ComplentServices complentServices;

	static final Logger logger = Logger.getLogger(ComplentController.class);

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status addEmployee(@RequestBody Complent employee) {
		try {
			complentServices.addEntity(employee);
			return new Status(1, "product added Successfully !");
		} catch (Exception e) {
			 e.printStackTrace();
			return new Status(0, e.toString());
		}

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Complent getEmployee(@PathVariable("id") long id) {
		Complent employee = null;
		try {
			employee = complentServices.getEntityById(id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody
	List<Complent> getEmployee() {

		List<Complent> employeeList = null;
		try {
			employeeList = complentServices.getEntityList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return employeeList;
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Status deleteEmployee(@PathVariable("id") long id) {

		try {
			complentServices.deleteEntity(id);
			return new Status(1, "Product deleted Successfully !");
		} catch (Exception e) {
			return new Status(0, e.toString());
		}

	}

    List<Complent> getComplentByProductID(long id) {
        List<Complent> employeeList = null;
		try {
			employeeList = complentServices.getComplentListByProductId(id);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return employeeList;
    }
        
     
}
