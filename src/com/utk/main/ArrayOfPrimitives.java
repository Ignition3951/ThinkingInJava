/*
 * 
 */
package com.utk.main;

/**
 * The Class ArrayOfPrimitives.
 * 
 * @author UTKARSH
 */
public class ArrayOfPrimitives {

	/**
	 * This method specifies that aliasing changes the contents at both the places in java
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		int[] a1  = {1,2,3,4,5};
		
		int[] a2;
		
		a2=a1;
		
		for(int i=0;i<a2.length;i++) {
			a2[i]+=1;
		}
		
		for(int j=0;j<a1.length;j++) {
			System.out.println(a1[j]);
		}

	}

}
