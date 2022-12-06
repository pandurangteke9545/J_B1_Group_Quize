package com.util;

import java.util.Comparator;

import com.quizeproject.Student;

public class IdComparator implements Comparator<Student> {
	
	public int compare(Student std1, Student std2) {
		
		if(std1.getId()>std2.getId()) {
			return 1;
		}else if(std1.getId()<std2.getId()) {
			return -1;
		}else
		
		
		return 0;
	}

}
