package com.DSA.java;

import java.util.Scanner;

public class Calculator {

	
	public static void main(String[] args) {
		
		 int ans =0;
		
		while(true) {
			Scanner in = new Scanner (System.in);
			System.out.print("Enter the operator : ");
			
			char op = in.next().trim().charAt(0);
			
			if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%') {
				
				System.out.print("Enter two numbers : ");	
			int num1 = in.nextInt();
			int num2 = in.nextInt();
			
			if (op == '+') {
				
				ans = num1 + num2;
			}
			
			if (op == '-') {
				
				ans = num1 - num2;
			}
			
			if (op == '*') {
				
				ans = num1 * num2;
			}
			
			if (op == '/') {
				if(num2 != 0) {
					
					ans = num1 / num2;
				}
				else {
					
					System.out.println("Can't divide by 0");
				}
				
			}
			
			if (op == '%') {
				ans = num1 % num2;
				
			}
		}
			
			else if (op == 'x' || op == 'X') {
				System.out.println("Operation ended run the application again");
				break;
				
			}
			else {
				System.out.println("Invalid Operator");
			}
			
			System.out.println(+ans);
			
		}

	}

}
