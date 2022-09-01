package com.DSA.Leetcode.Arrays;

public class RunningSumOf1DArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
	 
			System.out.println(runningSum(arr));
	
	}
public static int[] runningSum(int[] nums) {
        
        int[] nums2 = new int[nums.length];
        int y =0;
        
        for(int i=0;i<=nums.length-1;i++){
            
            
            for(int j = i ; j <= i; j++){
                  
            	 y += nums[j];
                 
            }
            
            nums2[i] = y;
              
        }
        
        return nums2;   
    }


	

}
