package com.CK.lesson005;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * Dışarıdan bir kelime gireceğiz ve her harfin başına bir index numarası gelecek şekilde alt alta yazdıracağız
         *
         * 0-j
         * 1-A
         * 2-V
         * 3-A
         */

        String word;
        int i;
        i=0;

        word = sc.nextLine();
        String[] array = word.split("");

        while(i < word.length()){
            System.out.println(i+ "- " + array[i]);
            i++;
        }
    }
}