package com.CK.lesson004;

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * Mükemmel sayı kontrolü
         */

        int i, sum, num;
        i = 1;
        sum= 0;

        num = sc.nextInt();

        while(i < num){
            if (num % i == 0){
                sum += i;
            }
            i++;
        }
        if (sum == num){
            System.out.println("Mükkemmel sayı");
        }else {
            System.out.println("Mükkemmel sayı değil");
        }
    }
}
