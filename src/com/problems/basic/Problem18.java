//package com.problems.basic;
//
//import java.util.HashSet;
//import java.util.Set;
//
////Problem 18: Anagram Palindrome
////        Write a program that checks if a given string can form a palindrome when rearranged.
//public class Problem18 {
//    public static void main(String[] args) {
//        String possibleAnagram = "racecar";
//
//        System.out.println(isPalindrome(possibleAnagram));
//    }
//    public static boolean isPalindrome(String possibleAnagram){
//        Set<Character> uniqueSet = new HashSet<>();
//
//        for(int i = 0 ; i < possibleAnagram.length() ; i++){
//            if(uniqueSet.contains(possibleAnagram.charAt(i))){
//                uniqueSet.add(possibleAnagram.charAt(i));
//            }
//        }
//
//        for(Character ch : uniqueSet){
//            int count = 0;
//            for(int i = 0 ; i < possibleAnagram.length() ; i++){
//                if(ch == possibleAnagram.charAt(i)){
//                    count++;
//                }
//                if(count%2 != 0 && ){
//
//                }
//            }
//        }
//    }
//}
