package com.ibm.bank;

public class BankAccount {
    private String customerName;
    private String accountNumber;
    private double balance;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName,String accountNumber,double balance,String email,String phoneNumber){
        System.out.println("Constructor with values called");
        this.customerName=customerName;
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.email=email;
        this.phoneNumber=phoneNumber;
        //System.out.println("Empty constructor called");
    }



    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance=this.balance+depositAmount;
        System.out.println("Balance" +this.balance +"is available.");
    }
    public void withdrawl(double withdrawlAmount) {
        if ((this.balance - withdrawlAmount) < 0) {
            System.out.println("Balance" +this.balance +"is available.Withdrawl not possible");
        }else{
            this.balance=this.balance-withdrawlAmount;
            System.out.println("Balance" +this.balance +"is available.Withdrawl amount of Rs"+withdrawlAmount);
        }
    }



}
