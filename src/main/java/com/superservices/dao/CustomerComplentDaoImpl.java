package com.superservices.dao;


import com.superservices.model.CustomerComplent;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerComplentDaoImpl implements CustomerComplentDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public boolean addEntity(CustomerComplent employee) throws Exception {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(employee);
		tx.commit();
		session.close();

		return false;
	}

	@Override
	public CustomerComplent getEntityById(long id) throws Exception {
		session = sessionFactory.openSession();
		CustomerComplent employee = (CustomerComplent) session.load(CustomerComplent.class,
				new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return employee;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerComplent> getEntityList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<CustomerComplent> employeeList = session.createCriteria(CustomerComplent.class)
				.list();
		tx.commit();
		session.close();
		return employeeList;
	}
	
	@Override
	public boolean deleteEntity(long id)
			throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(CustomerComplent.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}

}
