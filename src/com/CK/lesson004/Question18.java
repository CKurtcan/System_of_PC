package com.CK.lesson004;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * iki tane sayı değişkenimiz olsun
         * daha sonra dışarıdan bir işlem seçeceğiz (toplama bölme çıkarma(+ - *)
         * dışarıdan seçtiğimiz işleme göre  iki sayı için işlem yapsın
         */

        int num1, num2;
        String islem;
        double sum;
        sum = 0;




        do {
            System.out.println("İlk sayınızı seçiniz");
            num1 = sc.nextInt();
            System.out.println("İkinci sayınızı seçiniz");
            num2 = sc.nextInt();
            sc.nextLine();
            System.out.println("Yapmak istediğiniz işlemi seçin ya da 0 a basarak sonlandırın");
            islem = sc.nextLine();
            switch (islem){
                case "+":
                    sum = num1 + num2;
                    System.out.println("Sonuç = " +sum); break;
                case "-":
                    sum = num1 - num2;
                    System.out.println("Sonuç = " +sum); break;
                case "*":
                    sum = num1 * num2;
                    System.out.println("Sonuç = " +sum); break;
                case "/":
                    sum = (double) num1 / num2;
                    System.out.println("Sonuç = " +sum); break;
                default:
                    System.out.println("Geçerli bir değer gir");
            }
        }while (islem != "0");
        System.out.println("İşlem sonlandı");
    }
}
