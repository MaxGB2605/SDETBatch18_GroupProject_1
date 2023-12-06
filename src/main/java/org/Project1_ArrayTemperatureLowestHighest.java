package org;

public class Project1_ArrayTemperatureLowestHighest {
/*
Create a program that uses an array to store a list of temperatures for a week,
and then uses a loop to find the highest and lowest temperature for the week
 */
    public static void main(String[] args) {
        int[] temperature = {35, 42, 37, 36, 50, 29, 34};

        int highest = temperature[0], lowest = temperature[0];
        for (int x = 0; x < temperature.length; x++) {
            if (temperature[x] > highest) {
                highest = temperature[x];
            }
            if (temperature[x] < lowest) {
                lowest = temperature[x];
            }
        }
        System.out.println("Highest temperature is " + highest);
        System.out.println("Lowest temperature is " + lowest);
    }
}
