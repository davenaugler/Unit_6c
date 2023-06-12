package com.coderscampus.lesson1;

public class Teacher {
	
	// blank IS A blank - then we have Inheritance 
	// blank HAS A blank - then we have a Property

	// Properties of Teacher
	private String classes;
	private String levelOfEducation;
	
	// Constructor
	public Teacher () {
		System.out.println("Inside the Teacher constructor");
		this.classes = "No classes assinged";
		this.levelOfEducation = "No education assigned";
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
