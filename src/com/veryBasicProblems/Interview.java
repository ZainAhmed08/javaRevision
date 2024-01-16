package com.veryBasicProblems;

public class Interview {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13
//        int[] arr = new int[2];
//        arr[0] = 0;
//        arr[1] = 1;
//        System.out.print(arr[0] +" , ");
//        System.out.print(arr[1] +" , ");
//        for(int i = 0 ; i < 15 ; i++){
//            int currentNumber = arr[0]+arr[1];
//            System.out.print(currentNumber+" , ");
//            int temp = arr[1];
//            arr[0] = temp;
//            arr[1] = currentNumber;
        printFebanociSeries(15);
    }
    public static void printFebanociSeries(int limit){
        int[] arr = {0,1};
        int currentElement = arr[0];
        System.out.print(arr[0]+",");
        for(int i = 0 ; i < limit-1 ; i++){
            currentElement = arr[0]+arr[1];
            System.out.print(currentElement+",");
            arr[0] = arr[1];
            arr[1] = currentElement;
        }
    }
}
