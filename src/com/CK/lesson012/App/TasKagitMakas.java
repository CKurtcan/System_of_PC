package com.CK.lesson012.App;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
    public String oyuncuAdi;

    public String[] secenekler = {"Rock", "Paper", "Scissors"};


    public String secimYap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(secenekler) + " seceneklerden birini seciniz");
        String secim = scanner.nextLine();
        return secim;
    }

    public String pcSecim() {
        Random random = new Random();
        System.out.println(secenekler.length);
        int secim = random.nextInt(3);
        return secenekler[secim];

    }

    public void uygulama() {
        System.out.println("**" + oyuncuAdi + " Hoşgeldin** ");
        System.out.println("=== TAS KAGIT MAKAS OYUNU ===");
        String secim = secimYap();
        String rast = pcSecim();
            if (secim.equals(rast)) {
                System.out.println("Berabere!!!\nSeçimler: \nSeçiminiz: " +secim + "\nAI'ın Seçimi: " +rast);
            }
            if (secim.equals("Paper")) {
                if (rast.equals("Scissors"))
                    System.out.println("Kaybettiniz!!!\nSeçimler: \nSeçiminiz: " +secim+ "\nAI'ın Seçimi: " +rast);
                if (rast.equals("Rock"))
                    System.out.println("Kazandınız!!!\nSeçimler: \nSeçiminiz: " +secim + "\nAI'ın Seçimi: " +rast);
            }
            if (secim.equals("Scissors")) {
                if (rast.equals("Rock"))
                    System.out.println("Kaybettiniz!!!\nSeçimler: \nSeçiminiz: " +secim + "\nAI'ın Seçimi: " +rast);
                if (rast.equals("Paper"))
                    System.out.println("Kazandınız!!!\nSeçimler: \nSeçiminiz: " +secim + "\nAI'ın Seçimi: " +rast);
            }
            if (secim.equals("Rock")) {
                if (rast.equals("Paper"))
                    System.out.println("Kaybettiniz!!!\nSeçimler: \nSeçiminiz: " +secim + "\nAI'ın Seçimi: " +rast);
                if (rast.equals("Scissors"))
                    System.out.println("Kazandınız!!!\nSeçimler: \nSeçiminiz: " +secim+ "\nAI'ın Seçimi: " +rast);
            }
        System.out.println("Oyunumuzu oynadığınız için teşekkürler");
        }
}
