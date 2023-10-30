package com.CK.lesson005;

import java.util.Locale;
import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        String value ="Merhaba Dünya";
        String value2 ="Merhaba Dünya";
        System.out.println(value.lastIndexOf("a")); // metin içerisindeki bir değerin son indexini verir
            System.out.println(value.indexOf("a")); // metin içerisindeki bir değerin ilk indexini verir
        System.out.println(value.indexOf("x")); // metin içerisindeki aradığımımz değer yoksa -1 çıktısı alırız
        System.out.println(value.charAt(0)); //  metin içerisindeki aradığımız charı verir
        System.out.println(value2.trim()); // baştaki ve sondaki boşlukları temizler
        System.out.println(value2.contains("e")); // true veya false döner
        System.out.println(value.substring(1,7)); // aralığındaki değerleri alır (7 dahil değir)
        System.out.println(value.toUpperCase()); // tüm harfleri büyütmek için
        System.out.println(value2.toLowerCase()); // tüm harfleri küçültmek için
        System.out.println(value2.toUpperCase(Locale.ENGLISH));
        System.out.println(value.replace("a","x")); // eskisi ile yeniyi değiştir
        System.out.println(value.equals(value2)); // true
        System.out.println(value == value2);// false
        String value3 = "merhaba dünya";
        System.out.println(value.equalsIgnoreCase(value3)); // harf büyük küçüklüğüne bakmadan karşılaştır
        System.out.println(value.endsWith("a")); // a ile bitip bitmediğini kontrol et
        System.out.println(value.startsWith("M")); // M ile başlayıp başlamadığını kontrol et

        String value4 = "Java-React-CSS";

            String[] array = value4.split("-");
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        String value5 = "10";
        int s1 = Integer.parseInt(value5); // bir string değerini int değerine çevirir
        System.out.println(5 + s1);

        System.out.println(value5.length()); // uzunluğu verir
    }
}
