package com.problems.basic;
//Problem 2: Factorial
//        Write a program that calculates the factorial of a given number.
public class Problem2 {
    public static void main(String[] args) {
        int fact = 4;
        int result = 1;

        for(int i = 1 ; i <= fact ; i++){
            result *= i;
        }

        System.out.println("The factorial of the number "+fact+" is : "+ result);
    }
}
