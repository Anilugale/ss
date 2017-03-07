package com.superservices.services;

import com.superservices.dao.CustomerComplentDao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.superservices.model.CustomerComplent;

public class CustomerComplentServicesImpl implements CustomerComplentServices {

	@Autowired
	CustomerComplentDao customerComplentDao;
	
	@Override
	public CustomerComplent addEntity(CustomerComplent employee) throws Exception {
		return customerComplentDao.addEntity(employee);
	}

	@Override
	public CustomerComplent getEntityById(long id) throws Exception {
		return customerComplentDao.getEntityById(id);
	}

	@Override
	public List<CustomerComplent> getEntityList() throws Exception {
		return customerComplentDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(long id) throws Exception {
		return customerComplentDao.deleteEntity(id);
	}


}
