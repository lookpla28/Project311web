package com.springmvc.model;
import java.util.Properties;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import model.Opd_Card;
import model.Patient;
import model.Payments;
import model.Queue;
import model.Remedy;
import model.Doctor;
import model.DoctorPatient;
import model.DoctorPatientID;
import model.Employee;




public class HibernateConnection {
	static String url = "jdbc:mysql://localhost:3306/web?characterEncoding=UTF-8";
	static String uname = "it311";
	static String pwd = "1234";
	
	public static SessionFactory sessionFactory;
	
	public static SessionFactory doHibernateConnection() {
	Properties database = new Properties();
	database.setProperty("hibernate.hbm2ddl.auto","create");
	database.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
	database.setProperty("hibernate.connection.username", uname);
	database.setProperty("hibernate.connection.password", pwd);
	database.setProperty("hibernate.connection.url", url);
	database.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
	Configuration cfg = new Configuration().setProperties(database).addPackage("model")
			//.addAnnotatedClass(Employee.class)
			.addAnnotatedClass(Doctor.class)
			.addAnnotatedClass(Employee.class)
			.addAnnotatedClass(Opd_Card.class)
			.addAnnotatedClass(Patient.class)
			.addAnnotatedClass(Payments.class)
			.addAnnotatedClass(Queue.class)
			.addAnnotatedClass(Remedy.class)
		    .addAnnotatedClass(DoctorPatient.class)
			.addAnnotatedClass(DoctorPatientID.class)
			
			;
	
	StandardServiceRegistryBuilder ssrb =
	new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
	sessionFactory = cfg.buildSessionFactory(ssrb.build());
	return sessionFactory;
	}

}
