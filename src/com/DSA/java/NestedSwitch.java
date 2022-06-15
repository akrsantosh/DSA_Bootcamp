package com.DSA.java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String dept = in.next();
      switch(empId){
          case 1:
                System.out.println("A.k.r.Santosh");
                break;
            case 2:
                System.out.println("Sangeet");
                break;
            case 3:
                System.out.println("Michael");
                switch(dept){
                    case "it": System.out.println("Information & Technology Department");
                        break;
                    case "finance": System.out.println("Finance Department");
                        break;
                    case "hr": System.out.println("Human Resource Department");
                       break;
                    default:
                        System.out.println("No department found for the entered input");
                }
                break;

            default:
                System.out.println("Please enter a valid employee ID");


        }
    }
}
