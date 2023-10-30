package com.CK.lesson002;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * bir ürün fiyatında %18 kdv %15 kar payı olduğunu biliyoruz bu ürünün son fiyatı elimizde olsun daha sonra bu
         * ürün fiyatı üzerinden ürünün ham fiyatı ve kdvsiz fiyatı bulalım.
         */

        double price, wotax, worev;
        System.out.println("Lütfen fiyat giriniz.");
        price = sc.nextDouble();

        wotax = price / 1.18;
        worev = wotax / 1.15;
        System.out.println("KDV'siz Fiyatı = " +wotax);
        System.out.println("Ham Fiyatı = " +worev);
        // sayı alma değerlerinden sonra sc.nextLine girilierek bug düzeltilir
        sc.nextLine();
        System.out.println("Lütfen bir isim giriniz");
        String isim = sc.nextLine();
        System.out.println("Lütfen bir soyisim giriniz");
        String soyisim = sc.nextLine();
        System.out.println("isim=" +isim +" " +soyisim);
        System.out.println("Bir double değer giriniz");
        double sayi1 = sc.nextDouble();
        System.out.println("Bir int değer giriniz");
        int sayi2 = sc.nextInt();
        // sayı alma değerlerinden sonra sc.nextLine girilierek bug düzeltilir
        sc.nextLine();
        System.out.println("Lütfen bir ülke giriniz");
        String ulke = sc.nextLine();
    }
}
