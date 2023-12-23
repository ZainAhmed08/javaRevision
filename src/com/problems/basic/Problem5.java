package com.problems.basic;
//Problem 5: Fibonacci Series
//        Write a program to generate the first 10 numbers in the Fibonacci series.
public class Problem5 {
    public static void main(String[] args) {
        // fibonacci series : 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21

        int num1 = 0;
        int num2 = 1;
        int temp = 0;
        int iterations = 10;
        System.out.println(num1);
        System.out.println(num2);
        for(int i = 0 ; i < iterations-2 ; i++){
            temp = num1+num2;
            System.out.println(temp);
            num1 = num2;
            num2 = temp;
        }
    }
}

//----------------------------------------

//    Great work on solving Problem 5! Your code correctly generates the first 10 numbers in the Fibonacci series. The logic inside the loop is accurate, and your variable names are clear.
//
//        Here are a few tips for improvement:
//
//        Use Descriptive Variable Names: Your current variable names (num1, num2, temp, iterations) are clear, but you might consider using more descriptive names like current, next, result, and numberOfTerms.
//        Handle Edge Cases: If you want to make your program more flexible, consider adding checks for edge cases, such as when the number of terms is less than or equal to 0.
//        if (numberOfTerms <= 0) {
//        System.out.println("Number of terms should be greater than 0.");
//        return;
//        }
//        Function for Fibonacci Calculation: Consider encapsulating the Fibonacci series generation logic in a separate function for better modularity and readability.
//public class Problem5 {
//    public static void main(String[] args) {
//        generateFibonacciSeries(10);
//    }
//
//    public static void generateFibonacciSeries(int numberOfTerms) {
//        int current = 0;
//        int next = 1;
//        int result = 0;
//
//        System.out.println(current);
//        System.out.println(next);
//
//        for (int i = 0; i < numberOfTerms - 2; i++) {
//            result = current + next;
//            System.out.println(result);
//            current = next;
//            next = result;
//        }
//    }
//}

