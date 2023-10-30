package com.CK.lesson009;

import java.util.Arrays;
import java.util.Random;

public class Question45 {
    public static void main(String[] args) {

        /*
        dışarıdan bir dizi boyutu gireceğiz (double)
        daha sonra bu diziye ratgele sayılar atayacağız ve ortalamasını alacağız
         */

        /**
         * Random random = new Random();
         * int sayi = random.nextInt(5);
         */

        System.out.println(Arrays.toString(diziOlusturma(5)));

    }

    public static double[] diziOlusturma(int dizibouyutu){
        Random random = new Random();
        System.out.println("Bir dizi boyutu giriniz");
        double[] dizi = new double[dizibouyutu];
        for (int i = 0; i < dizibouyutu; i++){
            double sayi = random.nextDouble(5);
            dizi[i] = sayi;
        }
        return dizi;
    }
}
