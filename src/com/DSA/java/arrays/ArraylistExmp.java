package com.DSA.java.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExmp {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(72);
		list.add(998);
		list.add(21);
		list.add(827);
		list.add(3425);
		list.add(54);
		list.add(218);
		list.add(274);
		list.add(26);
		
		System.out.println(list.size());
		if (list.size()>8) {
			
			System.out.println("List is full");
		}
		else { 
			
			System.out.println("List is not full");
		}
	}

}
