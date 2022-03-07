package com.bridgelabz;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = scan.nextInt();

        System.out.println("Enter Second Number");
        int num2 = scan.nextInt();

        System.out.println("Before Swapping the value of Numbers is ");
        System.out.println("num1 = "+ num1 +"  num2 = " + num2);

        int result;
        result = num1;
        num1 = num2;
        num2 = result;

        System.out.println("After Swapping the value of Numbers is ");
        System.out.println("num1 = "  + num1 + "  num2 = " +num2);


    }
}
