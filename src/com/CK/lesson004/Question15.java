package com.CK.lesson004;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * 1 den 100 e kadar (100 de dahil) olan sayılarsan çift sayıların toplamının tek sayıların toplamına oranı
         */
        int i, sum1, sum2;
        double ratio;
        sum1 = 0 ;
        sum2 = 0;
        ratio = 0;
        i = 1;

        while (i <= 100){
            if (i % 2 == 0){
                sum1 += i;
            }else{
                sum2 +=i;
            }
            i++;
        }
        ratio = (double) sum1 / sum2;
        System.out.println("Sonuç = " +ratio);
    }
}
