package com.utk.ctci.chp1;

public class Example6 {

	public static void main(String[] args) {
		String str="abcdee"; //aabcccccaaa abcdee
		System.out.println(compressString(str));
	}
	
	public static StringBuilder compressString(String str) {
		int count=1,compressedStringLen=0;
		StringBuilder compressedString = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if((i+1)>=str.length() || str.charAt(i+1)!=str.charAt(i)) {
				String tmp = ""+str.charAt(i)+count;
				compressedString=compressedString.append(tmp);
				count=1;
				compressedStringLen++;
			}else {
				count++;
			}
		}
		if(compressedStringLen==str.length())
			return new StringBuilder(str);
		return compressedString;
	}

}
