package com.coreJava.stringminipulation;
//Palindrome Check:
//Write a program to check if a given string is a palindrome.
public class Problem3_Palindrome_Check {
    public static void main(String[] args){
        String str = "raceacar";
        boolean isPalendrome = true;
        for(int i = 0; i < str.length()/2 ; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                isPalendrome = false;
                break;
            }
        }
        if(isPalendrome){
            System.out.println(str+" is palendrome");
        }else{
            System.out.println(str+" is not a palendrome");
        }
    }
}
