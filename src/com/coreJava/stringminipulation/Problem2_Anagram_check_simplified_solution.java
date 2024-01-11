package com.coreJava.stringminipulation;
import java.util.HashMap;
//Anagram Check:
//Write a program to check if two strings are anagrams of each other.
public class Problem2_Anagram_check_simplified_solution {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean isAnagram = areAnagrams(str1, str2);

        if (isAnagram) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> charFrequency = new HashMap<>();

        for (char ch : str1.toCharArray()) {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str2.toCharArray()) {
            if (!charFrequency.containsKey(ch) || charFrequency.get(ch) == 0) {
                return false;
            }
            charFrequency.put(ch, charFrequency.get(ch) - 1);
        }

        return true;
    }
}
