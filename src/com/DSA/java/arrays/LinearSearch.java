package com.DSA.java.arrays;

public class LinearSearch {

	public static void main(String[] args) {
		
		
		int[] nums = {1,3,5,19,9,31,894,2,45,43,96};
	int ans = linSearch(nums, 19);
	System.out.println(ans);

	}
	
	static int linSearch(int[] arr,int targ) {
		
		if(arr.length == 0) {
			return -1;
		}
		
		for (int index =0; index < arr.length;index++) {
		
			int ans = arr[index];
			if(ans == targ) {
				return index;
			}
			
			
		}
		return -1;
		
		
	}

}
