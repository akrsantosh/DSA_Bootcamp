package com.DSA.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDArrayList {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		
		//Initilasition of an ArrayList
		for( int i=0; i<3;i++) {
			list.add(new ArrayList<>());
			
		}
		
		
		//Adding Elements
		for( int i=0; i<3;i++) {
			
			for(int j=0;j<3;j++) {
			list.get(i).add(in.nextInt());
			}
			
		}
			System.out.println(list);
		
	}
}

