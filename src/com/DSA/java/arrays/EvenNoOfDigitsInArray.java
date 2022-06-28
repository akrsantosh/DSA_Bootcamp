package com.DSA.java.arrays;

public class EvenNoOfDigitsInArray {

	public static void main(String[] args) {
		
		int[] arry = {21,345,8849,85,3475,948};
		int cnt = EvenCount(arry);
		System.out.println("Number of Even digits in the Array : "+cnt);
	}
	
	static int EvenCount(int[] arr) {
			
		int count=0;
			for(int num:arr) {
				if(even(num)){
					count++;
				}
			}
		
		
		return count;
	}

	static boolean even(int num) {
		 
		if(digitsCount(num) % 2 == 0) {
			return true;
		}
		return false;
		}
		
		
	
	static int digitsCount(int number) {
		
		int count = 0;
		while(number>0) {
			count++;
			number =number/10;
		}
		return count;
}

}
