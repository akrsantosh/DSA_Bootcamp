package com.DSA.java;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        BigInteger a = new BigInteger(in.next());
        BigInteger b = new BigInteger(in.next());
        BigInteger add = a.add(b);
        BigInteger mul = a.multiply(b);
        System.out.println(add);
        System.out.println(mul);
            
	}

}
