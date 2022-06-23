package com.DSA.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {

		int[][] arr2 = new int[4][4];
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the input : ");
		
		
		//input
		for(int row=0;row<arr2.length;row++) {
			
			for(int col =0;col < arr2[row].length;col++) {
				arr2[row][col] = in.nextInt();
				
			}
			
		}
		
		//output
		for(int[] matrix :arr2)
		{
			System.out.println(Arrays.toString(matrix));	
		}
		
		
		
	}

}
