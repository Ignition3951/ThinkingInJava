package com.utk.ctci.chp1;

public class Example7 {
    public static void main(String[] args) {
        // Initialize a 2x2 matrix
        int[][] matrix = {
            {1, 2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int n=matrix.length;
        for(int layer=0;layer<n/2;layer++) {
        	int first=layer;
        	int last=n-layer-1;
        	for(int i=first;i<last;i++) {
        		int offset=i-first;
        		//save top
        		int top=matrix[first][i];
        		
        		// 00 30  //01 20 //02 10 //03 00
        		matrix[first][i]=matrix[last-offset][first];
        		
        		//30 33	//20 32	//10 31	//00 30
        		matrix[last-offset][first]=matrix[last][last-offset];
        		
        		//30 33	//31 23	//32 13	//33 03
        		matrix[last][last-offset]=matrix[i][last];
        		
        		//03 00	//13 01	//23 02	//33 03
        		matrix[i][last]=top;
        		
        	}
        }
        

        // Print the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

