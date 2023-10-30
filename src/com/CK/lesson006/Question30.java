package com.CK.lesson006;

import java.util.Locale;
import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);

        /**
         * Dışarıdan bir iban değeri girelim TR 1001005001, TR 1001005002 veya OTH 2002002000 gibi daha sonra bu değerleri
         * kontrol edelim eğer Tr ile başlıyor ise yurt içi işlemler yazsın eğer 5001 ile bitiyorsa ziraat 5002 ile bitiyorsa
         * garanti 5003 ile bitiyorsa iş bankası yazsın oth ise yurt dışı işlemler yazdıralım 2000 ile bitiyorsa kıta içi
         * işlemler ve oth 2000200200 yerine ki 200200... eğer 200 ile bitmiyorsa kd 200201
         */

        String iban = scc.nextLine();

        for(int i = 0; i < iban.length(); i++){
            if(iban.substring(0,2).toUpperCase().equals("TR")){
                System.out.print("Yurtiçi işlemler ");
                if(iban.substring(9).equals("5001")){
                    System.out.println("Ziraat Bakası"); break;
                }
                if(iban.substring(9).equals("5002")){
                    System.out.println("Garanti Bakası"); break;
                }
                if(iban.substring(9).equals("5003")){
                    System.out.println("İş Bakası"); break;
                }
            }
            if(iban.substring(0,3).toUpperCase().equals("OTH")){
                System.out.print("Yurtdışı işlemler ");
                if(iban.substring(10).equals("2000")){
                    System.out.println("Kıtaiçi İşlemler");
                    System.out.println(iban.replace("OTH","KI")); break;
                }
                if(iban.substring(10).equals("2001")){
                    System.out.println("Kıtadışı İşlemler");
                    System.out.println(iban.replace("OTH","KD")); break;
                }
            }
        }
    }
}
