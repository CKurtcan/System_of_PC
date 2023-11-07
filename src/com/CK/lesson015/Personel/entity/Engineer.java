package com.CK.lesson015.Personel.entity;

public class Engineer extends Personel {

    private String seniority;
    public Engineer(String pName, String pSurName) {
        super(pName, pSurName);
    }

    public Engineer(int pSalary, String pName, String pSurName) {
        super(pSalary, pName, pSurName);
        setSeniority(calculateSeniority(pSalary));
    }

    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    private int calculateSalary(int pSalary){
        return Math.max(pSalary, 20000);
    }

    private String calculateSeniority(int salary){
        if (salary >= 20000 && salary <= 25000){
            return "Mühendis";
        }else if (salary >= 25000 && salary < 35000){
            return "Kıdemli Muhendis";
        }else{
            return "Yüksek Mühendis";
        }
    }
}
