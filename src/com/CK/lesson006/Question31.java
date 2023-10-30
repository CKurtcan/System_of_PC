package com.CK.lesson006;

import java.util.Scanner;

public class Question31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String word2 = "";

        for(int i = word.length()-1; 0 <= i; i--){
            char character = word.charAt(i);
            word2 += character;
        }
        System.out.println(word2);
        if (word.equals(word2)){
            System.out.println("Polindramdır");
        }else{
            System.out.println("Polindram değildir");
        }
    }
}
