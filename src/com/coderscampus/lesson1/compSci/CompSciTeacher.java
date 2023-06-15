package com.coderscampus.lesson1.compSci;

import com.coderscampus.lesson1.Teacher;

public class CompSciTeacher extends Teacher {
	
	// Constructor 
	public CompSciTeacher () {
		System.out.println("Inside the CompSciTeacher constructor");
		this.setClasses("COMP 101, COMP 201");
		this.setLevelOfEducation("Bachelors of Education");
		
	}
}
