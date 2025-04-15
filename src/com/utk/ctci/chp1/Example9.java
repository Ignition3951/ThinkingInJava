package com.utk.ctci.chp1;

public class Example9 {

	public static void main(String[] args) {
		String str1 = "waterbottle";// waterbottle
		String str2 = "erbottlewat";// erbottlewat

		String enhanced = str1 + str1;
		System.out.println("Is string rotation ? " + isSubstring(enhanced, str2));
	}

	public static boolean isSubstring(String superString, String subString) {
		int count = 0;
		for (int i = 0; i < superString.length(); i++) {
			if (subString.charAt(0) == superString.charAt(i)) {
				for (int j = 0; j < subString.length(); j++) {
					if (superString.charAt(i + j) == subString.charAt(j)) {
						count++;
					} else {
						count = 0;
					}
				}
				return count == subString.length() ? true : false;
			}

		}
		return false;
	}

}
