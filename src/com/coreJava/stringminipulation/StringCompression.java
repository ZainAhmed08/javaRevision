package com.coreJava.stringminipulation;

public class StringCompression {
    public static void main(String[] args) {
        String input = "aabcccccaaa";
        String compressed = compressString(input);
        System.out.println("Compressed string: " + compressed);
    }

    public static String compressString(String input) {
        StringBuilder compressedStringBuilder = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                // Increment count if consecutive characters are the same
                count++;
            } else {
                // Append character and count to the compressed string
                compressedStringBuilder.append(input.charAt(i));
                compressedStringBuilder.append(count);
                count = 1; // Reset count for the new character
            }
        }

        // Append the last character and its count
        compressedStringBuilder.append(input.charAt(input.length() - 1));
        compressedStringBuilder.append(count);

        // Return the compressed string only if it is shorter than the original
        return compressedStringBuilder.length() < input.length() ? compressedStringBuilder.toString() : input;
    }
}
