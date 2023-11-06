package com.CK.lesson014;

public class Pokemon {
    private int id;
    public String tur;
    public String ad;
    public int seviye;
    public int can;
    public int guc;

    public void saldir(){
        System.out.println(ad+ " adlı pokemon saldırıda bulunuyor");
    }

    public void kacinma(){
        System.out.println(ad+ " adlı pokemon saldırıdan kaçınıyor");
    }

    public void bilgileriGoster(){
        System.out.println("id= " +id);
        System.out.println("tur= " +tur);
        System.out.println("ad= " +ad);
        System.out.println("seviye= " +seviye);
        System.out.println("guc= " +guc);
    }
}
