package com.CK.lesson008;

import java.util.Arrays;
import java.util.Scanner;

public class Question39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * bir başlangıç ve bitiş değeri arasındaki sıralı sayılardan eğer sayı 3' ün katı ise bilge 5 'in ise adam hem
         * 3 hem 5 in katı ise bilgeadam yazdırlaım
         */

        System.out.print("Başlangıç değerini girin : ");
        int spoint = sc.nextInt();
        System.out.println();
        System.out.print("Bitiş değerini seçin : ");
        int fpoint = sc.nextInt();
        int length = fpoint - spoint;
        String[] cikti = new String[length+1];

        for (int i = 0; i < length+1; i++){
            cikti[i] = Integer.toString(i);
            if ((spoint+i) % 3 == 0){
                cikti[i] = "bilge";
            }
            if ((spoint+i) % 5 == 0){
                cikti[i] = "adam";
            }
            if ((spoint+i) % 3 == 0 && i % 5 == 0){
                cikti[i] = "bilgeadam";
            }
        }
        System.out.println(Arrays.toString(cikti));
    }
}
