package com.java8features.streamAPI;

import java.util.List;

public class Example3_methods {
    public static void main(String[] args) {
        //filter(predicate) : here predicate means boolean valued function.
        //map : perform operation on elements
        List<String> list = List.of("ankit","anitha","ankitha","anvesh","arun","ayesha","aliya");

        list.forEach(System.out::println);
    }
}
