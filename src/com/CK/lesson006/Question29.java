package com.CK.lesson006;

public class Question29 {
    public static void main(String[] args) {

        /**
         * String değerinin karakterleri rakam  ise toplayalım ve program sonunda toplam değerini yazalım değil ise
         * bir string de toplayıp bastıralım.
         */

        String value = "125abc96xy8";
        String value2 = "";
        int sum = 0;

        for (int i = 0; i < value.length(); i++) {
            char character = value.charAt(i);

            if (Character.isDigit(character)) {
                int digit = Character.getNumericValue(character);
                sum += digit;
            } else {
                value2 += character;
            }
        }
        System.out.println("Toplam: " + sum);
        System.out.println("Harf ve semboller: " + value2);
        System.out.println("Çözüm 2");

        value = "125abc96xy8";
        sum = 0;
        //character = '';

        for (int i = 0; i < value.length(); i++) {
            char character = value.charAt(i);

            if (character >= 48 && character <= 57) {
                int digit = Character.getNumericValue(character);
                sum += digit;
            } else {
                value2 += character;
            }
        }
        System.out.println("Toplam: " + sum);
        System.out.println("Harf ve semboller: " + value2);

    }
}
