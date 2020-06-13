package com.composition.learning;

public class MainRoom {
    public static void main(String[] args) {
        Bed newBed=new Bed("king",4,20,1,1);
        Furniture furnitureType=new Furniture("chair","wood");
        Lamp newLamp=new Lamp("mono",true,1);
        BedRoom newBedRoom=new BedRoom(furnitureType,newLamp,newBed);
        newBedRoom.makeBed();
        newBedRoom.getLamp().turnOn();
    }
}
