package com.java8features.streamAPI;

import java.util.Comparator;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,3,4,65,3);

        int maxNumber = list.stream().max(Integer::compareTo).orElse(null);

        System.out.println("The max number from this list is : "+maxNumber);
    }
}
