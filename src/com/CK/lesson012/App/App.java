package com.CK.lesson012.App;

/*
1-Taş kağıt makas uygulaması yapacağız bunun için bir sınıf oluşturup
memtotları ve özellikleri bu sınıf içerisinde toplayacağız
bu sınıf seçenemklerimiz tutalım (TAS,KAGIT,MAKAS) ve bu
uygulamayı çalıştıran kişinin ismini tutalım

2-
 */

public class App {
    public static void main(String[] args) {

        TasKagitMakas oyun = new TasKagitMakas();

        oyun.uygulama();




    }
    /*
    public static void selection(){
        Random random = new Random();
        System.out.println("Kaç kere oynamak istiyorsunuz?");
        int num = new Scanner(System.in).nextInt();
        String[] array = {"Rock","Paper","Scissors"};
        for (int i = 0; i < num; i++) {
            int choose = random.nextInt(3);
            System.out.println("Lütfen seçim yapınız...");
            String answer = array[choose];
            String game = new Scanner(System.in).nextLine();
            if (game.equals(answer)) {
                System.out.println("Berabere!!!\nSeçimler: \nSeçiminiz: " + answer + "\nAI'ın Seçimi: " + answer);
            }
            if (game.equals("Paper")) {
                if (answer.equals("Scissors"))
                    System.out.println("Kaybettiniz!!!\nSeçimler: \nSeçiminiz: " + answer + "\nAI'ın Seçimi: " + answer);
                if (answer.equals("Rock"))
                    System.out.println("Kazandınız!!!\nSeçimler: \nSeçiminiz: " + answer + "\nAI'ın Seçimi: " + answer);
            }
            if (game.equals("Scissors")) {
                if (answer.equals("Rock"))
                    System.out.println("Kaybettiniz!!!\nSeçimler: \nSeçiminiz: " + answer + "\nAI'ın Seçimi: " + answer);
                if (answer.equals("Paper"))
                    System.out.println("Kazandınız!!!\nSeçimler: \nSeçiminiz: " + answer + "\nAI'ın Seçimi: " + answer);
            }
            if (game.equals("Rock")) {
                if (answer.equals("Paper"))
                    System.out.println("Kaybettiniz!!!\nSeçimler: \nSeçiminiz: " + answer + "\nAI'ın Seçimi: " + answer);
                if (answer.equals("Scissors"))
                    System.out.println("Kazandınız!!!\nSeçimler: \nSeçiminiz: " + answer + "\nAI'ın Seçimi: " + answer);
            }
        }
        System.out.println("Oyunumuzu oynadığınız için teşekkürler");
    }
     */
}
