package com.java8features.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {
    public static void main(String[] args) {
        // create a list and filter all even number form list
        List<Integer> list1 = Arrays.asList(12,34,53,34,64,33,65);

        // filtering even number from the list and adding to a fresh list
        List<Integer> evenList = new ArrayList<>();

        // without stream api :
        for(int n : list1){
            if(n %2==0){
                evenList.add(n);
            }
        }
        System.out.println(evenList);

        evenList.clear();

        // with stream api :
        Stream<Integer> stream = list1.stream();
        evenList = stream.filter(n -> n%2==0).collect(Collectors.toList());
        System.out.println(evenList);

        //using stream take return a list containing number grater than 50
        List<Integer> graterThan50List = list1.stream().filter(n -> n>50).collect(Collectors.toList());
        System.out.println(graterThan50List);

        // Stream opertaion on array
        String[] str = {"zain","Ahmed","Ayesha","Farhaan","Shahistha","sadiya"};
        Stream<String> arrayStream = Stream.of(str);
        arrayStream.map(s -> s.toLowerCase()).filter(s -> s.startsWith("s")).forEach(e -> {
            System.out.println(e);
        });
    }
}
