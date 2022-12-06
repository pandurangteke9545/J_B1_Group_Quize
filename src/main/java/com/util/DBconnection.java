package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBconnection {
	
	public static SessionFactory getSessionFactory() {
	//public static void main(String[] args) {
		
		
		Configuration cfg =  new Configuration();
		
    	cfg = cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory sessionfactory =cfg.buildSessionFactory();
    	
    	
    	
    	return sessionfactory;
		
	}

}
