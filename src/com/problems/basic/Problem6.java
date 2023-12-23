package com.problems.basic;
//Problem 6: Reverse a String
//        Write a program that reverses a given string without using built-in reverse functions.
public class Problem6 {
    public static void main(String[] args) {
        String stringToBeReversed = "String";
        System.out.println(reverseString(stringToBeReversed));
    }
    public static String reverseString(String string){
        int stringLength = string.length();
        String reversedString = "";

        for(int i = 0 ; i < stringLength ; i++){
            reversedString += string.charAt(stringLength-1-i);
        }
        return reversedString;
    }
}

//---------------------

//    Nice work on solving Problem 6! Your code successfully reverses a given string without using built-in reverse functions. The logic inside the reverseString method is accurate, and your variable names are clear.
//
//        Here are a few tips for improvement:
//
//        StringBuilder for String Concatenation: While your current implementation works, using StringBuilder is more efficient for string concatenation, especially when dealing with longer strings.
//public static String reverseString(String string) {
//        int stringLength = string.length();
//        StringBuilder reversedString = new StringBuilder();
//
//        for (int i = 0; i < stringLength; i++) {
//        reversedString.insert(0, string.charAt(stringLength - 1 - i));
//        }
//
//        return reversedString.toString();
//        }
//        Handle Null or Empty Strings: Consider adding a check to handle cases where the input string is null or empty.
//public static String reverseString(String string) {
//        if (string == null || string.isEmpty()) {
//        return "Invalid input";
//        }
//
//        // Rest of the code...
//        }

