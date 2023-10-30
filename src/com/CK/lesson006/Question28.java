package com.CK.lesson006;

import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /**
         * bu string değeri virgüllerden ayırıp her kelimeyi alt alta yazdıralım
         */

        String kelime = "Java,React,CSS,Html";

        int i = 0;

        while (i < kelime.length()){
            int loc1 = kelime.indexOf(",");
            if (loc1 != -1){
                System.out.println(kelime.substring(0,loc1));
                kelime = kelime.substring(loc1+1);
            }else{
                System.out.println(kelime);
                break;
            }
            i++;
        }
        kelime = "Java,React,CSS,Html";

        int index = 0;

        for (int j = 0; j < kelime.length(); j++){
            if (kelime.charAt(j) == ','){
                System.out.println(kelime.substring(index,j));
                index = j + 1;
            }
        }
    }
}
