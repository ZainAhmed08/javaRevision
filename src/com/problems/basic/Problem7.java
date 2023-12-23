package com.problems.basic;
//Problem 7: Array Rotation
//        Write a program to rotate the elements of an array to the left by a given number of positions.
public class Problem7 {
    public static void main(String[] args) {
        int numberOfRotations = 0;
        int arr[] = {1,2,3,4,5,6,7,8,9};

        int resultantArray[] = rotateArray(numberOfRotations,arr);

        for(int i = 0 ; i < resultantArray.length ; i++){
            System.out.println(resultantArray[i]);
        }
    }

    public static int[] rotateArray(int numberOfRotations , int arr[]) {
        if (numberOfRotations <= 0) {
            System.out.println("Please provide a positive nonzero rotation value: " + numberOfRotations);
        }

            int arrLen = arr.length;

            for (int j = 0; j < numberOfRotations; j++) {

                int firstElement = arr[0];
                for (int i = 0; i < arrLen - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arrLen - 1] = firstElement;
            }
            return arr;
        }
}


// chat gpt feedback :
//Print Result Outside of the Method: It's a good practice to separate the logic of the method from the printing. Move the printing logic outside the method, so the method remains focused on the rotation logic.
//Use a More Descriptive Variable Name: Consider using a more descriptive variable name than arrLen, such as arrayLength.
//
//        Feel free to try more problems or let me know if you have questions about this one!