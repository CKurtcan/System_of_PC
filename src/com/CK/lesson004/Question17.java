package com.CK.lesson004;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        /**
         * Girilen sayının bir sayının asal olup olmadığını kontrol edelim
         */

        int i, num, sum;
        boolean prime = true;
        i = 2;

        num = sc.nextInt();

        while(i < num){
            sum = 0;
            sum = num % i;
            if (sum == 0){
                prime = false; break;
            }else{
                i++;
            }
        }
        if (prime){
            System.out.println("Asal Sayı");
        }else{
            System.out.println("Asal Değil");
        }
    }
}
