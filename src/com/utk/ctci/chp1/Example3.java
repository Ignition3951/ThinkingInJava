package com.utk.ctci.chp1;

public class Example3 {
	
	public static void main(String[] args) {
		
		String str = "Mr John S mith      ";
		int trueLength = 13;
//		str=str.trim();
//		str=str.replaceAll("\\s", "%20");
//		System.out.println("Converted String is : "+str);
		char[] replacedArray=replaceAll(str.toCharArray(), trueLength);
		String replacedString = new String(replacedArray);
		System.out.println("Replaced string is : "+replacedString);
	}
	
	public static char[] replaceAll(char[] array,int trueLength) {
		int spaceCount=0,index,i=0;
		for(i=0;i<trueLength;i++) {
			if(array[i]==' ') {
				spaceCount++;
			}
		}
		index=trueLength+(spaceCount*2);
		char[] modifiedArray = new char[index];
		if(trueLength<array.length) array[trueLength]='\0';
		for(int j=trueLength-1;j>=0;j--) {
			if(array[j]==' ') {
				modifiedArray[index-1]='0';
				modifiedArray[index-2]='2';
				modifiedArray[index-3]='%';
				index-=3;
			}else {
				modifiedArray[index-1]=array[j];
				index--;
			}
		}
		return modifiedArray;
	}

}
