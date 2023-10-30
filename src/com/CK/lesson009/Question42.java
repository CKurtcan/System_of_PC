package com.CK.lesson009;

public class Question42 {
    public static void main(String[] args) {

        /*
        bir metod yazacağız biz edışarıdan 2 tane sayı alacak ve bunları bir arraye atayacak daha sonra arrayin ilk 2
        elemanın çarpım sonucunu dönecek
         */

        int sonuc = arrayCarpim(4,6);
        System.out.println("Sonuc...: " +sonuc);
    }

    public static int arrayCarpim(int s1, int s2){
        int[] array = new int[2];
        array[0] = s1;
        array[1] = s2;
        int carpim = array[0] * array[1];
        return carpim;
    }
}
