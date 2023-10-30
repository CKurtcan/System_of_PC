package com.CK.lesson007;

import java.util.Scanner;

public class Question37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * dizi içerisindeki 1 ve 4 ün kaç defa geçtiğini ve 1 sayısının adedi 4 sayısının adedinde büyük ise true
         * değilse false yazdıran algoritma
         */

        int[] sayilar = { 1,4, 5, 6, 1, 1, 4, 8 };

        int num1 = 0;
        int num4 = 0;

        for (int i = 0; i < sayilar.length; i++){
            if (sayilar[i] == 1){
                num1++;
            }
            if (sayilar[i] == 4){
                num4++;
            }
        }
        if (num1 > num4){
            System.out.println("True");
        } if (num1 < num4){
            System.out.println("False");
        }
    }
}
