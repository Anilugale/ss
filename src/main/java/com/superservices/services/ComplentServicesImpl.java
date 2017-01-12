package com.superservices.services;

import com.superservices.dao.ComplentDao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.superservices.model.Complent;

public class ComplentServicesImpl implements ComplentServices {

	@Autowired
	ComplentDao complentDao;
	
	@Override
	public boolean addEntity(Complent employee) throws Exception {
		return complentDao.addEntity(employee);
	}

	@Override
	public Complent getEntityById(long id) throws Exception {
		return complentDao.getEntityById(id);
	}

	@Override
	public List<Complent> getEntityList() throws Exception {
		return complentDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(long id) throws Exception {
		return complentDao.deleteEntity(id);
	}

    @Override
    public List<Complent> getComplentListByProductId(long id) {
       return complentDao.getComplentListByProductId(id);
    }
}
