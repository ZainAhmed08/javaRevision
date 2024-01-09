package com.java8features.lambdaExpressions;

public class Main {
    public static void main(String[] args) {
// without lambda implementation
//        Cat myCat = new Cat();
//        printThing(myCat);

// with lambda implimentation
        printThing(() -> {System.out.println("Meow");});

// another lamda implimentation were implimentatioin can be stored in a variable like any other object
        Printable lambdaPrintable = () -> System.out.println("Meow");
        printThing(lambdaPrintable);


// another lamda implimentaion of another parametrized interface is f:
        ArthameticParametrisedPrintable arthameticParametrisedPrintable = (a,b) -> {
            int result = a + b;
            System.out.println("The result is : " +result);
        };
    }

    static void printThing(Printable thing){
        thing.print();
    }

    static void returnArthmaticResult(ArthameticParametrisedPrintable arthameticParametrisedPrintable,int a , int b){
        arthameticParametrisedPrintable.add(a,b);
    }
}
