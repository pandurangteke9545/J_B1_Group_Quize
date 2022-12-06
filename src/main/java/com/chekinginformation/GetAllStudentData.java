package com.chekinginformation;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.quizeproject.Questions;
import com.quizeproject.Student;
import com.util.DBconnection;

public class GetAllStudentData {
	
	public static void main(String[] args) {
		
		  SessionFactory sessionfactory = DBconnection.getSessionFactory();
			
			Session session = sessionfactory.openSession();
			
			LinkedHashMap<String, String> hashmap = new LinkedHashMap<String, String>();
		     Query query =session.createQuery("from Student");
		     
		     
//		     "from Payment where vcode=:p_Vcode or (Installment_Vcode=:installmentVcode and
//		     payment_date>:pdate) order by vcode desc"

		     
			
			List<Student> list = query.list();
			
			Collections.sort(list,new com.util.NameComparator());
			
			for(Student student : list) {
		
		    System.out.print(student.getId());
	     	System.out.print("\t"+student.getName());
	     	System.out.print("\t"+student.getScore());
	     	System.out.println("\t"+student.getGrade());
	   
	     	System.out.println("\n");
	    	
	    } 
			
		
	}
	
	
	
	 

}
