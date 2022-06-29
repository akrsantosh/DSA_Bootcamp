package com.DSA.java;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		
		int i;
		 float d = 76.46f;
		
		Scanner in = new Scanner (System.in);
		
		i = in.nextInt();
		
		d = i/d;
		
		System.out.println("No of Dollars for "+i+"ruppes = "+d);

	}

}
