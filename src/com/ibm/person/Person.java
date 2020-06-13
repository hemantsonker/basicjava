package com.ibm.person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0 && age<=100){
            this.age = age;
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public boolean isTeen(){
        if(age>12 && age<20){
            return true;
        }else{
            return false;
        }
    }

    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }else if(firstName.isEmpty() && !lastName.isEmpty()){
            return lastName.trim();
        }
        else  if(!firstName.isEmpty() && lastName.isEmpty()){
            return firstName.trim();
        }else{
            return firstName.trim() +" " +lastName.trim();
        }
    }

    public static void main(String[] args){
        Person p=new Person();
        p.setFirstName("uuu");
        p.setLastName("sonn");
        p.setAge(21);
        System.out.println("GET NAME"+ p.getFullName());
        System.out.println("isTeen" +p.isTeen());

    }
}
