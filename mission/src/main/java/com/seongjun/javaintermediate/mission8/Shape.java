package com.seongjun.javaintermediate.mission8;

public abstract class Shape {
    protected String type;
    protected double area;

    public Shape(String type, double area) {
        this.type = type;
        this.area = 0;
    }

    public String getType() {
        return type;
    }

    public double getArea() {
        return area;
    }

    public abstract void calculateArea();
}
