package com.problems.basic;

import java.util.ArrayList;


//Problem 8: Duplicate Elements
//        Write a program to find and print duplicate elements in an array.
public class Problem8 {
    public static void main(String[] args) {
        Integer arr[] = {1 , 2 , 3 , 4 , 2  , 5 , 2 , 4 , 9 ,8 , 1};

        printDuplicateValues(arr);
    }

    public static void printDuplicateValues(Integer arr[]){

        ArrayList<Integer> uniqueSet = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(!uniqueSet.contains(arr[i])){
                uniqueSet.add(arr[i]);
            }
        }

        for(int i = 0 ; i < uniqueSet.size() ; i++){
            int count = 0;
            for(int j = 0 ; j < arr.length ; j++){

                if(((int)uniqueSet.get(i)) == arr[j]){
                    count ++;
                }
                if(count > 1){
                    System.out.println(uniqueSet.get(i)+" is repeated in the provided array ");
                    break;
                }
            }
        }
    }
}


//-----------------------------------------------------
//Your solution for finding and printing duplicate elements in an array looks correct, and it efficiently uses an ArrayList to store unique values. However, I would like to suggest a more streamlined approach and provide a few tips for improvement:
//
//        Use Set for Uniqueness: Instead of manually checking for uniqueness using an ArrayList, you can use a Set (e.g., HashSet) to automatically keep track of unique elements.
//
//        Counting Duplicates: Instead of manually counting duplicates, you can use a Map to keep track of the frequency of each element.
//
//        Here's an updated version of your code:
//import java.util.HashSet;
//        import java.util.Set;
//
//public class Problem8 {
//    public static void main(String[] args) {
//        Integer arr[] = {1, 2, 3, 4, 2, 5, 2, 4, 9, 8, 1};
//
//        printDuplicateValues(arr);
//    }
//
//    public static void printDuplicateValues(Integer arr[]) {
//        Set<Integer> uniqueSet = new HashSet<>();
//        Set<Integer> duplicateSet = new HashSet<>();
//
//        for (Integer num : arr) {
//            if (!uniqueSet.add(num)) {
//                duplicateSet.add(num);
//            }
//        }
//
//        for (Integer duplicate : duplicateSet) {
//            System.out.println(duplicate + " is repeated in the provided array");
//        }
//    }
//}
//In this version, uniqueSet is a HashSet used to check for uniqueness, and duplicateSet is another HashSet to store duplicates. The enhanced for loop simplifies the iteration through the array.
//
//        Your initial solution works, but this alternative approach may make the code more concise and easier to understand. Feel free to use the one that suits your style and preference.
