package com.coreJava.multithreading;

public class Multithreading {
    public static void main(String[] args) {
        for(int i = 0 ; i < 5 ; i++){
            MultithreadThing multithreadThing = new MultithreadThing(i);
            multithreadThing.start();
        }
    }
}
