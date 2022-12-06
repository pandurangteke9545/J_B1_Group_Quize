package com.chekinginformation;

	import java.util.List;
	import java.util.Scanner;

	import org.hibernate.Query;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;

	import com.quizeproject.Student;
    import com.util.DBconnection;
import com.util.EnterValidIdException;

	public class getStudentResult {

		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Id Number:-");
			
			int id = sc.nextInt();
			
			int count=0;
			
			   SessionFactory sessionFactory1 = DBconnection.getSessionFactory();
				

			   Session session1 = sessionFactory1.openSession();
		       Query query = session1.createQuery("select s.id from Student s");
		       
		       List<Integer> al = query.list();
		       
		       session1.close();
				
		       for(Integer i: al) {
		    	   
		    	   //System.out.println(i);
		    	   
					if(id==i) {
						count++;
					}
				}
			
			
		       
		       if(count==0) {
		    	   
		    	   new EnterValidIdException("Your ID is Invalid");
		    	   
		    	   
		       }else {
		    	   
		      
			
			
			

			
	        SessionFactory sessionFactory = DBconnection.getSessionFactory();
			

			Session session = sessionFactory.openSession();
			  
			Student student=session.get(Student.class, id);
			
			System.out.println("Your name is:-"+student.getName());
	     	System.out.println("Your ID is:-"+student.getId());
	     	System.out.println("Your Score is:-"+student.getScore());
	     	System.out.println("Your Grade is:-"+student.getGrade());
	     	
			
			session.close();
	        sessionFactory.close();
		       }
		}
		
		
	}



