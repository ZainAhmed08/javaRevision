package com.coreJava.stringminipulation;
import java.util.HashMap;


//Anagram Check:
//Write a program to check if two strings are anagrams of each other.
public class problem2_Anagram_Check {
    public static void main(String[] args) {
        String str1        = "listen";
        String str2        = "silent";
        boolean isAnagrame = anagrameCheck(str1,str2);

        if(isAnagrame){
            System.out.println(str1+" and "+str2+" are anagrames");
        }else {
            System.out.println(str1+" and "+str2+" are notanagrames");
        }
    }

    public static boolean anagrameCheck(String str1 , String str2){
        if(str1.length() != str2.length()){
            return  false;
        }
        HashMap<Character,Integer> characterFrequency = new HashMap<>();

        for( Character ch : str1.toCharArray()){
            characterFrequency.put(ch,characterFrequency.getOrDefault(ch,0)+1);
        }
        for( Character ch : str2.toCharArray()){
            if(characterFrequency.get(ch) == 0 || !characterFrequency.containsKey(ch)){
                return false;
            }
            characterFrequency.put(ch,characterFrequency.get(ch)-1);
        }
        return true;
    }
}
