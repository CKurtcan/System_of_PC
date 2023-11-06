package com.CK.lesson013.Static;

public class StaticOrnek {

    //static olmayanlar nesne
    int numara1;

    // staticler sınıf
    static int numara2;

    public void numaraVer(){
        System.out.println("Numaraver Metodu");
        numara1 += 1;
        numara2 += 1;
        System.out.println("numara 1 ===> " +numara1);
        System.out.println("numara 2 ===> " +numara2);


    }
}
