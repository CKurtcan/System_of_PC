package com.CK.lesson005;

import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * value değişkenin karakterleri (sayısal değerlerinin) toplamı kaçtır
         */

        String value = "1234";

        int i = 0;
        int sum = 0;
        while(i < value.length()){
            String value2 = Character.toString(value.charAt(i));
            int s1 = Integer.parseInt(value2);
            sum += s1;
            i++;
        }
        System.out.println(sum);
    }
}
