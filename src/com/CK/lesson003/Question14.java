package com.CK.lesson003;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * Pizza boyu seçme yapacağız
         * s küçük
         * m orta
         * l büüyk
         * xl ekstra büyül
         */
        String secim;

        secim = sc.nextLine();

        switch (secim){
            case "s":
                System.out.println(secim +" boy pizza seçtiniz"); break;
            case "m":
                System.out.println(secim +" boy pizza seçtiniz"); break;
            case "l":
                System.out.println(secim +" boy pizza seçtiniz"); break;
            case "xl":
                System.out.println(secim +" boy pizza seçtiniz"); break;
            default:
                System.out.println("yanlış seçim yaptınız");
        }
    }
}
