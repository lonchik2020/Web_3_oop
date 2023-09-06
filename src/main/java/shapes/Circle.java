package shapes;

import interfaces.IDanceable;

public class Circle extends Shape implements IDanceable {

   private int radius;

    public Circle(int x, int y, String color, boolean visible, int radius) {
        super(x, y, color, visible);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getParameter() {
        return Math.PI*2*radius;
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void drawing() {
        System.out.println("drawing");
        System.out.println(STR);
    }

    @Override
    public void dancingTango() {
        System.out.println("dancingTango circle");
        System.out.println(STR);
    }

    @Override
    public void dancingSalsa() {
        IDanceable.super.dancingSalsa();

    }
}
