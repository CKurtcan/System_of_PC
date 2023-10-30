package com.CK.lesson003;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * telefonkod mailkod başlangıc değerlerini biz kendimiz atayacağız (int)
         * daha sonra dışarıdan birtane telefon kodu alacağız bir tanede mail için koda
         * alacağız
         * ikiside dogru ise sisteme kayıt oldunuz telefon dogru email yanlış ise =>
         * email kodu hatalıdır email dogru telefon yanlış ise => telefon kdou hatalıdır
         * ikiside yanlış ise => telefon ve email kodu hatalıdır
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
                System.out.println("sisteme kayıt oldunuz");
            }else{
                System.out.println("milkodunuz yanlış");
            }
        }else{
            System.out.println("telefon kodununz yanlış");
        }
    }
}
