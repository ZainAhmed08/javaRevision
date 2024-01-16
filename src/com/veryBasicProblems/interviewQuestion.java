package com.veryBasicProblems;

public class interviewQuestion {
    public static void main(String[] args) {
        printFibanociSeries(15);
    }
    public static void printFibanociSeries(int limit){
        int[] arr = {0,1};
        int currentElement = 0;
        System.out.print(arr[0]+",");
        for(int i = 0 ; i < limit-1 ; i++){
            currentElement = arr[0]+arr[1];
            System.out.print(currentElement+",");
            arr[0] = arr[1];
            arr[1] = currentElement;
        }
    }
}
