package com.CK.lesson009;

import java.util.Scanner;

public class Question44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        dışarıdan 2 sayı alacağız en büyük ortak bölenini bulacağız daha sonra main de ekok bulacağız
        ekok =(s1*s2)/ebob
         */

        System.out.print("1. değeri giriniz...: ");
        int s1 = sc.nextInt();
        System.out.print("2. değeri giriniz...: ");
        int s2 = sc.nextInt();
        int ebob = ebobekok(s1,s2);
        int ekok = s1 * s2/ ebob;
        System.out.println("En büyük ortak bölen...: "+ebob);
        System.out.println("En küçük ortak kat...: "+ekok);
    }

    public static  int ebobekok(int s1, int s2){
        int enkucuk = s1;
        int enbuyuk = Integer.MAX_VALUE;
        int ebob = 1;
        if (s2 < s1){
            enkucuk = s2;
            enbuyuk = s1;
        }else{
            enbuyuk = s1;
            enbuyuk = s2;
        }
        for (int i = 1; i <= enkucuk; i++){
            if (enkucuk % i == 0 && enbuyuk % i == 0){
                ebob = i;
            }
        }
        return ebob;
    }
}
