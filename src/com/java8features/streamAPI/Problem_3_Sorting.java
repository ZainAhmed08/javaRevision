package com.java8features.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Problem 3: Sorting
//Given a list of strings, sort them in ascending order based on their length.
public class Problem_3_Sorting {
    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("zain");
        listOfStrings.add("ayesha");
        listOfStrings.add("ajju");
        listOfStrings.add("hajara");
        listOfStrings.add("khatija");
        listOfStrings.add("amani");
        listOfStrings.add("enas");
        listOfStrings.add("a");
        listOfStrings.add("abcdefghijklmnop");

        List<String> lengthWiseSortedList = listOfStrings.stream().sorted((s1,s2) -> Integer.compare(s1.length(),s2.length())).collect(Collectors.toList());
        System.out.println(lengthWiseSortedList);

    }
}
