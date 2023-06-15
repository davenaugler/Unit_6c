package com.coderscampus.lesson1.physTeacher;

import com.coderscampus.lesson1.Teacher;

public class PhysicsTeacher extends Teacher {
	
	// Constructor 
	public PhysicsTeacher () {
		System.out.println("Inside the PhysicsTeacher constructor");
		this.setClasses("PHYS 101, PHYS 201");
		this.setLevelOfEducation("Masters of Science");
	}
	
	@Override
	public void teach () {
		System.out.println("I'm a Physics teacher and I'm now teaching");
	}
	
	public void teach (String teacherName) {
		System.out.println("I'm a teacher called " + teacherName + " and I'm now teaching. (I'm being casted)");
	}
}
