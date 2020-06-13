package com.challenge;

public class Vechile {
    private String name;
    private String size;

    private int currentDirection;
    private int currentVelocity;

    public Vechile(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentDirection=0;
        this.currentVelocity=0;
    }

    public void steer(int direction){
        this.currentDirection=this.currentDirection+direction;
        System.out.println("Vechile.steer() called.Steering @" +direction +"degrees");
    }

    public void move(int velocity,int direction){
        this.currentVelocity=velocity;
        this.currentDirection=direction;
        System.out.println("Vechile.speed() called.Speeding @" +velocity +"km/hr in " +direction);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public void stop() {
        this.currentVelocity = 0;
    }
}
