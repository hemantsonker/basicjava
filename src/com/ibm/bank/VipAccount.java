package com.ibm.bank;

public class VipAccount {
    private double creditLimit;
    private String name;
    private String emailAddress;
    public VipAccount(){
    this(50000,"hemant","hemant@gmail.com");
        System.out.println("Default constructor called");
    }
    public VipAccount(double creditLimit, String name){
        this(creditLimit,name,"hemant0070@h.com");

    }
    public VipAccount(double creditLimit, String name, String emailAddress) {
        this.creditLimit = creditLimit;
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
