package com.CK.lesson002;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * 1 den başlayarak girdiğimiz sayıların toplayalım, toplam 50 den büyük olana kadar programımız çalışsın program sonunda
         * toplamı ve programın kaç kere çalışıtığı yazdırlaım
         */
        int i, toplam;
        i = 1;
        toplam = 0;

        while (50 >= toplam){
            toplam += i;
            i ++;
        }
        System.out.println("Program " +i +" kere çalıştı.");
        System.out.println("Toplam = " +toplam);
    }
}
