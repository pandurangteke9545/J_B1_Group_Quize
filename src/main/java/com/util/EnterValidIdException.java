package com.util;

public class EnterValidIdException extends RuntimeException{
	
	
	public EnterValidIdException(String msg) {
		
		System.err.println(msg);
		
		System.out.println("please check your ID");
		
	}
	
	
	

	

}
