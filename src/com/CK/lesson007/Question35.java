package com.CK.lesson007;

import java.util.Arrays;
import java.util.Scanner;

public class Question35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * dizideki maksimum minimum ve en büyük ikinci değeri bulalım
         */

        /**int[] sayilar = {0, 120, 5, 85, -256, 16, 1258, 240, 81, 14};

        Arrays.sort(sayilar);

         System.out.println("Dizinin küçükten büyüğe sıralanmış hali: " + Arrays.toString(sayilar));
        */

        int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 240, 81, 14 };

        int enbuyuk = sayilar[0];
        int enkucuk = sayilar[0];
        int ikincienbuyuk = sayilar[0];

        for (int i = 0; i < sayilar.length; i++){
            if (sayilar[i] < enkucuk){
                enkucuk = sayilar[i];
            }
            if (sayilar[i] > enbuyuk){
                enbuyuk = sayilar[i];
            }
            if (sayilar[i] > ikincienbuyuk && sayilar[i] < enbuyuk){
                ikincienbuyuk = sayilar[i];
            }
        }
        System.out.println(enbuyuk +" " +enkucuk +" " +ikincienbuyuk);
    }
}

