package com.CK.lesson010;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Question50Hw {

    /*
    1- dısarıdan girilen harfle baslayan illeri yazdıralım;
    2- illeri plaka kodları ile yazdıralım 01-Adana 02-Adıyaman .....
    3- girdiğimiz sehrin ismine gore plaka kodu donen metot yazalım
    4-ilk harf haric sesli harflari slip yazdıran bir fonksiyon yazalım ( bir arraye atayalım) ==>Adn ,Adymn
    5-bir onceki metotdan donen degerlerin ilk uc harfini alsın ve sonuna ...(üç tane nokta eklesin)
    Adn... Ady...
    6- bir önceki metottan dönen dizide B ile başlayan illeri naşına sıra no (1-Blk 2-Bl)
    7- ikinci harfi a olanalrın sadece ilk 3 harfini büyük yazdırın (Çankırı==>ÇAN ,manisa==>MAN)
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
        licenseNum(city);


    }

    /**
     * Method 1 -> baş harfe göre şehir bulma....
     */

    public static void findCity(String[] array){

        System.out.println("**************************************");

        System.out.print("Bakmak istediğiniz illerin baş harfini girin: ");
        String cha = new Scanner(System.in).nextLine();

        int countNum = 0;
        int i = 0;

        System.out.println("Seçtiğiniz baş harf ile başlayan illerin tam listesi...: ");

        for (String city : array){
            if (city.startsWith(cha.toUpperCase()))
                countNum++;
        }
        String[] cityFound = new String[countNum];

        for (String city : array){
            if (city.startsWith(cha.toUpperCase()) && i < countNum){
                cityFound[i] = city;
                System.out.println(cityFound[i]);
                i++;
            }

        }
    }

    /**
     * Method 2 -> illere plaka kodu ekleme....
     */

    public static void licenseNum(String[] array){

        System.out.println("**************************************");

        String[] cityWithLiceNum = new String[array.length];

        System.out.println("Plaka kodları eklenmiş hali ile seçtiğiniz iller...: ");

        for (int i = 0; i < array.length; i++){
            if (i <= 8){
                cityWithLiceNum[i] = "0" +(i+1) + "-"+ array[i];
            }else{
                cityWithLiceNum[i] = (i+1) + "-"+ array[i];
            }
            System.out.println(cityWithLiceNum[i]);
        }

    }

    /**
     * Method 3 -> istenilen illi plaka kodu ile bastırma....
     */

    public static void cityWithNum(String[] cityWithLiceNum){

        System.out.println("**************************************");

        System.out.print("Plaka kodunu öğrenmek istediğiniz şehrin girin...: ");
        String citySearched = new Scanner(System.in).nextLine();

        for (String city : cityWithLiceNum){
            if (citySearched.equals(city)) System.out.println("İstediğiniz şehrin plaka kodu " +city);
        }
    }

    /**
     * Method 4 -> sesli harfleri silerek şehirleri bastırma....
     */

    public static void delVowel(String[] array){
        //char[] letters = {'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü'};

        System.out.println("**************************************");

        String[] delVowelArray = new String[array.length];

        for (int i = 0; i < array.length; i++){
            for (int j = 1; j < array[i].length(); j++){
                delVowelArray[i] = array[i].replaceAll("[aeıioöuüAEIİOÖUÜ]","");
            }
        }
        System.out.println("Sesli harfleri çıkartılmış şekilde iller...: " +Arrays.toString(delVowelArray));
    }

    /**
     * Method 5 -> sesli harfleri silinmiş şehirlerin sadece ilk 3 harfi kalacak sonra 3 nokta konacak....
     */

    public static void threeChar(String[] delVowelArray){

        System.out.println("**************************************");

        String[] threeCharArray = new String[delVowelArray.length];

        for (int i = 0; i < delVowelArray.length; i++) {
            for (int j = 1; j < delVowelArray[i].length(); j++) {
                threeCharArray[i] = delVowelArray[i].replace(delVowelArray[i].substring(3),"...");
            }
        }
        System.out.println("Sesli harfleri çıkartılmış şekilde iller...: " +Arrays.toString(threeCharArray));
    }

    /**
     * Method 6 -> sesli harfleri silinmiş şehirlerin sadece ilk 3 harfi kalacak sonra 3 nokta konacak
     * ikinci harfi a ise ilk 3 harf büyük olacak....
     */

    public static void bigThreeChar(String[] threeCharArray){
        for (String city: threeCharArray){
            if (city.charAt(1) == 'a'){
                city = city.toUpperCase();
            }
        }
    }
}
