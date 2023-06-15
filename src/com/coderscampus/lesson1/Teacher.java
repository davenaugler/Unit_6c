package com.coderscampus.lesson1;

public class Teacher {
	
	// blank IS A blank - then we have Inheritance 
	// blank HAS A blank - then we have a Property

	// Properties of Teacher
	private String classes;
	private String levelOfEducation;
	protected int totalNumberOfGradedPapers;
	
	protected void gradingPapers () {
		System.out.println("I'm a teacher and I'm now grading papers");
	}
	
	
//	OVERRIDING VS. OVERLOADING
//	Overriding occurs when the method signature is the same 
//	in the superclass and the child class. Overloading occurs 
//	when two or more methods in the same class have the same 
//	name but different parameters.
	
	
	private void giveARaise () {
		System.out.println("Teacher get's a raise");
	}
	
	public void teach () {
		System.out.println("I'm a teacher and I'm now teaching");
	}
	
	public void teach (int age) {
		System.out.println("I'm a " + age + " year old teacher and I'm now teaching");
	} 
	
	public void teach (String teacherName, int age) {
		System.out.println("I'm a " + age + " year old teacher called " + teacherName + " and I'm now teaching");
	} 
	
	// Constructor
	public Teacher () {
		System.out.println("Inside the Teacher constructor");
		this.classes = "No classes assinged";
		this.levelOfEducation = "No education assigned";
		this.giveARaise();
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getLevelOfEducation() {
		return levelOfEducation;
	}

	public void setLevelOfEducation(String levelOfEducation) {
		this.levelOfEducation = levelOfEducation;
	}

}
