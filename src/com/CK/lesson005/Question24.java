package com.CK.lesson005;

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * Dışarıdan bir kelime girelim bu kelime içerisinde aradığımız harf kaç tane var bulalım
         */

        String word;
        int k = 0;
        String character = "a";

        System.out.println("Kelimeyi girin:");
        word = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            String value1 = Character.toString(character.charAt(i));
            if (value1 == character) {
                k++;
            }
        }
        System.out.println("Karakter " + character + ", kelime içinde " + k + " kez bulundu.");

/**
        String word, character;
        int i = 0;
        int k = 0;

        word = sc.nextLine();
        character = sc.nextLine();

        while(i < word.length()){
            if(word.contains(character)){
                k++;
            }
            i++;
       }
 */
    }
}
