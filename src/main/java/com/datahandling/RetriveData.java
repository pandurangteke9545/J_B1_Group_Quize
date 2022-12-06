package com.datahandling;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.quizeproject.Questions;
import com.util.DBconnection;

public class RetriveData {
	
	public static LinkedHashMap<String, String> getRertiveData(){
	
	//public static void main(String[] args) {
		
        SessionFactory sessionfactory = DBconnection.getSessionFactory();
		
		Session session = sessionfactory.openSession();
		
		LinkedHashMap<String, String> hashmap = new LinkedHashMap<String, String>();
	     Query query =session.createQuery("from Questions");
		
		List<Questions> list = query.list();
		
		for(Questions question : list) {
			
			hashmap.put(question.getQuestion(), question.getAnswers());
			
			}
	
		session.close();
		sessionfactory.close();
	    
		return hashmap;
		
	}

}
