package com.DSA.java.arrays;

public class ArrayMinMaxNumber {

	public static void main(String[] args) {
		
		int[] nums = {1,3,5,9,-1,19,894,2,45,43,96};
		minMax(nums);
		
	}

	static void minMax(int[] nums) {
		int min = nums[0], max = nums[0];
		
		for(int i = 0; i<nums.length;i++) {
				
			if(nums[i]<min) {
				min=nums[i];
			}
			if(nums[i]>max) {
				max = nums[i];
			}		
			
		}
		
		System.out.println("The min number in the Array : "+min);
		System.out.println("The Max number in the Array : "+max);
	}


}
