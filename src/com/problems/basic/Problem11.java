package com.problems.basic;
//Problem 11: GCD and LCM Calculation
//        Write a program that calculates and prints the Greatest Common Divisor (GCD) and Least Common Multiple (LCM) of two given numbers.

public class Problem11 {
    public static void main(String[] args) {
        int number1 = 48;
        int number2 = 18;

        System.out.println("Thd GCD of "+number1+" and "+number2+" is : "+gcd(number1,number2));
        System.out.println("Thd LCM of "+number1+" and "+number2+" is : "+lcm(number1,number2));
    }
    public static int gcd(int number1 , int number2){
        int temp = 0;
        while(number2 != 0){
            temp = number2;
            number2 = number1%number2;
            number1 = temp;
        }
        return Math.abs(number1);
    }
    public static int lcm(int number1 , int number2){
        return Math.abs(number1*number2)/gcd(number1,number2);
    }
}

// chat gpt feedback
//    Just a small suggestion for improvement:
//
//        Method Naming: Consider using more descriptive method names, as it improves the readability of the code. Instead of gcd and lcm, you might consider something like calculateGCD and calculateLCM.
