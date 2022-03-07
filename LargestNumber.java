package com.bridgelabz;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First number");
        int num1 = scan.nextInt();
        System.out.println("Enter Second number");
        int num2 = scan.nextInt();
        System.out.println("Enter Third number");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " First number is largest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " Second number is largest");
        } else
            System.out.println(num3 + " Third number is largest");
    }
}
