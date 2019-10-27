package com.springmvc.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class Run {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateConnection.doHibernateConnection();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			
			tx.commit();
			System.out.println("insert sessionFactory!!");
		}catch(Exception e) {
			if(tx != null)
				tx.rollback();
			System.out.println("intsert failed!");
			
		}finally {
			session.close();
		}
		sessionFactory.close();
	
	}

}
