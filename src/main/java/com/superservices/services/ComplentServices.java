package com.superservices.services;

import com.superservices.model.Complent;
import java.util.List;


public interface ComplentServices {
	public boolean addEntity(Complent complent) throws Exception;
	public Complent getEntityById(long id) throws Exception;
	public List<Complent> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;
        public List<Complent> getComplentListByProductId(long id);
}
