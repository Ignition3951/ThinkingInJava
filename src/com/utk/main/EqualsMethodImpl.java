//:object/EqualsMethodImpl.java
package com.utk.main;

import com.utk.model.ValueCompare;

/**
 * Program to provide implementation of equals() in java
 * 
 * @author UTKARSH
 * 
 * @author com.utk.org
 * 
 * @version 1.0
 * 
 */
public class EqualsMethodImpl {

	/**
	 * Entry point to class and application.
	 * 
	 * @param args array of string arguments
	 * 
	 * @throws No exceptions thrown
	 * 
	 */
	public static void main(String[] args) {
		ValueCompare obj1 = new ValueCompare();
		ValueCompare obj2 = new ValueCompare();
		
		obj1.setI(100);
		obj2.setI(100);
		
		System.out.println(obj1.equals(obj2));
		System.out.println(!obj1.equals(obj2));
		
		System.out.println(ValueCompare.class.isInstance(obj2));
		
	}

}
