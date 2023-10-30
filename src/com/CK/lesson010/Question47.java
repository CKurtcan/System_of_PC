package com.CK.lesson010;

import java.util.Scanner;

public class Question47 {

    /*
        1- bir string değer alma metodu olsun
        2- iki string i karşılaştırıp doğru olup olmadığını dönen bir metod yazalım
        3- metoda girdiğimiz değerin aslında dizimizded olup olmadığını söyleyen bir metod
         */

    public static void main(String[] args) {

        String [] array = {"Türkiye","Japonya","Danimarka","Fransa"};
        System.out.println("Lütfen bir ülke girin");
        String word = new Scanner(System.in).nextLine();
        compare(takeString(),word);
        contain(array,takeString());
    }

    public static String takeString(){
        System.out.println("Lütfen bir kelime girin");
        String word = new Scanner(System.in).nextLine();
        return word;
    }

    public static boolean compare(String w1, String w2){
        return w1.equals(w2);
    }

    public static boolean contain(String[] array, String w1) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(w1)) {
                return true;
            }
        }
        return false;
    }
}
