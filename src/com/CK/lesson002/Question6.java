package com.CK.lesson002;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * Dışarıdan girilen sayının faktoriyelini alalım
         */

        int s1, faktoriyel;
        faktoriyel = 1;

        System.out.println("Bir sayı giriniz.");
        s1 = sc.nextInt();
        for (int i = s1; i >= 1; i--){
            faktoriyel *= i;
        }
        System.out.println("Faktoriyel = " +faktoriyel);

        faktoriyel = 1;
        while(s1 >= 1){
            faktoriyel *= s1;
            s1--;
        }
        System.out.println("Faktoriyel = " +faktoriyel);
    }
}

