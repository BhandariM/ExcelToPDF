/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bhandari_inclassexam;

/**
 *
 * @author S525703
 */
public class Accounts {
     String firstName;
    String lastName;
    String accountNumber;
    int accountBalance;

    public Accounts() {
    }
    
   
    public Accounts(String firstName, String lastName, String accountNumber, int accountBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }
    
    
    
}
