package com.problems.basic;
//Problem 1: Sum of Integers
//Write a program that calculates and prints the sum of integers from 1 to 100.
public class Problem1 {
    public static void main(String[] args) {
        int num = 0;
        int sum = num;

        for(int i = 0 ; i < 100 ; i++){
            num ++ ;
            sum += num ;
        }

        System.out.println("result : "+sum);
    }
}


// feedback from chat gpt
//------------------------------------------
//    int sum = 0;
//
//for (int num = 1; num <= 100; num++) {
//        sum += num;
//        }
//------------------------------------------