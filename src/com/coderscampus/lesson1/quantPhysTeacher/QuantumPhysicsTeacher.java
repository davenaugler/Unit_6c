package com.coderscampus.lesson1.quantPhysTeacher;

import com.coderscampus.lesson1.physTeacher.PhysicsTeacher;

public class QuantumPhysicsTeacher extends PhysicsTeacher {
	
	// Constructor 
	public QuantumPhysicsTeacher () {
		System.out.println("Inside the QuantumPhysicsTeacher constructor");
		this.setClasses("QPHY 101, QPHY 201");
		this.setLevelOfEducation("PhD");
	}
	
	@Override
	public void teach () {
		System.out.println("I'm a Quantum Physics Teacher, and I'm now in a super-position of teaching");
	}

}
