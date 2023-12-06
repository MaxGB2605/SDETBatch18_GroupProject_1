package org;

public class Project2_ArraySum {
    /*
    Create an array of integer values. After the array is created, calculate the
sum of all stored elements in that array.
     */

    public static void main(String[] args) {

        int[] numbers = {25, 43, 57, 12, 78, 94};
        int sum = 0;
        for (int x = 0; x < numbers.length; x++) {
            sum = sum + numbers[x];
        }
        System.out.println("The sum of all stored numbers is: " + sum);
    }
}
