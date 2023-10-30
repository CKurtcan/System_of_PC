package com.CK.lesson007;

import java.util.Arrays;
import java.util.Scanner;

public class Question38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
        Adana adlı sehirin plaka kodu : 01
        Adıyaman adlı sehrin plaka kodu :02
        */
        String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;7-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";

        String[] array = sehirler.split(";");

        for (int i = 0; i < array.length; i++){
            int index = array[i].indexOf("-");
            System.out.println(array[i].substring(index+1) +" adlı şehrin plaka kodu : " +array[i].substring(0,index));
        }
    }
}

