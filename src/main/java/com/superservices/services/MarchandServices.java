package com.superservices.services;

import java.util.List;

import com.superservices.model.Marchand;

public interface MarchandServices {
	public boolean addEntity(Marchand employee) throws Exception;
	public Marchand getEntityById(long id) throws Exception;
	public List<Marchand> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;
        public String login(String username,String password) throws Exception;
}
