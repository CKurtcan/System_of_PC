package com.CK.lesson010;

import java.util.Arrays;

public class Question48 {

    /*
    metot veya metotlar yazarak arraydeki tek sayıları başka bir tek boyutlu arrayde toplayalım
     */
    public static void main(String[] args) {

        int[][] matrix = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },{ 189, 35, 56, 89, 8 } };

        System.out.println(Arrays.toString(oddArray(matrix)));
    }

    public static int[] oddArray(int[][] matrix){

        int lenght = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    lenght++;
                }
            }
        }

        int[] array = new int[lenght];
        int loc = 0;

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] % 2 != 0){
                    array[loc] = matrix[i][j];
                    loc++;
                }
            }
        }
        return array;
    }
}
