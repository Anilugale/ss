package com.superservices.dao;

import com.superservices.model.CustomerComplent;
import java.util.List;


public interface CustomerComplentDao {
	public CustomerComplent addEntity(CustomerComplent complent) throws Exception;
	public CustomerComplent getEntityById(long id) throws Exception;
	public List<CustomerComplent> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;

}
