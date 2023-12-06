package org;

public class Project5_NumberSwap {
    /*
    Write a program to swap 2 numbers without a temporary variable
     */
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Before swapping: x = " + x + ", y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping: x = " + x + ", y = " + y);
    }
}

