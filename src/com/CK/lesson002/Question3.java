package com.CK.lesson002;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * Dışarıdan bir isim ve bir doğum yılı alalım
         * daha sonra Mustafa 35 yaşında Ehliyet alabilir veya Mustafa 17 yaşında Ehliyet alamaz
         * Ehliyet alma koşulumuz 18 yaşından büyük olma olsun ( if else kullanmadan)
         */

        String isim, uygun;
        int dogumyili, yas;


        System.out.println("Lütfen isminizi giriniz.");
        isim = sc.nextLine();
        System.out.println("Lütfen doğum yılınızı giriniz.");
        dogumyili = sc.nextInt();
        yas = 2023 - dogumyili;
        uygun = yas >= 18 ? "ehliyet alabilir": "ehliyet alamaz";

        System.out.println(isim +" " +yas +" yaşında " +uygun);

    }
}
