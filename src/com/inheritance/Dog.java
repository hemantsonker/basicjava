package com.inheritance;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tails;
    private int teeth;
    private String coat;


    public Dog(String name, int weight, int size, int body, int brain, int eyes, int legs, int tails, int teeth, String coat) {
        super(name, weight, size, body, brain);
        this.eyes = eyes;
        this.legs = legs;
        this.tails = tails;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew(){
        System.out.println("dog chew called");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat called");
        chew();
        super.eat();
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Dog walk called");

    }
}
