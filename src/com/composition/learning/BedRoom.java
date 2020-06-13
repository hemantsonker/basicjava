package com.composition.learning;

public class BedRoom {
    private Furniture furniture;
    private Lamp lamp;
    private Bed bed;
    public BedRoom(Furniture furniture, Lamp lamp, Bed bed) {
        this.furniture = furniture;
        this.lamp = lamp;
        this.bed = bed;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Bed getBed() {
        return bed;
    }

    public void makeBed(){
        System.out.println("bed room making bed");
    }
}
