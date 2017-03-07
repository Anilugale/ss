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

import com.superservices.model.Product;
import com.superservices.services.ProductServices;
import java.util.ArrayList;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductServices productServices;
        
        @Autowired
	ComplentController complentServices;

	static final Logger logger = Logger.getLogger(ProductController.class);

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status addEmployee(@RequestBody Product employee) {
		try {
			productServices.addEntity(employee);
			return new Status(1, "product added Successfully !");
		} catch (Exception e) {
			 e.printStackTrace();
			return new Status(0, e.toString());
		}

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Product getEmployee(@PathVariable("id") long id) {
		Product employee = null;
		try {
			employee = productServices.getEntityById(id);
                        employee.setComplent(complentServices.getComplentByProductID(id));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}

	@RequestMapping(value = "/marchand/{id}", method = RequestMethod.GET)
	public @ResponseBody
	List<Product> getMarchantProductList(@PathVariable("id")String marchandID) {

		List<Product> employeeList = new ArrayList<>();
		try {
			employeeList = productServices.getProductList(marchandID);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return employeeList;
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Status deleteEmployee(@PathVariable("id") long id) {

		try {
			productServices.deleteEntity(id);
			return new Status(1, "Product deleted Successfully !");
		} catch (Exception e) {
			return new Status(0, e.toString());
		}

	}
        
     
}
