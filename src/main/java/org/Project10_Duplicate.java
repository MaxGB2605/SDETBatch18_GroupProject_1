package org;

public class Project10_Duplicate {
    public static void main(String[] args) {

        String[] duplicateArray = {"Max", "Yulia", "Veronika", "Vika", "Max", "Veronika", "Ava"};

        for (int i = 0; i < duplicateArray.length - 1; i++) {
            for (int j = i + 1; j < duplicateArray.length; j++) {
                if ((duplicateArray[i].equals(duplicateArray[j])) && (i != j)) {
                    System.out.println("Duplicate Element is : " + duplicateArray[j]);
                }
            }
        }
    }
}
