package com.quizeproject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
   
   @Id
   private int id;
   private String name;
   private int score;
   private String grade;
   
   
   
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}


@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", score=" + score + ", grade=" + grade + "]";
}
   
   
   
   
	
	
}
