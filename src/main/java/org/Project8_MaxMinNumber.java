package org;

public class Project8_MaxMinNumber {
    //Maximum and minimum number in the array
    public static void main(String[] args) {
        int[] numbers = {15, 18, 20, 35, 90, 3,1};

        int max = 0;
        int min = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else {
                min = numbers[i];
            }
        }
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
