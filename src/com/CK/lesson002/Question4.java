package com.CK.lesson002;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * 1 den girdiğimiz sayıya kadar olan sayıların toplamını yazdıran program
         */
        int s1, toplam;
        toplam = 0;

        System.out.println("Bir sayı giriniz.");
        s1 = sc.nextInt();

        for (int i = 1; i <= s1; i++){
            toplam += i;
        }
        System.out.println("Toplam = " +toplam);
    }
}
