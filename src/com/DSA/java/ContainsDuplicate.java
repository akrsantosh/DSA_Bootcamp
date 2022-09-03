package com.DSA.Leetcode.ProblemSolving;

import java.util.Arrays;

public class ContainsDuplicate {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,1};
			
		Boolean result = containsDuplicate(arr);
		System.out.println(result);
	}


	//Solution1
	 public static boolean containsDuplicate(int[] nums) {
	        int i =0;
	        
	        while(i<=nums.length-1){
	        	int x = nums[i];
	            for(int j=i;j<nums.length-1;j++) {
	            	if(x == nums[j+1]) {
	            		return true;
	            	}
	            }
	        	i++;
	            
	        }
			return false;
	        
	    }
	 
	 //Solution2
	 public boolean containsDuplicate2(int[] nums) {
	        if (nums == null || nums.length < 2) {
	            return false;
	        }

	        Arrays.sort(nums);

	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] == nums[i - 1]) {
	                return true;
	            }
	        }

	        return false;
		    
	    }
	
}
