package com.CK.lesson003;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * Dışarıdan bir taben ve üst değeri alıp sonucunu bulalım. 2^3
         */

        int s1, s2, sum, i;
        i = 1;
        sum = 1;
        System.out.println("taban değer giriniz");
        s1 = sc.nextInt();
        System.out.println("tavan değer giriniz");
        s2 = sc.nextInt();
        if (s2 != 0){
            do {
                sum *= s1;
                i++;
            }while(i <= s2);
            System.out.println("Sonuç= " +sum);
        }else{
            System.out.println("Sonuc= 1");
        }

    }
}
