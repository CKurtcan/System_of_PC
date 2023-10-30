package com.CK.lesson009;

public class Question43 {
    public static void main(String[] args) {

        /*
        dizedeki derğerler arasındak farkın en küçük olduğu değer nedir bir metod içinde yazalım
         */
        int[] array = {5,1,-4,3};
        int sonuc = fark(array);
        System.out.println("En kucuk değer...: " +sonuc);
        System.out.println(Math.abs(-4));
    }

    public static int fark(int[] array){
        int enkucuk = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            for (int j = i+1; j < array.length; j++){
                int sonuc = Math.abs(array[i] - array[j]);
                if (sonuc < enkucuk){
                    enkucuk = sonuc;
                }
            }
        }
        return enkucuk;
    }
}
