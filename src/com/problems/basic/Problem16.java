package com.problems.basic;

import java.util.HashSet;
import java.util.Set;

//Problem 16: Unique Characters in a String
//        Write a program that checks if a given string has all unique characters.
//        "abcdefg" - All characters are unique.
//        "hello" - Contains duplicate characters ('l').
//        "12345" - All characters are unique (numeric).
//        "abcABC" - All characters are unique, including a mix of lowercase and uppercase.
//        "apple" - Contains duplicate characters ('p').
//        "xyz123" - All characters are unique, including a mix of letters and numbers.
//        "aA" - Contains duplicate characters ('a' and 'A').
public class Problem16 {
    public static void main(String[] args) {
        String inputString = "hello";
        System.out.println("the input string : "+inputString+" is uinque : "+ stringUniquenessCheck(inputString));
    }

    public static boolean stringUniquenessCheck(String inputString){
        int stringLength = inputString.length();
        Set<Character> uniqueSet = new HashSet<>();
        for(int i = 0 ; i < stringLength ; i++){
            if(!uniqueSet.contains(inputString.charAt(i))){
                uniqueSet.add(inputString.charAt(i));
            }
        }
        return uniqueSet.size()==stringLength;
    }
}

//simple chat gpt's code.
//public class UniqueCharactersInString {
//    public static boolean hasAllUniqueCharacters(String inputString) {
//        Set<Character> uniqueCharacters = new HashSet<>();
//
//        for (char character : inputString.toCharArray()) {
//            if (uniqueCharacters.contains(character)) {
//                return false;
//            } else {
//                uniqueCharacters.add(character);
//            }
//        }
//
//        return true;
//    }
//
//    public static void main(String[] args) {
//        String testString1 = "abcdefg";
//        String testString2 = "hello";
//
//        System.out.println(hasAllUniqueCharacters(testString1)); // Output: true
//        System.out.println(hasAllUniqueCharacters(testString2)); // Output: false
//    }
//}
