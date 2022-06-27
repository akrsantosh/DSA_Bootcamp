package com.DSA.java.arrays;

public class ArraySreachInRange {
	


	public static void main(String[] args) {
		
		
		int[] nums = {1,3,5,9,31,19,894,2,45,43,96};
		int start = 1;
		int end = 6;
	int ans = linSearch(nums, 19,start,end);
	System.out.println(ans);

	}
	
	static int linSearch(int[] arr,int targ, int start, int end) {
		
		if(arr.length == 0) {
			return -1;
		}
		
		for (int index = start; index < end ;index++) {
		
			int ans = arr[index];
			if(ans == targ) {
				return index;
			}
			
			
		}
		return -1;
		
		
	}


}
