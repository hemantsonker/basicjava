package com.challenge;

public class Car extends Vechile {
    private int gear;
    private int doors;
    private int wheels;
    private boolean isManual;
    private int currentGear;

    public Car(String name, String size, int gear, int doors, int wheels, boolean isManual) {
        super(name, size);
        this.gear = gear;
        this.doors = doors;
        this.wheels = wheels;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println();
    }

    public void changeVelocity(int speed,int direction){
        move(speed,direction);
        System.out.println("speed "+speed +"in direction"+direction);
    }
}
