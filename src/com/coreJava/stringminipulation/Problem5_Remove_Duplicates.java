package com.coreJava.stringminipulation;

import java.util.ArrayList;
import java.util.List;

//Remove Duplicates:
//Write a program to remove duplicate characters from a string.
public class Problem5_Remove_Duplicates {
    public static void main(String[] args){
        String inputString = "aabbccddeeff";

        String str = inputString.replaceAll("\\s","");

        String resultantString = "";

        List<Character> charactersList = new ArrayList<>();
        for(Character ch : str.toCharArray()){
            if(!charactersList.contains(ch)){
                charactersList.add(ch);
                resultantString += ch;
            }
        }
        System.out.println("after removing duplicates the resultantString is : "+resultantString);
    }
}
