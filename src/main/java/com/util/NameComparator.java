package com.util;

import java.util.Comparator;

import com.quizeproject.Student;

import net.bytebuddy.asm.Advice.Return;

public class NameComparator implements Comparator<Student>{
	
	public int compare(Student std1, Student std2) {
		// TODO Auto-generated method stub
		return std1.getName().compareTo(std2.getName());
	}

	
}
