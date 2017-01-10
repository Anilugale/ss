package com.superservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.superservices.dao.MarchandDao;
import com.superservices.model.Marchand;

public class MarchandServicesImpl implements MarchandServices {

	@Autowired
	MarchandDao dataDao;
	
	@Override
	public boolean addEntity(Marchand employee) throws Exception {
		return dataDao.addEntity(employee);
	}

	@Override
	public Marchand getEntityById(long id) throws Exception {
		return dataDao.getEntityById(id);
	}

	@Override
	public List<Marchand> getEntityList() throws Exception {
		return dataDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(long id) throws Exception {
		return dataDao.deleteEntity(id);
	}

    @Override
    public String login(String username, String password) throws Exception {
        return dataDao.login(username,password);
    }

}
