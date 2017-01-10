package com.superservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.superservices.dao.ProductDao;
import com.superservices.model.Product;

public class ProductServicesImpl implements ProductServices {

	@Autowired
	ProductDao productDao;
	
	@Override
	public boolean addEntity(Product employee) throws Exception {
		return productDao.addEntity(employee);
	}

	@Override
	public Product getEntityById(long id) throws Exception {
		return productDao.getEntityById(id);
	}

	@Override
	public List<Product> getEntityList() throws Exception {
		return productDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(long id) throws Exception {
		return productDao.deleteEntity(id);
	}
}
