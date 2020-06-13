package com.practice.ineritance;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if(radius<0){
            this.radius=0.0;
        }else{
            this.radius = radius;
        }

    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        double area=Math.PI*radius*radius;
        return area;
    }
}
