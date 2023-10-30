package com.CK.lesson008;

import java.util.Scanner;

public class Question41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        1 ile 10 arasındaki sayıların çarpım tablosunu çift boyutlu bir arrayde toplayalım
         */

        String[][] multitable = new String[10][10];

        for (int i = 0; i < multitable.length; i++){
            for (int j = 0; j < multitable[i].length; j++){
                multitable[i][j] = Integer.toString(j+1) +"x" +Integer.toString(i+1)  +"=" +String.valueOf(j*i);
                System.out.print(multitable[i][j] +"    ");
            }
            System.out.println();
        }
    }
}
