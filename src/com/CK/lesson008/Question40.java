package com.CK.lesson008;

import java.util.Scanner;

public class Question40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        * - Türkçe karakterleri inglizce karakterler çevirme
        * 'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö'
        * bir metot ile bu işlemi yapalım metot içerisinde dıaşırıdan bir kelime alacagız
        * bu kelime içerisinde geçen türkçe karakterleri ing karakterlere dönüştüreceğiz ;
        *
        */

        String word = sc.nextLine();
        char[] letters = {'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö'};
        char[] ingletters = {'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O'};
        for (int i = 0; i < letters.length; i++){
            word = word.replace(letters[i],ingletters[i]);
        }
        System.out.println(word);
    }
}
