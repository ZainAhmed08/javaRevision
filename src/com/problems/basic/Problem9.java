package com.problems.basic;
//Problem 9: Armstrong Number
//        Write a program to check if a given number is an Armstrong number.
public class Problem9 {
    public static void main(String[] args) {
        int num = 153;

        if(isArmstrongNumberOrNot(num)){
            System.out.println(num+" is an armstrong number ");
        }else {
            System.out.println(num+" is not an armstrong number");
        }
    }

    public static boolean isArmstrongNumberOrNot(int num){

        int temp = num;
        int power = 0;
        int sum = 0;
        while(temp != 0){
            power++;
            temp/=10;
        }
        temp = num;
        while(temp != 0){
            int rem = temp%10;
            int product = 1;
            for(int i = 0 ; i < power ; i++){
                product *= rem;
            }
            sum += product;
            temp/=10;
        }
        if(sum == num){
            return true;
        }else{
            return false;
        }
    }
}

//-------------------------------
//Avoid Unnecessary If-Else: Instead of explicitly returning true or false based on the condition, you can directly return the result of the comparison.
//return sum == originalNumber;
