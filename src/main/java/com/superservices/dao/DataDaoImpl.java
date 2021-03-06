package com.superservices.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import com.superservices.model.Customer;
import com.superservices.model.Marchand;
import com.superservices.model.Status;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class DataDaoImpl implements DataDao {

	@Autowired
	SessionFactory sessionFactory;

	Session session = null;
	Transaction tx = null;

	@Override
	public Customer addEntity(Customer employee) throws Exception {

		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(employee);
		tx.commit();
		session.close();

		return employee;
	}

	@Override
	public Customer getEntityById(long id) throws Exception {
		session = sessionFactory.openSession();
		Customer employee = (Customer) session.load(Customer.class,
				new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return employee;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getEntityList() throws Exception {
		session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Customer> employeeList = session.createCriteria(Customer.class)
				.list();
		tx.commit();
		session.close();
		return employeeList;
	}
	
	@Override
	public boolean deleteEntity(long id)
			throws Exception {
		session = sessionFactory.openSession();
		Object o = session.load(Customer.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
	}
        
    @Override
    public Status login(String username, String password) throws Exception {
         session = sessionFactory.openSession();
                   
         Status status = new Status();
                Criteria cr = session.createCriteria(Customer.class);
                cr.add(Restrictions.eq("username", username));
                Customer marchand = (Customer) cr.uniqueResult();
                
                if(marchand == null){
                    status.setMessage("user is not exist register");
                      return status;
                }
                
                 if(marchand.getUsername().equals(username) && marchand.getPassword().equals(password)){
                     status.setData(marchand);
                 }else if(marchand.getUsername().equals(username)){
                  status.setMessage("password not correct!");
                 }else{
                    status.setMessage("username password not correct!");

                 }
                 
                 return status;
    }

}
