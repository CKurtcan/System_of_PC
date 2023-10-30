package com.CK.lesson005;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * Dışarıdan girilen 0 ile 100 arasındaki (100) dahil
         * 5 adet sayıdan en büyük ve en küçük değeri bulup ekrana yazdıralım.
         */

        int i, enbuyuk, enkucuk, num;
        enbuyuk = 0;
        enkucuk = 999999999;
        i = 1;

        while(i <= 5){
            num = sc.nextInt();
            if(num <= 100) {
                if(num > enbuyuk){
                    enbuyuk = num;
                }
                if (num < enkucuk){
                    enkucuk = num;
                }
                i++;
            }
        }
        System.out.println("en buyuk sayı = " +enbuyuk);
        System.out.println("en kucuk sayı = " +enkucuk);

    }
}
