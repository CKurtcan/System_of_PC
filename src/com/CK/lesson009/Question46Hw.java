package com.CK.lesson009;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Question46Hw {

    /*
    sayı tahmin oyunu
    5 adet hakkımız olacak
    program başlangıçta rastgele bir sayı verecek hakkımız bitene kadar tahminde bulunacağız
    eğer tahmin edilen sayı büyükse değer azalt çıktısı değilse değer arttır çıktısı versin
    eşitlenince buldun bassın hakkın dalduysa hakkınız doldu yazsın.
    tahminleri bir arrayda tut oyun sonu bastır.
    random sayı (1 ve 750 arası)
    */

    public static void main(String[] args) {

        guess();

    }

    public static void guess(){

        Random random = new Random();
        int randomNum = random.nextInt(1,750);
        int[] array = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.print("Lütfen tahmininizi giriniz...: ");
            int guessNum = new Scanner(System.in).nextInt();
            if (randomNum > guessNum && i < 5){
                System.out.println("Daha büyük bir değer deneyiniz...");
            }else if (randomNum < guessNum && i < 5){
                System.out.println("Daha küçük bir değer deneyiniz...");
            }else{
                System.out.println("Tahmininiz doğru.");
                System.out.println("Doğru tahmine kadar tahmin ettiğiniz tüm değerler.");
                System.out.println(Arrays.toString(array)); break;
            }
            array[i] = guessNum;
        }
        System.out.println("Seçim hakkınız bitti");
        System.out.print("Tahmin etmiş olduğunuz tüm sayılar...:" +Arrays.toString(array) +"\n");
        System.out.println("Seçilen sayı...: " +randomNum);
    }
}
