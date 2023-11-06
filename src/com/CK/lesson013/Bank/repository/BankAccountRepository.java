package com.CK.lesson013.Bank.repository;

import com.CK.lesson013.Bank.entity.Account;

import java.math.BigDecimal;

public class BankAccountRepository {

    public static void getInterestRate(String accountNum, int balance, double interestRate, int day){

        Account account = new Account();
        account.interest = ((double) balance / 100) * (interestRate/365) * day;
        account.accountNum = accountNum;
        account.balance = balance + account.interest;
    }
    public static void getInformation(){
        Account account = new Account();
        System.out.println(account.accountNum  +" numaralı hesabınızın\nYeni bakiyesi...: " +account.balance +"\nFaiz getirisi...:" +account.interest);
    }
}
