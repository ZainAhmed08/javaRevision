package com.coreJava.stringminipulation;
//Reverse a String:
//Write a program to reverse a given string without using built-in reverse functions.
public class Reverse_a_String {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        String reversedStr = "";
        System.out.println("before reversal : "+str);
        for(int i = str.length()-1 ; i >= 0 ; i--){
            reversedStr+=str.charAt(i);
        }
        System.out.println("after reversal : "+reversedStr);
    }
}
