package com.bridgelabz.com.bridgelabz;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a year for check leap year or not: ");
        int year = scan.nextInt();

        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("It Is A Leap Year");
        }
        else
        {
            System.out.println("It Is Not A Leap Year");
        }
    }
}
