package com.inheritance;

public class Main {
    public static void main(String [] args){
        Animal animal;
        animal = new Animal("rhino",50,1,1,1);
        Dog dog=new Dog("dog",20,1,1,1,2,4,1,32,"blk");
      //  dog.eat();
        dog.walk();

    }
}
