package com.CK.lesson003;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Dışarıdan dogum gununuzun ay ve gün değerini ayrı ayrı bir sayı olarak alacaksınız buna göre
//burc hesabı yapan program
//Koç Burcu : 21 Mart - 20 Nisan
//Boğa Burcu : 21 Nisan - 21 Mayıs
//İkizler Burcu : 22 Mayıs - 22 Haziran
//Yengeç Burcu : 23 Haziran - 22 Temmuz
//Aslan Burcu : 23 Temmuz - 22 Ağustos
//Başak Burcu : 23 Ağustos - 22 Eylül
//Terazi Burcu : 23 Eylül - 22 Ekim
//Akrep Burcu : 23 Ekim - 21 Kasım
//Yay Burcu : 22 Kasım - 21 Aralık
//Oğlak Burcu : 22 Aralık - 21 Ocak
//Kova Burcu : 22 Ocak - 19 Şubat
//Balık Burcu : 20 Şubat - 20 Mart

        int gun, ay;

        System.out.println("Doğduğunuz günü girin");
        gun = sc.nextInt();
        System.out.println("Doğduğunuz ayı sayı cinsinden girin");
        ay = sc.nextInt();

        switch (ay){
            case 1:
                if (gun >= 22){
                    System.out.println("Kova Burcusunuz");
                }else{
                    System.out.println("Oğlak Burcusunuz");
                }
                 break;
            case 2:
                if (gun >= 20){
                    System.out.println("Balık Burcusunuz");
                }else{
                    System.out.println("Kova Burcusunuz");
                }
                break;
            case 3:
                if (gun >= 21){
                    System.out.println("Koç Burcusunuz");
                }else{
                    System.out.println("Balık Burcusunuz");
                }
                break;
            case 4:
                if (gun >= 21){
                    System.out.println("Boğa Burcusunuz");
                }else{
                    System.out.println("Koç Burcusunuz");
                }
                break;
            case 5:
                if (gun >= 22){
                    System.out.println("İkizler Burcusunuz");
                }else{
                    System.out.println("Boğa Burcusunuz");
                }
                break;
            case 6:
                if (gun >= 23){
                    System.out.println("İkizler Burcusunuz");
                }else{
                    System.out.println("Yengeç Burcusunuz");
                }
                break;
            case 7:
                if (gun >= 23){
                    System.out.println("Aslan Burcusunuz");
                }else{
                    System.out.println("Yengeç Burcu");
                }
                break;
            case 8:
                if (gun >= 23){
                    System.out.println("Başak Burcusunuz");
                }else{
                    System.out.println("Aslan Burcusunuz");
                }
                break;
            case 9:
                if (gun >= 22){
                    System.out.println("Terazi Burcusunuz");
                }else{
                    System.out.println("Başak Burcusunuz");
                }
                break;
            case 10:
                if (gun >= 23){
                    System.out.println("Akrep Burcusunuz");
                }else{
                    System.out.println("Terazi Burcusunuz");
                }
                break;
            case 11:
                if (gun >= 22){
                    System.out.println("Yay Burcusunuz");
                }else{
                    System.out.println("Akrep Burcusunuz");
                }
                break;
            case 12:
                if (gun >= 22){
                    System.out.println("Oğlak Burcusunuz");
                }else{
                    System.out.println("Yay Burcusunuz");
                }
                break;

        }
    }
}
