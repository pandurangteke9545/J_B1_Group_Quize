package com.quizeproject;

import java.util.LinkedHashMap;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.util.DBconnection;

import java.util.Scanner;
import org.hibernate.Transaction;

import com.datahandling.UseData;
import com.quizeproject.Student;


	public class App 
	{
		
		
		
		static int count=0;
		public static void main(String[] args) {
			
	       Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Enter your name:-");
			String name = sc.nextLine();
			System.out.println("Enter your id:-");
			int id = sc.nextInt();
			
			//ArrayList<Integer> al = new ArrayList<>();
			
	        SessionFactory sessionFactory = DBconnection.getSessionFactory();
			

			Session session = sessionFactory.openSession();
	       Query query = session.createQuery("select s.id from Student s");
	       
	       List<Integer> al = query.list();
	       
	       session.close();
			
	       for(Integer i: al) {
	    	   
	    	   //System.out.println(i);
	    	   
				if(id==i) {
					count++;
				}
			}
			
			if(count!=0) {
				System.out.println("Your Attempt is Alredy Completed");
			}
			
			
			
			
			
		else {
				
				int score =UseData.getscore();
			
			  String grade="P";
			 

			if(score<=10&&score>8) {
				grade = "A";
				
				System.out.println("****** Congratulations ***** \nYour score is>>"+score+
						" \nYou get 'A' Grade");
			}else if(score<=8&&score>=6) {
				grade = "B";
				System.out.println("****** Congratulations ***** \nYour score is>>"+score+
						" \nYou get 'B' Grade");
			}else if(score==5) {
				grade = "C";
				System.out.println("****** Congratulations ***** \nYour score is>>"+score+
						" \nYou get 'c' Grade");
				
			}else if(score<5) {
				grade = "D";
				System.out.println("****** You Are Falid ***** \nYour score is>>"+score+
						" \nYou get 'D' Grade");
			}
			
			Session session1 = sessionFactory.openSession();
			
			Student student = new Student();
			student.setId(id);
			student.setGrade(grade);
			student.setName(name);
			student.setScore(score);
			
			Transaction transaction = session1.beginTransaction();
			
			session1.save(student);
		    
			transaction.commit();
				
			sessionFactory.close();
		    System.out.println("****** THANK YOU ******");
				

				
			}
			
		}

	}


