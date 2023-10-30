package com.CK.lesson008;

public class MultiArray {
    public static void main(String[] args) {

        /*
            0   1   2   3
        0   5   6   8   9
        1   7   7   7   7
        2   0   1   2   3
        3   .   .   .   .
        4   .   .   .   .

         */

        int[][] array = new int[5][4];

        array[0][0] = 5;
        array[0][1] = 6;
        array[0][2] = 8;
        array[0][3] = 9;
        array[1][0] = 7;
        array[1][1] = 7;
        array[1][2] = 7;
        array[1][3] = 7;
        array[2][1] = 1;
        array[2][2] = 2;
        array[2][3] = 3;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
