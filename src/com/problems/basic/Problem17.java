package com.problems.basic;
//Problem 17: Pascal's Triangle
//Write a program to generate the first few rows of Pascal's Triangle.
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1
public class Problem17 {
    public static void main(String[] args) {
        int noOfRows = 5;

        for(int i = 0 ; i < noOfRows ; i++){
            for(int j = 0 ; j < i+1 ; j++){
                System.out.print(1+" ");
            }
            System.out.println();
        }
    }
}
