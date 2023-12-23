package com.problems.basic;
//Problem 3: Palindrome Check
//        Write a program to check if a given string is a palindrome.
public class Problem3 {
    public static void main(String[] args) {
        // racecar
        // 0123456  size : 7

        String palindrome = "racecar";  // insert you string here
        if(isPalindrome(palindrome)){
            System.out.println("The provided String is a palendrome: "+ palindrome);
        }else {
            System.out.println("The provided String is not a palendrome : "+palindrome);
        }

    }

    public static boolean isPalindrome(String palindrome){
        int iterations = palindrome.length()/2;
        for(int i = 0 ; i < iterations ; i++){
            if(palindrome.charAt(i) != palindrome.charAt(palindrome.length()-i-1)){
                return false;
            }
        }
        return  true;
    }
}

// feedback by chat gpt
//--------------------------
// make sure to have it uniform / make att lower or uppercase
//public static boolean isPalindrome(String palindrome) {
//    palindrome = palindrome.toLowerCase();  // or toUpperCase()
//
//    int iterations = palindrome.length() / 2;
//    for (int i = 0; i < iterations; i++) {
//        if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - i - 1)) {
//            return false;
//        }
//    }
//    return true;
//}
//-----------------------------------------
//Ignore Spaces: If you want to ignore spaces in the palindrome check, you can modify the code to skip non-alphanumeric characters.
//public static boolean isPalindrome(String palindrome) {
//    palindrome = palindrome.toLowerCase().replaceAll("[^a-z0-9]", "");
//
//    int iterations = palindrome.length() / 2;
//    for (int i = 0; i < iterations; i++) {
//        if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - i - 1)) {
//            return false;
//        }
//    }
//    return true;
//}
//----------------------------------------------

