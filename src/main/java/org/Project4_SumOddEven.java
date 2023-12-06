package org;

public class Project4_SumOddEven {
    /*
    Create a 2D array of integers. Develop a program which will calculate the
sum of even and odd numbers for that array
     */
    public static void main(String[] args) {
        int[][] numbersArray = {
                {10, 23, 36, 3},
                {4, 15, 6, 9},
                {7, 28, 91, 5}
        };

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = 0; j < numbersArray[i].length; j++) {
                if (numbersArray[i][j] % 2 == 0) {
                    sumEven += numbersArray[i][j];
                } else {
                    sumOdd += numbersArray[i][j];
                }
            }
        }
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}
