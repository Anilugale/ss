package com.superservices.controller;

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

import com.superservices.model.Marchand;
import com.superservices.services.MarchandServices;

@Controller
@RequestMapping("/marchand")
public class MarchandController {

	@Autowired
	MarchandServices dataServices;

	static final Logger logger = Logger.getLogger(MarchandController.class);

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status addEmployee(@RequestBody Marchand employee) {
		try {
			dataServices.addEntity(employee);
			return new Status(1, "Marchand added Successfully !");
		} catch (Exception e) {
			 e.printStackTrace();
			return new Status(0, e.toString());
		}

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Marchand getEmployee(@PathVariable("id") long id) {
		Marchand marchand = null;
		try {
			marchand = dataServices.getEntityById(id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return marchand;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody
	List<Marchand> getMarchand() {

		List<Marchand> employeeList = null;
		try {
			employeeList = dataServices.getEntityList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return employeeList;
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Status deleteEmployee(@PathVariable("id") long id) {

		try {
			dataServices.deleteEntity(id);
			return new Status(1, "Marchand deleted Successfully !");
		} catch (Exception e) {
			return new Status(0, e.toString());
		}

	}
        
        @RequestMapping(value = "/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status login(@RequestBody Marchand marchand) {

		try {
			String result = dataServices.login(marchand.getUsername(),marchand.getPassword());
			return new Status(1, result);
		} catch (Exception e) {
                    e.printStackTrace();
			return new Status(0, e.toString());
		}

	}
}
