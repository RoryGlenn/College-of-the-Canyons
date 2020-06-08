package project4;

import java.util.Scanner;

public class shirt {

    private int size;
    private String color;
    private String brand;

    public shirt() {

        size = 1;
        color = "White";
        brand = "Khols";
    }

    public shirt(int size, String color, String brand) {
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
            this.color = "Red";
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
            this.brand = "Khols";
        }
    }

    public String toString() {

        return "Shirt: Size: " + size + " Color: " + color + " Brand: " + brand;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What shirt size would you like: ");
        int shirtSize = input.nextInt();
        input.nextLine();
        System.out.println("What shirt color would you like: ");
        String shirtColor = input.nextLine();
        System.out.println("What shirt brand would you like: ");
        String shirtBrand = input.nextLine();

        shoes userShoes = new shoes(shirtSize, shirtColor, shirtBrand);
        System.out.println(userShoes);

    }

}
