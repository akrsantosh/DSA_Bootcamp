package com.DSA.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {

	public static void main(String[] args) {
		
		int[][] arr2 = {{23, 45, 64,}, {43, 69, 87,}, {678, -2, 3 ,8}, {19, 24, 72,}};
		Scanner in = new Scanner(System.in);
		System.out.print("Please Enter the target number:");
		int Target = in.nextInt();
		int[] arr = search(arr2, Target);
		System.out.println(Arrays.toString(arr));
	}
	
static int[] search(int[][] arr2, int Target ){
		
		for(int row=0;row<arr2.length;row++) {
			
			for(int col =0;col < arr2[row].length;col++) {
				
				if ( arr2[row][col] == Target) {
					
					return new int[] {row,col};
					
				}
			
			}
		}
		return new int[] {-1,-1};		

}

}