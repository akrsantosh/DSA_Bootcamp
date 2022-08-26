package com.DSA.Leetcode.Arrays;

public class BinarySerach {

	public static void main(String[] args) {
		
		int[] arry = {0,1,2,3,4,5,6,7,8};
		search(arry, 0);
	}

	 public static int search(int[] nums, int target) {
         int start = 0;
         int end = nums.length-1;
        
    while( start <= end){
    	int mid = start+ (end -start)/2;
        if(target > nums[mid]){
            start = mid+1;
        }
        else if(target < nums[mid]){
            end = mid-1;
        }
        else if(target == nums[mid]){
        	System.out.println("Target = "+target+ " Middle element = "+ mid);
                return mid;
                
            }

}
   	return -1;
    	
 
}
}
