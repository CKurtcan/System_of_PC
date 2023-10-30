package com.CK.lesson007;

import java.util.Scanner;

public class Question34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * kullanıcıdan bir ülkü ismi alacağız daha sonra bu ülke ismi eğer arrayimizde varsa girdiğiiz
         * ülke bulundu yoksa girdiğiniz ülke bulunamadı çıktısı versin
         */

        String[] dizi = {"Türkiye","Japonya","Danimarka","Fransa"};
        boolean durum = false;
        String nation = sc.nextLine();
         for(int i = 0; i < dizi.length; i++){
             if(dizi[i].equals(nation)){
                 durum = true;
                 break;
             }
         }
         if (durum){
             System.out.println("Ülke bulundu");
         }else {
             System.out.println("Ülke bulunamadı");
         }
    }
}
