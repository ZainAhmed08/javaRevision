package com.java8features.streamAPI;

import java.util.Objects;
import java.util.stream.Stream;

public class Example2_StreamObject {
    public static void main(String[] args) {
        //creating stream of objects :
        Stream<Objects> emptyStream = Stream.empty();
        emptyStream.forEach(e -> {
            System.out.println(e);
        });
    }
}
