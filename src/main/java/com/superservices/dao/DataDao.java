package com.superservices.dao;

import java.util.List;

import com.superservices.model.Customer;
import com.superservices.model.Status;

public interface DataDao {
	public boolean addEntity(Customer employee) throws Exception;
	public Customer getEntityById(long id) throws Exception;
	public List<Customer> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;
        public Status login(String username,String password) throws Exception;
}
