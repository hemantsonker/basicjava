package com.ibm.learning;

public class MyFirstClass {
    public static void main(String[] arg){
        Car porsche=new Car();
        Car bmw=new Car();
      //
        porsche.setColor("blue");
        porsche.setDoors(4);
        porsche.setEngine("k3");
        porsche.setModel("2020");
        porsche.setWheels(4);

        System.out.println(porsche.getColor());
    }
}
