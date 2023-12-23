package com.problems.basic;
//Problem 4: Prime Numbers
//        Write a program that prints all prime numbers between 1 and 50.

// left incomplete will do it later
public class Problem4 {
    public static void main(String[] args) {
        int primeNumberUpperBound  = 1;
        int primeNumberLowerBound  = 50;

        isPrimeOrNot(primeNumberUpperBound,primeNumberLowerBound);
    }
    public static void isPrimeOrNot(int primeNumberUpperBound , int primeNumberLowerBound){
        for(int currentNumber = primeNumberUpperBound ; currentNumber <= primeNumberLowerBound ; currentNumber++){
            if(currentNumber%1 == 0 && currentNumber%currentNumber == 0){
                System.out.println(currentNumber+ " is a prime number");
            }
        }

    }
}
