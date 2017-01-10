package com.superservices.services;

import com.superservices.model.Product;
import java.util.List;


public interface ProductServices {
	public boolean addEntity(Product employee) throws Exception;
	public Product getEntityById(long id) throws Exception;
	public List<Product> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;
}
