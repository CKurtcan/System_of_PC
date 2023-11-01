package com.CK.lesson012;

/*
1-Taş kağıt makas uygulaması yapacağız bunun için bir sınıf oluşturup
memtotları ve özellikleri bu sınıf içerisinde toplayacağız
bu sınıf seçenemklerimiz tutalım (TAS,KAGIT,MAKAS) ve bu
uygulamayı çalıştıran kişinin ismini tutalım

2-
 */

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        TasKagitMakas oyun = new TasKagitMakas();
        oyun.oyuncuAdi = "Mustafa";
        System.out.println("App main metot ==> " +oyun.secimYap());

    }

    public static void selection(){
        Random random = new Random();
        System.out.println("Kaç kere oynamak istiyorsunuz?");
        int num = new Scanner(System.in).nextInt();
        String[] array = {"Rock","Paper","Scissors"};
        for (int i = 0; i < num; i++){
            int choose = random.nextInt(3);
            System.out.println("Lütfen seçim yapınız...");
            String answer = array[choose];
            System.out.println(answer);
            String game = new Scanner(System.in).nextLine();
            if (game.equals(answer)){
                System.out.println("Berabere!!!\nSeçimler: \nSeçiminiz: " +answer +"\nAI'ın Seçimi: " +answer);
            }
            if (!game.equals(answer) && game.equals("Paper") && answer.equals("Scissors"))
                System.out.println("Kaybettiniz!!!\nSeçimler: \nSeçiminiz: " +answer +"\nAI'ın Seçimi: " +answer);
        }
    }
}
