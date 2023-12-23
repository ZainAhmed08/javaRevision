package com.problems.basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//Problem 12: String Anagrams
//        Write a program that checks if two given strings are anagrams of each other.
//Anagrams are formed by rearranging the letters of one word or phrase to create another word or phrase.
//        In the context of this problem, spaces and punctuation should be ignored, and only the frequency of letters matters.
//Example:        For the input strings "listen" and "silent," the program should output that they are anagrams.
//Approach:You can approach this problem by comparing the character frequencies in both strings. If the frequency of each letter is the same in both strings, they are anagrams.
//------------------------------------------------------------------------------------------------------
//        Pair: "listen" and "silent"
//        Pair: "debit card" and "bad credit"
//        Pair: "astronomer" and "moon starer"
//        Pair: "The Morse Code" and "Here come dots"
//        Pair: "Eleven plus two" and "Twelve plus one"
//        Pair: "Tea" and "Eat"
//        Pair: "abc" and "cba"
//        Pair: "hello" and "world"
//        Pair: "java" and "python"
//        Pair: "programming" and "gogramminmpr"

// note : for this problem i have not considerd spaces or upper or lower case might come back to thing as complete that nuance
public class Problem12 {
    public static void main(String[] args) {
        String string1 = "listen";
        String string2 = "silent";

        System.out.println("are both strings anagrams of each other ? : "+areBothStringsAnagrams(string1,string2));
    }

    public static boolean areBothStringsAnagrams(String string1 , String string2){

        if(string1.length() != string2.length()){
            return false;
        }
        Set<Character> set = new HashSet<>();

        for(int i = 0 ; i < string1.length() ; i++){
            if(!set.contains(string1.charAt(i))){
                set.add(string1.charAt(i));
            }
        }

        for (Character currentCharacter : set) {
            char ch = currentCharacter; // unboxing form warper to primitive class
            int fzOfString1Char = 0;
            int fzOfString2Char = 0;

            for(int i = 0 ; i < string1.length() ; i++){
                if(ch == string1.charAt(i)){
                    fzOfString1Char++;
                }
                if(ch == string2.charAt(i)){
                    fzOfString2Char++;
                }
            }
            if(fzOfString1Char != fzOfString2Char){
                return false;
            }
        }
        return true;
    }
}

//--------------------------------------------------------------
//Your implementation looks good for checking if two given strings are anagrams of each other. You've used a HashSet to store unique characters from the first string, and then you iterate over these characters to compare their frequencies in both strings.
//
//        Here are a couple of suggestions:
//
//        Consider Case Insensitivity:
//
//        In the context of anagrams, it's common to consider case-insensitivity. You might want to convert both strings to lowercase (or uppercase) before performing the comparison to ensure that "Tea" and "Eat" are recognized as anagrams.
//        Handling Spaces and Punctuation:
//
//        The problem statement mentions that spaces and punctuation should be ignored. If you want to handle this nuance, you might consider removing spaces and punctuation from both strings before performing the comparison.
//        Here's an updated version of your code considering case-insensitivity:
//---------------------------------------------------------------
//import java.util.HashSet;
//        import java.util.Set;
//
//public class Problem12 {
//    public static void main(String[] args) {
//        String string1 = "Listen";
//        String string2 = "Silent";
//
//        System.out.println("Are both strings anagrams of each other? : " + areBothStringsAnagrams(string1, string2));
//    }
//
//    public static boolean areBothStringsAnagrams(String string1, String string2) {
//        if (string1.length() != string2.length()) {
//            return false;
//        }
//
//        Set<Character> uniqueCharacters = new HashSet<>();
//        for (int i = 0; i < string1.length(); i++) {
//            char currentChar = Character.toLowerCase(string1.charAt(i));
//            if (!Character.isWhitespace(currentChar)) {
//                uniqueCharacters.add(currentChar);
//            }
//        }
//
//        for (char currentChar : uniqueCharacters) {
//            int freqInString1 = countFrequency(string1, currentChar);
//            int freqInString2 = countFrequency(string2, currentChar);
//
//            if (freqInString1 != freqInString2) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    private static int countFrequency(String str, char target) {
//        int frequency = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(target)) {
//                frequency++;
//            }
//        }
//        return frequency;
//    }
//}

//    This updated version considers case-insensitivity and ignores spaces while checking for anagrams. If you have any further questions or if there's anything else I can help you with, feel free to ask!