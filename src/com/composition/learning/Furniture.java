package com.composition.learning;

public class Furniture {
    private String type;
    private String material;

    public Furniture(String type, String material) {
        this.type = type;
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }
}
