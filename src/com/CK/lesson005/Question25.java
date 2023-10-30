package com.CK.lesson005;

import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * Dışarıdan bir kelime girelim bu kelime içerisinde girdiğimiz harf kaç tane var bulalım
         */

        String word, character;
        int k = 0;

        System.out.println("Kelimeyi girin:");
        word = sc.nextLine();

        System.out.println("Aranacak karakteri girin:");
        character = sc.nextLine();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == character.charAt(0)) {
                k++;
            }
        }
        System.out.println("Karakter " + character + ", kelime içinde " + k + " kez bulundu.");
    }
}
