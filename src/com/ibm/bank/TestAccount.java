package com.ibm.bank;

public class TestAccount {
    public static void main(String[] args){
//        BankAccount hemAccount=new BankAccount("Hemant","949494949",500.00,"hemant@g.com","9891798543");
//        //BankAccount(String customerName,String accountNumber,double balance,String email,String phoneNumber){
//        //hemAccount.setAccountNumber("833637637637");
//        System.out.print("Customer Name "+hemAccount.getCustomerName());
//        System.out.print("Customer Name "+hemAccount.getAccountNumber());
//        hemAccount.setBalance(100);
//        hemAccount.deposit(500);
//        hemAccount.withdrawl(300);
//        hemAccount.withdrawl(200);
//        hemAccount.withdrawl(100);
        VipAccount vip1=new VipAccount();
        System.out.println("Customer email vip1 " +vip1.getEmailAddress());
        System.out.println("Customer name vip1 " +vip1.getName());
        System.out.println("Customer credit limit vip1" +vip1.getCreditLimit());

        VipAccount vip2=new VipAccount(9000,"lamda");
        System.out.println("Customer email vip2 " +vip2.getEmailAddress());
        System.out.println("Customer name vip2 " +vip2.getName());
        System.out.println("Customer credit limit vip2" +vip2.getCreditLimit());

        VipAccount vip3=new VipAccount(100,"balanc3","hemant003@jdd.com");
        System.out.println("Customer email vip3 " +vip3.getEmailAddress());
        System.out.println("Customer name vip2 " +vip3.getName());
        System.out.println("Customer credit limit vip3" +vip3.getCreditLimit());


    }
}
