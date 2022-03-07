package com.bridgelabz;

import java.util.Scanner;

public class QutientAndReminder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First number");
        int num1 = scan.nextInt();

        System.out.println("Enter Second number");
        int num2 = scan.nextInt();


        int result = (num1 / num2);
        System.out.println("The Quotient is: " + result);

        int result1 = (num1 % num2);
        System.out.println("The Remainder is: " + result1);
    }
}
