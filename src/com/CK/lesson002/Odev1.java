package com.CK.lesson002;

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Girilen sayının basamakları toplamını ve kaç basamaklı oldugunu ekrana yazdıralım do while ile yapalım.

        int num, i, toplam;
        i = 0;
        toplam = 0;

        System.out.println("Lütfen bir sayı giriniz.");
        num = sc.nextInt();
        do {
            i = num % 10;
            num /= 10;
            toplam += i;
        }while (num > 0);
        System.out.println("Toplam = " +toplam);
    }
}
