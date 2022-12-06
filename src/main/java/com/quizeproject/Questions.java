package com.quizeproject;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Questions {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String question;
	private String answers;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	
	
	@Override
	public String toString() {
		return "Questions [id=" + id + ", question=" + question + ", answers=" + answers + "]";
	}
	
	
	
	
	
	
	
	

}
