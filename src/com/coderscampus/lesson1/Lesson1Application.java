package com.coderscampus.lesson1;

import com.coderscampus.lesson1.compSci.CompSciTeacher;
import com.coderscampus.lesson1.physTeacher.PhysicsTeacher;
import com.coderscampus.lesson1.quantPhysTeacher.QuantumPhysicsTeacher;

public class Lesson1Application {
	
	// Access modifiers in Java are: public, protected, package, private 
	public static void main(String[] args) {
		PackageAccessModifierExample example = new PackageAccessModifierExample();
		System.out.println(example.someValue);
		System.out.println("---------------------------------------");

		Teacher physicsTeacher = new PhysicsTeacher();

		// This is an alternative way of casting, and it's more verbose //
//		PhysicsTeacher castedPhysicsTeacher = (PhysicsTeacher)physicsTeacher;
//		castedPhysicsTeacher.teach("Dave Nauger");

		System.out.println(physicsTeacher.getClasses());
		System.out.println(physicsTeacher.getLevelOfEducation());

		// Shorthand version of casting for physicsTeacher //
		((PhysicsTeacher) physicsTeacher).teach("DaveNaugler");
		((PhysicsTeacher) physicsTeacher).gradingPapers();
//		((PhysicsTeacher) physicsTeacher).
		System.out.println("---------------------------------------");

		Teacher compSciTeacher = new CompSciTeacher();
		System.out.println(compSciTeacher.getClasses());
		System.out.println(compSciTeacher.getLevelOfEducation());
		compSciTeacher.teach(36);

		System.out.println("---------------------------------------");

		Teacher quantPhysTeacher = new QuantumPhysicsTeacher();
		System.out.println(quantPhysTeacher.getClasses());
		System.out.println(quantPhysTeacher.getLevelOfEducation());
		quantPhysTeacher.teach();
		System.out.println("---------------------------------------");

	}

}
