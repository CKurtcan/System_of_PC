package com.CK.lesson007;

import java.util.Scanner;

public class Question36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * bir dizide ard arda gelen 2 indexteki sayı değeri 2 ise true yazdır sonlandır yoksa false yazdıralım
         */

        int[] sayilar = { 2, -256, 16, 1258, 5, 2 };

        boolean durum = false;

        for (int i = 0; i < sayilar.length; i++){
            if (i < sayilar.length-1 && sayilar[i] == 2 && sayilar[i+1] == 2){
                durum = true;
                break;
            }
        }
        if (durum){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
