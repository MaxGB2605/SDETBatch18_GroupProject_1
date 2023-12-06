package org;

public class Project7_Fibonacci {
    //Write a Java Program to print the first 10 numbers of Fibonacci series
    public static void main(String[] args) {

        int firstNumber = 0, secondNumber = 1;
        for (int i = 0; i <= 10; i++) {
            int nextNumber = firstNumber+secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            System.out.println(firstNumber);
        }

    }
}
