package com.seongjun.javaintermediate.mission8;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        super("원", 0);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void calculateArea() {
        this.area = Math.PI*radius*radius;
    }
}
