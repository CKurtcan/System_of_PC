package com.CK.lesson003;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         *
         * telefonkod mailkod başlangıc değerlerini biz kendimiz atayacağız (int)
         * daha sonra dışarıdan birtane telefon kodu alacağız bir tanede mail için kodu alacağız
         * eğer telefon kodu hatalı ise tel kodu hatalı çıktısı verelim
         * eğer mail kodu hatalı ise telefon kodu hatalı çıktısını verelim
         *
         */

        int telkod, telkoduser, mailkod, mailkoduser;

        telkod = 123;
        mailkod = 123;

        System.out.println("telefon kodunuz giriniz");
        telkoduser = sc.nextInt();

        if (telkod == telkoduser){
            System.out.println("mailkodunuz giriniz");
            mailkoduser = sc.nextInt();
            if (mailkod == mailkoduser){
                System.out.println("hoşgeldiniz");
            }else{
                System.out.println("milkodunuz yanlış");
            }
        }else{
            System.out.println("telefon kodununz yanlış");
        }
    }
}
