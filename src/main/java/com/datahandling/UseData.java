package com.datahandling;




import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class UseData {

	static int counter =0; 
	//public static void main(String[] args) {
	
	public static int getscore() {
		LinkedHashMap<String, String> hs = RetriveData.getRertiveData();
		
		Set<String> set =hs.keySet();
        Iterator<String> itr1 =set.iterator();
	    int ctr =0;
	    String[] arr=new String[10];
	    
	    while(itr1.hasNext()) {
				String i =itr1.next();
			    arr[ctr]=i;
		        ctr++;
		  }
	     
	   
		int questionno =1;
		
         Random gen = new Random();
		
		LinkedHashSet<Integer> lhs =new LinkedHashSet<Integer>();
		
		
		for(int p =0; p<50;p++) {
			
			int q = gen.nextInt(10);
			
			lhs.add(q);
			
		}
		
	
		Scanner sc = new Scanner(System.in);
		Iterator<Integer> ltr =lhs.iterator();
			while(ltr.hasNext())
		{
			 int m=ltr.next();
			 
			 
			switch (m) {
			
			case 0:System.out.println("Question no"+questionno+") "+arr[0]);
			System.out.println("A) James Bond");
			System.out.println("b) James gosling");
			System.out.println("c) James keller");
			System.out.println("d) Dennis Ritchie");
			//System.out.println("Enter the ans :-");
			//char user = sc.next().charAt(0);
			 char user;
			
			do {
				System.out.println("Choose the right option:-");
			    user = sc.next().charAt(0);
	 		}	while(user!='a' && user!='b' && user!='c' && user!='d' );
			
			
			if(user =='b') {
				counter ++;
			}
				
			break;
			
			case 1:System.out.println("Question no"+questionno+") "+arr[1]);
			   System.out.println("A) 1995");
			   System.out.println("b) 1994");
			   System.out.println("c) 1955");
			   System.out.println("d) 1984");
			   char user1;
				
				do {
					System.out.println("Choose the right option:-");
				    user1 = sc.next().charAt(0);
		 		}	while(user1!='a' && user1!='b' && user1!='c' && user1!='d' );
					
				if(user1 =='a') {
						counter ++;
				}
			
				break;
				
			case 2:System.out.println("Question no"+questionno+") "+arr[2]);
			 System.out.println("A) Ten");
			 System.out.println("b) eight");
			 System.out.println("c) Six");
			 System.out.println("d) Twelve");
			 char user2;
				
				do {
					System.out.println("Choose the right option:-");
				    user2 = sc.next().charAt(0);
		 		}	while(user2!='a' && user2!='b' && user2!='c' && user2!='d' );
				
            
			  if(user2 =='b') {
				  counter ++;
					
			  }	
				break;
				
			case 3:	System.out.println("Question no"+questionno+") "+arr[3]);
			System.out.println("A) Zero");
		   	System.out.println("b) double quotes ");
			System.out.println("c) null");
		 	System.out.println("d) none of these");
		 	 char user3;
				
				do {
					System.out.println("Choose the right option:-");
				    user3 = sc.next().charAt(0);
		 		}	while(user3!='a' && user3!='b' && user3!='c' && user3!='d' );
				
			if(user3 =='c') {
							
		   		counter ++;
						
		   	}
				break;
			
			case 4: System.out.println("Question no"+questionno+") "+arr[4]);
			 System.out.println("A) 16 bits");
			 System.out.println("b) 8 bits");
			 System.out.println("c) 32 bits");
			 System.out.println("d) 64 bits");
			 char user4;
				
				do {
					System.out.println("Choose the right option:-");
				    user4 = sc.next().charAt(0);
		 		}	while(user4!='a' && user4!='b' && user4!='c' && user4!='d' );
				
			 if(user4 =='a') {
						
				 counter ++;
						
			 }	
				
				break;
				
			case 5:System.out.println("Question no"+questionno+") "+arr[5]);
			 System.out.println("A) JRE");
			 System.out.println("b) JVM");
			 System.out.println("c) JDK");
			 System.out.println("d) none of these");
			 char user5;
				
				do {
					System.out.println("Choose the right option:-");
				    user5 = sc.next().charAt(0);
		 		}	while(user5!='a' && user5!='b' && user5!='c' && user5!='d' );
				
			 if(user5 =='c') {
						
				 counter ++;
						
			 }	
				
				break;
				
			case 6:System.out.println("Question no"+questionno+") "+arr[6]);
			
			System.out.println("A) Use null pointer");
			System.out.println("b) Robust");
			System.out.println("c) Object Oriented");
			System.out.println("d) Platform indipendant");
			 char user6;
				
				do {
					System.out.println("Choose the right option:-");
				    user6 = sc.next().charAt(0);
		 		}	while(user6!='a' && user6!='b' && user6!='c' && user6!='d' );
				
			if(user6 =='a') {
				counter ++;
			}	
				break;
				
			case 7:System.out.println("Question no"+questionno+") "+arr[7]);
			System.out.println("A) .txt");
			System.out.println("b) .class");
			System.out.println("c) .java");
			System.out.println("d) .mp3");
			 char user7;
				
				do {
					System.out.println("Choose the right option:-");
				    user7 = sc.next().charAt(0);
		 		}	while(user7!='a' && user7!='b' && user7!='c' && user7!='d' );
				
			
			if(user7 =='c') {
				counter ++;
			}	
				break;
				
			case 8:System.out.println("Question no"+questionno+") "+arr[8]);
			System.out.println("A) Polymorphism");
			System.out.println("b) Compilation");
			System.out.println("c) Encapsulation");
			System.out.println("d) Abstraction");
			 char user8;
				
				do {
					System.out.println("Choose the right option:-");
				    user8 = sc.next().charAt(0);
		 		}	while(user8!='a' && user8!='b' && user8!='c' && user8!='d' );
				
			if(user8 =='b') {
				counter ++;
			}	
				break;
			case 9:System.out.println("Question no"+questionno+") "+arr[9]);
			System.out.println("A) for");
			System.out.println("b) select");
			System.out.println("c) print");
			System.out.println("d) if");
			 char user9;
				
				do {
					System.out.println("Choose the right option:-");
				    user9 = sc.next().charAt(0);
		 		}	while(user9!='a' && user9!='b' && user9!='c' && user9!='d' );
				
			if(user9 =='d') {
				counter ++;
			}	
				break;
				
			default:
				break;
			}
			
		
		questionno++;	
			
			
	}
			
	int score = counter;
	return score;
	//System.out.println(score);

  }
	
	
	
}