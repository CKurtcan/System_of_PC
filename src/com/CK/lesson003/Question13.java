package com.CK.lesson003;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * 0 girilene kadar sayı al 0 girilince toplam ve ortalama ver.
         */

        int num, sum, i;
        double avg;
        sum = 0;
        avg = 0;
        i = 0;
        num = 1;

        while(num != 0){
            num = sc.nextInt();
            sum += num;
            i++;
            avg = (double) sum / i;
            System.out.println(avg);
        }
        System.out.println("Toplam =" +sum);
        System.out.println("Ortalama =" +avg);
    }
}
