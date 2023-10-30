package com.CK.lesson005;

import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * Verilen kelimenin tersten yazılışını yazma.
         * Java = avaJ
         */

        int i = 0;
        String newword = "";
        String word = sc.nextLine();
        while(i < word.length()){
            newword += word.charAt(word.length()-i-1);
            System.out.print(word.charAt(word.length()-i-1));
            i++;
        }
        System.out.println();
        System.out.println(newword.toUpperCase());
    }
}
