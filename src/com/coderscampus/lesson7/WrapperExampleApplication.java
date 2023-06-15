package com.coderscampus.lesson7;

public class WrapperExampleApplication {

	public static void main(String[] args) {

		/**
		 * PRIMITIVES   WRAPPER CLASSES (OBJECT EQUIVALENT TO PRIMATIVES) 
		 * byte     ->  Byte
		 * short    ->  Short 
		 * int      ->  Integer 
		 * long     ->  Long 
		 * float    ->  Float 
		 * double   ->  Double
		 * boolean  ->  Boolean 
		 * char     ->  Character
		 */

		// AUTO-BOXING
		int primitiveInt = 8;

		/**
		 * Autoboxing is the automatic conversion that the Java compiler makes between
		 * the primitive types and their corresponding object wrapper classes.
		 */
		Integer wrapperInt = 9;
		Integer anohterIntWrapper = Integer.valueOf(8);
		
		
		// UN-BOXING
		primitiveInt = Integer.valueOf(9);
		
		
		

		// The benefit of using the Wrapper Class is the availability of
		// having access to lots of class functionality.

		String someNumber = "123";
		String someOtherNumber = "456";
		System.out.println(someNumber + someOtherNumber);
		System.out.println(Integer.parseInt(someNumber) + Integer.parseInt(someOtherNumber));

		
		
		
		// A safer way to do string comparison to avoid
		// a NullPointerExcpetion
		if ("456".equals(someNumber)) {
			System.out.println("Do something");
		}

		
		
		// A safer way to do Boolean evaluation to avoid
		// a NullPointerExcpetion
		Boolean someBoolean = null;
		//   (Does Boolean True equal Null?)
		if (Boolean.TRUE.equals(someBoolean)) {
			System.out.println("TRUE");
		} else {
			// No? Ok, print out "FALSE"
			System.out.println("FALSE");
		}
		
		long firstLong = 10L;
		long secondLong = 10L;
		
		if (firstLong == secondLong) {
			System.out.println("Primative long comparison works");
		}
		
//		Long firstLongWrapper = 10L;
//		Long secondLongWrapper = 10L;
		
		Long firstLongWrapper = new Long(10);
		Long secondLongWrapper = Long.valueOf(10);
		
//		if (firstLongWrapper == secondLongWrapper) {
//			System.out.println("Object wrapper Long comparions works");
//		} else {
//			System.out.println("Object wrapper Long comparison DOES NOT WORK");
//		}
	
		// Here's a typical 'Gotcha' scenario... when comparing object 
		// wrapper values, be sure to use .equals(), not ==
		if (firstLongWrapper.equals(secondLongWrapper)) {
			System.out.println("Object wrapper Long comparions works");
		} else {
			System.out.println("Object wrapper Long comparison DOES NOT WORK");
		}

	}

}
