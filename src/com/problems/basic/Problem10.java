package com.problems.basic;
//Problem 10: Bubble Sort
//        Write a program to perform a bubble sort on an array of integers.
public class Problem10 {
    public static void main(String[] args) {
        int arr[] = {4,5,3,5,2,1,7,6,8,3,0};
        bubbleSort(arr);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + "  ");
        }
    }

    public static int[] bubbleSort(int arr[]){

        for(int i = 0 ; i < arr.length ; i++){
            int temp = 0;
            for(int j = i ; j < arr.length ; j++){
                if(arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]  = temp;
                }
            }
        }
        return arr;
    }
}

// feedback from chatgpt :
//Optimization: In the current implementation, the sorting algorithm continues to iterate even if the array is already sorted. You can add a flag to check whether any swaps were made during an iteration. If no swaps were made, the array is already sorted, and you can break out of the loop.