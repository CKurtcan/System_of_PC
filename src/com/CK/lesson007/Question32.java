package com.CK.lesson007;

import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * bir dizideki sayıların toplamını bulalım ve her sayı için bu sayı tektir veya çifttir çıktısını verelim
         */

        int[] sayilar = {1500,120,5,-256,1296,-462,159,12};
        int sum = 0;

        for (int i = 0; i < sayilar.length; i++){
            sum += sayilar[i];
            if (sayilar[i] % 2 != 0){
                System.out.println("Tek sayıdır");
            }else {
                System.out.println("Çift sayıdır");
            }
        }
        System.out.println(sum);
    }
}
