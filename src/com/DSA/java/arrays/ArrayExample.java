package com.DSA.java.arrays;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr = new int[6];
            for(int row=0; row < arr.length;row++){
                System.out.println("Please enter the index "+row+ " data :");
                        arr[row]= in.nextInt();
                       // System.out.println("Array of index "+row+"cosists of :"+arr[row]);
                }
            for (int num : arr){//enchanced for loop
                System.out.println(num);
            }
        System.out.println("Lenght of the array :"+arr.length);

    }
}

