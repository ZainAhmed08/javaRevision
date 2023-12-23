package com.problems.basic;
//Problem 15: Substring Search
//        Write a program that finds and prints all occurrences of a given substring in a larger string.
public class Problem15 {
    public static void main(String[] args) {
        String largerString = "ababababab";
        String substring = "aba";

        findOccurrences(largerString, substring);
    }
    public static void findOccurrences(String largerString, String substring) {
        //--------:methods:-------//
        //original.contains("World")
        //original.endsWith("World")
        //original.startsWith("Hello")
        //original.lastIndexOf("l")
        //original.indexOf("World")
        //original.substring(7, 12)
        //original.substring(7)
        if(largerString.contains(substring)){
            int index = largerString.indexOf(substring);
            System.out.println(index);
            System.out.println(largerString.substring(index+1));
        }
        int count = 0;
        while(largerString.contains(substring)){
            int index = largerString.indexOf(substring);
            largerString = largerString.substring(index+1);
            System.out.println(index);
        }
    }
}
