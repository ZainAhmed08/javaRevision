package com.veryBasicProblems;

public class Problem1 {
    public static void main(String[] args) {
        String str = "zain";

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i < str.length() ; i++){
            stringBuilder.append(str.charAt(str.length()-1-i));
        }
        System.out.println(stringBuilder.toString());
    }
}
