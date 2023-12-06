package org;

public class Project3_ArrayOddEvenNumbers {
    /*
        Create a 2D array or integer type where you will store odd and even
    numbers. Develop a program which will identify/print the even numbers
    only
         */
    public static void main(String[] args) {
        int[][] numbers = {
                {3, 6, 45, 76, 80, 91},
                {32, 59, 68, 24, 36, 1},
                {4, 37, 98, 95, 39, 99}
        };
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                if (numbers[row][column] % 2 == 0) {
                    System.out.print(numbers[row][column] + " ");
                }
            }
            System.out.println();
        }
    }
}
