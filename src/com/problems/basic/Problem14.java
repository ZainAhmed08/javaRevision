package com.problems.basic;
//Problem 14: Matrix Multiplication
//        Write a program that multiplies two matrices of appropriate dimensions.
public class Problem14 {
    public static void main(String[] args) {
        int matrixA[][] = {{1,2,3},{1,2,3},{1,2,3}};
        int matrixB[][] = {{4,5,6},{4,5,6},{4,5,6}};

        int resultantMatrix[][] = multiplyMatrices(matrixA,matrixB);
        for(int i = 0 ; i < resultantMatrix.length ; i++){
            for(int j = 0 ; j < resultantMatrix.length ; j++){
                System.out.print(resultantMatrix[i][j]+" , ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int matrixA[][] , int matrixB[][]){
        int resultantMatrix[][] = {{0,0,0},{0,0,0},{0,0,0}};
        int sum = 0;
        for(int i =  0; i < matrixA.length ; i++){
            for(int j = 0; j < matrixB.length ; j++){
                for(int k = 0 ; k < matrixB.length ; k++){
                    sum += (matrixA[i][k]*matrixB[k][j]);
                }
                resultantMatrix[i][j] = sum;
                sum = 0;
            }
        }
        return resultantMatrix;
    }
}
