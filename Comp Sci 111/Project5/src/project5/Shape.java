package project5;
import java.awt.Graphics;


public abstract class Shape {

    private int x;
    private int y;

    public Shape() {
        x = 0;
        y = 0;
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void display(Graphics g);
    public abstract void display();
    public abstract double area();
}