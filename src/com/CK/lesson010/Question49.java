package com.CK.lesson010;

import java.util.Scanner;

public class Question49 {

    /*
    1- dışarıdan girilen harfle başlayan illeri yazdıralım
    2- illeri plaka kodları ile yazdıralım
     */

    public static void main(String[] args) {
        String[] city = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
                "Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
                "Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
                "Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
                "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
                "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
                "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
                "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
                "Kilis", "Osmaniye", "Düzce" };

        findCity(city);
    }
    public static void findCity(String[] array) {
        System.out.print("Bakmak istediğiniz illerin baş harfini girin: ");
        String cha = new Scanner(System.in).nextLine();
        int i = 0;
        for (String city : array) {
            i++;
            if (city.startsWith(cha.toUpperCase()))
                System.out.println(city +" adlı şehrin plaka kodu " +i +" dir.");
        }
    }
}
