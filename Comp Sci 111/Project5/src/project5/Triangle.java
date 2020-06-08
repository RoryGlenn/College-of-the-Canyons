/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5;

import java.awt.Graphics;

/**
 *
 * @author RoryGlenn
 */
public class Triangle extends Shape {
    private int base;
    private int height;
    
    public Triangle()
    {
        super();
        base = 1;
        height = 1;
    }
    
    public Triangle(int x, int y, int height, int base)
    {
        super(x, y);
        this.height = height;
        this.base = base;         
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public void setHeight(int height)
    {
        this.height = height;
    }
    
    public int getBase()
    {
        return base;
    }
    
    public void setBase(int base)
    {
        this.base = base;
    }

    @Override
    public void display() {
        System.out.println("Triangle values: X = " + getX() + " Y = " + getY()
                + " Base = " + getBase() + " Height = " + getHeight());
    }

    @Override
    public double area() {
        double area = base * height / 2;
        return area;
    }

    @Override
    public void display(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
