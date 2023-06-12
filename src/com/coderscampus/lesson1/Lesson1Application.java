package com.coderscampus.lesson1;

public class Lesson1Application {

	public static void main(String[] args) {
		
		PhysicsTeacher physicsTeacher = new PhysicsTeacher();
		
		System.out.println(physicsTeacher.getClasses());
		System.out.println(physicsTeacher.getLevelOfEducation());
		System.out.println("---------------------------------------");
		
		CompSciTeacher compSciTeacher = new CompSciTeacher();
		System.out.println(compSciTeacher.getClasses());
		System.out.println(compSciTeacher.getLevelOfEducation());
		System.out.println("---------------------------------------");
		
		QuantumPhysicsTeacher quantPhysTeacher = new QuantumPhysicsTeacher();
		System.out.println(quantPhysTeacher.getClasses());
		System.out.println(quantPhysTeacher.getLevelOfEducation());
		System.out.println("---------------------------------------");
		
		
	}

}
