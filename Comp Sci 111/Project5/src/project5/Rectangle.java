package project5;

import java.awt.Graphics;

public class Rectangle extends Shape {

    private int height;
    private int width;

    public Rectangle() {
        super();
        height = 1;
        width = 1;
    }

    public Rectangle(int x, int y, int height, int width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    // set method takes a parameter
    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void display() {
        System.out.println("Rectangle values: X = " + getX() + " Y = " + getY()
                + " Width = " + getWidth() + " Height = " + getHeight());
    }

    @Override
    public double area() {
        double area = width * height;
        return area;
    }

    @Override
    public void display(Graphics g) {
        g.drawRect(getX(), getY(), width, height);
    }

}
