package com.bridgelabz;

import java.util.Scanner;

public class PrimeFactor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. to find PrimeFactors:");
        int num = scan.nextInt();

        System.out.println("The prime factors for the " + num + " is:");

        for(int i = 2; num > 1; i ++)
        {
            while(num % i == 0) {
                System.out.println(i);
                num = num / i;
            }
        }

    }
}
