package com.CK.lesson013.Bank;

import com.CK.lesson013.Bank.repository.BankAccountRepository;

/*
bir interestRate account number birde balance özelliklerim var

bu sınıfı oluşturduktan sonra bir faiz oranı atayalım 0.05 gibi
daha sonra faiz getirisini hesaplayan bir metot yaazalım getInterestRate()

birde getInformation metodu yazıp hesapla ilgili verileri gösterelim
 */
public class BankTest {
    public static void main(String[] args) {

        BankAccountRepository bar = new BankAccountRepository();

        bar.getInterestRate("122116",84674,0.34,150);

        bar.getInformation();

    }
}
