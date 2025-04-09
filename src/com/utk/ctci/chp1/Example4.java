package com.utk.ctci.chp1;

public class Example4 {

	public static void main(String[] args) {
		String str = "atco cta";
		
		//build frequency table of character
		int[] frequencyArray = buildFrequencyTable(str);
		// check if more than one character has an odd count
		System.out.println("Is the string a palindrome permutation ? "+checkPalindromePermutation(frequencyArray));
	}
	
	public static int[] buildFrequencyTable(String str) {
		int[] array = new int[26];
		int startingPoint = Character.getNumericValue('a');
		int endingPoint = Character.getNumericValue('z');
		for(char ch: str.toCharArray()) {
			if(Character.getNumericValue(ch)>=startingPoint && Character.getNumericValue(ch)<=endingPoint) {
				array[Character.getNumericValue(ch)-startingPoint]++;
			}
		}
		return array;
	}
	
	public static boolean checkPalindromePermutation(int[] array) {
		boolean flag = false;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==1) {
				if(flag) {
					return false;
				}
				flag = true;
			}
		}
		return true;
	}

}
