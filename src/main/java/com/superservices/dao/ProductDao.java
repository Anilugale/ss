package com.superservices.dao;

import java.util.List;

import com.superservices.model.Product;

public interface ProductDao {
	public boolean addEntity(Product employee) throws Exception;
	public Product getEntityById(long id) throws Exception;
	public List<Product> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;
       
}
