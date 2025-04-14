package com.utk.ctci.chp1;

public class Example8 {
    public static void main(String[] args) {
        // Initialize a 2x2 matrix
        int[][] matrix = {
            {1, 2,3,4},
            {5,6,7,0},
            {9,10,11,12}
        };
        
        System.out.println(matrix.length+" "+matrix[0].length);
        //If an element in the matrix is 0 then that row and column should be zero
        boolean[] zeroRows = new boolean[matrix.length];
        boolean[] zeroColumns = new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++) {
        	for(int j=0;j<matrix[0].length;j++) {
        		if(matrix[i][j]==0) {
        			zeroRows[i]=true;
        			zeroColumns[j]=true;
        		}
        	}
        }
        
        for(int i=0;i<zeroRows.length;i++) {
        	if(zeroRows[i]) {
        		for(int j=0;j<matrix[0].length;j++) {
        			matrix[i][j]=0;
        		}
        	}
        }
        
        for(int i=0;i<zeroColumns.length;i++) {
        	if(zeroColumns[i]) {
        		for(int j=0;j<matrix.length;j++) {
        			matrix[j][i]=0;
        		}
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

