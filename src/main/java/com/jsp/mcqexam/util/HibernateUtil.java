package com.jsp.mcqexam.util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
  
    public static Session provideSession() {    	
		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		session.getTransaction().begin();
		return session;
	}

	public static void commitSession(Session session) {
		session.getTransaction().commit();
		session.close();
	}
	
	
	
	
	
	
	
	
	
}