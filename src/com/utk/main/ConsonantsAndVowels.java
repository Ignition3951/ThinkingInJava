//:object/ConsonantsAndVowels.java
package com.utk.main;

import java.util.Random;

public class ConsonantsAndVowels {

	/**
	 * Program defines that if even a single condition passes the case executes after that till the break statement is found.
	 * So we can group all similar conditions as described on the below program.
	 * 
	 * @author UTKARSH
	 * 
	 * @param args the arguments
	 * 
	 * @exception no exceptions thrown
	 */
	public static void main(String[] args) {
		
		Random random = new Random(47);
		for(int i=0;i<100;i++) {
			int c='a' + random.nextInt(26);
			System.out.print((char)c+","+c+" : ");
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Vowel");
				break;
			case 'y':
			case 'w':
				System.out.println("Sometimes Vowel");
				break;
			default: System.out.println("Consonant");
				
			}
			
		}

	}

}
