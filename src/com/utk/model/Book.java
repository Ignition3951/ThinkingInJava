//:object/Book.java
package com.utk.model;
/**
 *  Example displaying garbage collection in java
 *  Effective use of finalize() method is also displayed.
 * 
 * @author Utkarsh Srivastava
 * 
 * @author com.utk.org
 * 
 * @version 1.0
 * 
 */
public class Book {
	
	/** The checked out. */
	boolean checkedOut = false;
	 
 	/**
 	 * Instantiates a new book.
 	 *
 	 * @param checkOut the check out
 	 */
 	public Book(boolean checkOut){
		 checkedOut = checkOut;
	 }
	 
 	/**
 	 * when checks in check out becomes false.
 	 */
 	public void checkIn() {
		 checkedOut = false;
	 }
	 
 	/**
 	 * Show effective use of finalize method if object is left
 	 * and system goes for garbage collection.
 	 */
 	@Override
	protected void finalize(){
		 if(checkedOut)
			 System.out.println("Error: checked out!!!!");
	}

}
