package com.inheritance;

public class Animal {
    private String name;
    private int weight;
    private int size;
    private int body;
    private int brain;

    public Animal(String name, int weight, int size, int body, int brain) {
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.body = body;
        this.brain = brain;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }

    public int getBody() {
        return body;
    }

    public int getBrain() {
        return brain;
    }

    public void eat(){
        System.out.println("Animal.eat called()");
    }
    public void walk(){
        System.out.println("Animal. walk called()");
    }
}
