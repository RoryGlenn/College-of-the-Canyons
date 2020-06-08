/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;

import java.util.Scanner;

public class shoes {

    private int size;
    private String color;
    private String brand;

    public shoes() {

        size = 1;
        color = "Black";
        brand = "Vans";
    }

    public shoes(int size, String color, String brand) {
        setSize(size);
        setColor(color);
        setBrand(brand);
    }

    public int getSize() {

        return size;
    }

    public void setSize(int size) {

        if (size >= 0) {
            this.size = size;
        } else {
            System.out.println("Not a valid answer");
            this.size = 1;
        }
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        if (color.length() > 0) {
            this.color = color;
        } else {
            System.out.println("Not a valid answer");
            this.color = "Black";
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.length() > 0) {
            this.brand = brand;
        } else {
            System.out.println("Not a valid answer");
            this.brand = "Vans";
        }
    }

    public String toString() {

        return "Shirt: Size: " + size + " Color: " + color + " Brand: " + brand;

    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What shoe size would you like: ");
        int shoeSize = input.nextInt();
        input.nextLine();
        System.out.println("What shoe color would you like: ");
        String shoeColor = input.nextLine();
        System.out.println("What shoe brand would you like: ");
        String shoeBrand = input.nextLine();

        shoes userShoes = new shoes(shoeSize, shoeColor, shoeBrand);
        System.out.println(userShoes);
        
    }

}
