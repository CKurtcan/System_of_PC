package com.CK.lesson011;

import java.util.Arrays;

public class Question51 {
    /*
    iki tane String değer alıp araya atıp arayı yazdıran fonksiyon
    ikiden fazla değer alsın ve arayı yazırsın (varargs)
     */

    public static void araYazma(String deger1, String deger2){
        String[] dizi = new String[2];
        dizi[0] = deger1;
        dizi[1] = deger2;
        System.out.println(dizi[0]);
        System.out.println(dizi[1]);
        System.out.println(Arrays.toString(dizi));
        for (String string: dizi){
            System.out.println(string);
        }
    }

    public static void araYazma(String...deger){

    }

}
