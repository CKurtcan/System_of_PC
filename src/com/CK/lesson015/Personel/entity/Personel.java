package com.CK.lesson015.Personel.entity;

public class Personel{
    String name;
    String surName;
    int salary;

    public Personel(String pName, String pSurName){
        this.name = pName;
        this.surName = pSurName;
    }

    public Personel(int pSalary, String pName, String pSurName){
        this.name = pName;
        this.surName = pSurName;
        this.salary = pSalary;
    }
}
