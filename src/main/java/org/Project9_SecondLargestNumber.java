package org;

public class Project9_SecondLargestNumber {
    //Write a java program to find the second largest number in the array
    public static void main(String[] args) {
        int[] numbers = {2, 25, 12, 61, 79, 3, 17};

        int firstLargest = 0;
        int secondLargest = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = numbers[i];
            }
        }
        System.out.println("Second largest number: " + secondLargest);
    }
}
