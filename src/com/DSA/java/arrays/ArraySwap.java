package com.DSA.java.arrays;

import java.util.Scanner;

public class ArraySwap {

	public static void main(String[] args) {
		
		
		int[] arr = {1, 2, 3, 4, 5 , 6}; 
		
		System.out.println("Array before swapping : ");
		for(int num : arr) {System.out.println(num);}
		
		reverse(arr);
		System.out.println("Array after swapping : ");
		for(int num : arr) {System.out.println(num);}
		
		
		  
	}
	
	 static void reverse(int[] arr) {
		  
		  int start = 0;
		  int end = arr.length-1;
		 
		  while(start<end) {
			  
			  swap(arr,start,end);
			  start++;
			  end--;
			 
		  }
		  
	  }
	
	 static void swap(int[] arr, int indx1, int indx2) {
		  
		  int temp = arr[indx1];
		  arr[indx1] = arr[indx2];
		  arr[indx2] = temp;
		  
	  }

	
}