package com.coreJava.stringminipulation;

// Count Vowels and Consonants:
// Write a program to count the number of vowels and consonants in a given string.
public class Problem4_Count_Vowels_and_Consonants {
    public static void main(String[] args) {
        String vowels = "aeiou";
        String inputString = "Hello World";

        String str = inputString.replaceAll("\\s", "");

        int vowelsCount = 0;
        int consonantsCount = 0;

        for (Character c : str.toCharArray()) {
            // Check if the character is an alphabetic character
            if (Character.isAlphabetic(c)) {
                // Check if the character is a vowel
                if (vowels.contains(c.toString().toLowerCase())) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        System.out.println("For the given string " + inputString +
                ", vowelsCount: " + vowelsCount + " and consonantsCount: " + consonantsCount);
    }
}
