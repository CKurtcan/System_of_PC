package com.CK.lesson004;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * Girilen sayının 5 in kuvveti olup olmadığını bul
         */

        int num;
        boolean durum;
        durum = false;

        num = sc.nextInt();

        while(num >= 5){
            if (num % 5 == 0){
                durum = true;
                num /= 5;
            }else{
                durum = false; break;
            }
        }if (durum == false){
            System.out.println("5 in kuvveti değil");
        }else{
            System.out.println("5 in kuvveti");
        }
    }
}
