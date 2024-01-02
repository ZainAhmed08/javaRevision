package com.coreJava.exceptionHandling;

public class ExceptionHandlingExample01 {

    public static void main(String[] args) {

        try {
        int num = Integer.parseInt("12tg3");
        System.out.println("the parsed integer is : " + num);
        }catch (NumberFormatException nfe){
            System.out.println("The number String may contain characters");
        }
    }
}
