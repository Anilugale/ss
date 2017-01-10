/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superservices.dao;

import com.superservices.model.Marchand;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author MeghAnil1
 */
public class MarchandDaoImp implements MarchandDao{
    
    @Autowired
    SessionFactory sessionFactory;

    Session session = null;
    Transaction tx = null;

    @Override
    public boolean addEntity(Marchand marchand) throws Exception {
	session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(marchand);
		tx.commit();
		session.close();

		return false;
    }

    @Override
    public Marchand getEntityById(long id) throws Exception {
        session = sessionFactory.openSession();
		Marchand marchand = (Marchand) session.load(Marchand.class,
				new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return marchand;
    }

    @Override
    public List<Marchand> getEntityList() throws Exception {
                session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Marchand> list = session.createCriteria(Marchand.class)
				.list();
		tx.commit();
		session.close();
		return list;
    }

    @Override
    public boolean deleteEntity(long id) throws Exception {
                session = sessionFactory.openSession();
		Object o = session.load(Marchand.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
    }

    @Override
    public String login(String username, String password) throws Exception {
         session = sessionFactory.openSession();
		//org.hibernate.Query query = session.createQuery("from marchand where username ='"+username+"'");
                   // query.setParameter("username", username);
                   
                Criteria cr = session.createCriteria(Marchand.class);
                cr.add(Restrictions.eq("username", username));
                Marchand marchand = (Marchand) cr.uniqueResult();
                
                if(marchand == null){
                    return "user is not exist register";
                }
                
                 if(marchand.getUsername().equals(username) && marchand.getPassword().equals(password)){
                     return marchand.getId()+"";
                 }else if(marchand.getUsername().equals(username)){
                  return "password not correct!";
                 }else{
                  return "username password not correct!";
                 }
    }
    
}
