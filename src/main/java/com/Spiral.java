package com;
//Java program to print a given matrix in spiral form 
import java.io.*;

class GFG {

	static void spiralingPrint(int rows, int cols, int a[][]) {
		int i, k = 0, l = 0;
		while (k < rows && l < cols) {
			for (i = l; i < cols; ++i) {
				System.out.print(a[k][i] + " ");
			}
			k++;
			for (i = k; i < rows; ++i) {
				System.out.print(a[i][cols - 1] + " ");
			}
			cols--;
			if (k < rows) {
				for (i = cols - 1; i >= l; --i) {
					System.out.print(a[rows - 1][i] + " ");
				}
				rows--;
			}
			if (l < cols) {
				for (i = rows - 1; i >= k; --i) {
					System.out.print(a[i][l] + " ");
				}
				l++;
			}
		}
	}

	public static void main(String[] args) {
		int Rows = 4;
		int Cols = 4;
		int a[][] = { 	{ 1, 	2, 		3, 		4 },
						{ 7, 	8, 		9, 		10 }, 
						{ 13, 	14, 	15, 	16 } ,
						{ 13, 	14, 	15, 	16 }  };
		spiralingPrint(Rows, Cols, a);
	}
}
