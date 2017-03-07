/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.superservices.dao;

import com.superservices.model.Marchand;
import com.superservices.model.Product;
import java.util.List;
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
public class ProductDaoImp implements ProductDao{
    
    @Autowired
    SessionFactory sessionFactory;

    Session session = null;
    Transaction tx = null;

    @Override
    public boolean addEntity(Product marchand) throws Exception {
	session = sessionFactory.openSession();
		tx = session.beginTransaction();
		session.save(marchand);
		tx.commit();
		session.close();

		return false;
    }

    @Override
    public Product getEntityById(long id) throws Exception {
        session = sessionFactory.openSession();
		Product product = (Product) session.load(Product.class,
				new Long(id));
		tx = session.getTransaction();
		session.beginTransaction();
		tx.commit();
		return product;
    }


    @Override
    public boolean deleteEntity(long id) throws Exception {
                session = sessionFactory.openSession();
		Object o = session.load(Product.class, id);
		tx = session.getTransaction();
		session.beginTransaction();
		session.delete(o);
		tx.commit();
		return false;
    }

    @Override
    public List<Product> getProductList(String marchandId) throws Exception {
                session = sessionFactory.openSession();
		tx = session.beginTransaction();
		List<Product> list = session.createCriteria(Product.class)
                        .add(Restrictions.eq("marchandId", marchandId))
				.list();
                
		tx.commit();
		session.close();
		return list;
    }

   
    
}
