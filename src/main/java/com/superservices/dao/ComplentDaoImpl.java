package com.superservices.dao;

import com.superservices.model.Complent;
import com.superservices.model.Marchand;
import java.util.List;
import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

public class ComplentDaoImpl implements ComplentDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public boolean addEntity(Complent employee) throws Exception {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(employee);
		tx.commit();
		session.close();

		return false;
	}

	@Override
	public Complent getEntityById(long id) throws Exception {
		session = sessionFactory.openSession();
		Complent employee = (Complent) session.load(Complent.class,
				new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return employee;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Complent> getEntityList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Complent> employeeList = session.createCriteria(Complent.class)
				.list();
		tx.commit();
		session.close();
		return employeeList;
	}
	
	@Override
	public boolean deleteEntity(long id)
			throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(Complent.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}

    @Override
    public List<Complent> getComplentListByProductId(long id) {
     session = sessionFactory.openSession();
		//org.hibernate.Query query = session.createQuery("from marchand where username ='"+username+"'");
                   // query.setParameter("username", username);
                  List<Complent>  data; 
                Criteria cr = session.createCriteria(Complent.class);
                cr.add(Restrictions.eq("productCode", id+""));
                data = cr.list();
                return data;
                
    }
        
   

}
