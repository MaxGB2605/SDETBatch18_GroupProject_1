package org;

import java.util.Scanner;

public class Project6_PrimeOrNotNumber {
    /*
    Write a java program to check whether a given number is prime or not
     */
    public static void main(String[] args) {

        Scanner newScanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int num = newScanner.nextInt();
        boolean prime = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                prime = true;
                break;
            }
        }

        if (!prime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

