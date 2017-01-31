package com.superservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.superservices.dao.DataDao;
import com.superservices.model.Customer;
import com.superservices.model.Status;

public class DataServicesImpl implements DataServices {

    @Autowired
    DataDao dataDao;

    @Override
    public boolean addEntity(Customer employee) throws Exception {
        return dataDao.addEntity(employee);
    }

    @Override
    public Customer getEntityById(long id) throws Exception {
        return dataDao.getEntityById(id);
    }

    @Override
    public List<Customer> getEntityList() throws Exception {
        return dataDao.getEntityList();
    }

    @Override
    public boolean deleteEntity(long id) throws Exception {
        return dataDao.deleteEntity(id);
    }

    @Override
    public Status login(String username, String password) throws Exception {
        return dataDao.login(username, password);
    }

}
