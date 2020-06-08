package project5;

import java.awt.Graphics;

public class Circle extends Shape {

    private int radius;

    public Circle() {
        super();
        radius = 1;
    }
    
    public Circle(int radius){
        this.radius = radius;
    }

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void display() {
        System.out.println("Circle values: X = " + getX() + " Y = " + getY()
                + " Radius = " + radius);
    }

    @Override
    public double area() {
        double area = radius * radius * Math.PI;
        return area;
    }

    @Override
    public void display(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
