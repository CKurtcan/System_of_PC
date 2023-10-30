package com.CK.lesson002;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * Dışarıdan iki sayı alıp toplayalım ve daha sonra bu sayı çift ise ekrana true değerini yazdıralım.
         * (if else yapısı kullanmadan)
         */
        int sayi1, sayi2, toplam;
        boolean durum;

        System.out.println("Lütfen sayı 1 giriniz");
        sayi1 = sc.nextInt();
        System.out.println("Lütfen sayı 2 giriniz");
        sayi2 = sc.nextInt();

        toplam = sayi1 + sayi2;
        durum = toplam % 2 == 0;

        System.out.println("Durum = " +durum);
    }
}
