package com.CK.lesson007;

import java.util.Arrays;
import java.util.Scanner;

public class Question33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * dışarıdan bir dizi uzunluğu alalım ve bir dizi tanımlayıp elemanları ekleyip yazdıralım
         */

        int adet  = sc.nextInt();

        int[] sayilar = new int[adet];

        for (int i = 0; i < adet; i++){
            int num = sc.nextInt();
            sayilar[i] = num;
        }
        System.out.println(Arrays.toString(sayilar));
    }
}
