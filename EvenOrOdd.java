package com.bridgelabz;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Number to Check Even Or Odd");
        int n = scan.nextInt();

        if(n % 2 == 0){
            System.out.println(n+ " It is a Even Number");
        }
        else
            System.out.println(n+ " It is a Odd Number");
    }
}
