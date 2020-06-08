package project3;

import javax.swing.*;
//import java.awt.*;
//import java.net.*;
//import java.awt.image.BufferedImage;
//import javax.imageio.ImageIO;
//import java.io.IOException;


import java.util.Scanner;
import java.util.Random;

public class pictureViewer{
    
    final static int MIN_NUMBER = 1;
    final static int MAX_NUMBER = 8;
    static int image_number = 1;
    static String FileName;
    static Random randGen = new Random();

    public static void main(String[] args) {
        
        showMenu();
    }

    public static void showMenu() {
        Scanner input = new Scanner(System.in);

        pictureViewer PV = new pictureViewer();
        boolean continuation = true;
        
        while (continuation == true) {

            System.out.println("Select one of the options");
            System.out.println("Option 1: Forward");
            System.out.println("Option 2: Backward");
            System.out.println("Option 3: Create File Name");
            System.out.println("Option 4: Create Random Name");
            System.out.println("Option 5: Show Menu");
            System.out.println("Option 6: Non-static forward");
            System.out.println("Option 7: Non-static backward");
            System.out.println("Option 8: Exit");

            int menu_Option = input.nextInt();

            switch (menu_Option) {
                case 1: {
                    image_number = forward(image_number);
                    System.out.println("The Current Number is: " + image_number);
                    break;
                }
                case 2: {
                    image_number = backward(image_number);
                    System.out.println("The Current Number is: " + image_number);
                    break;
                }
                case 3: {
                    FileName = createFileName(image_number);
                    PV.showWindow(FileName);
                    System.out.println("File Name: " + FileName);
                    break;
                }
                case 4: {
                    FileName = createRandomName();
                    PV.showWindow(FileName);
                    System.out.println("File Name: " + FileName);
                    break;
                }
                case 5: {
                    
                    break;
                }

                case 6: {
                    PV.forward();
                    break;
                }
                case 7: {
                    PV.backward();
                    break;
                }
                case 8: {
                    System.out.println("Goodbye");
                    continuation = false;
                    break;
                }
                
            }

        }

    }

    public static int forward(int current_number) {

        if (current_number >= MAX_NUMBER) {
            System.out.println(MIN_NUMBER);
            current_number = MIN_NUMBER;  
        } 
        
        else {
            System.out.println(++current_number);
        }

        return current_number;
    }

    public static int backward(int current_number) {
        if (current_number <= MIN_NUMBER) {
            System.out.println(MIN_NUMBER);
            current_number = MAX_NUMBER;
        } else {
            System.out.println(--current_number);
        }
        return current_number;
    }

    public static String createFileName(int current_number) {

        return "picture" + current_number + ".gif";
    }

    public static String createRandomName() {
        int current_number = randGen.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
        return "picture" + current_number + ".gif";
    }
    
    
    public void forward() {
        if (image_number >= MAX_NUMBER) 
            {
                System.out.println(MIN_NUMBER);
                image_number = MIN_NUMBER;
            } 
        
        else 
            {
                System.out.println(++image_number);
            }
    }

    public void backward() {
        if (image_number <= MIN_NUMBER) 
            {
                System.out.println(MIN_NUMBER);
                image_number = MAX_NUMBER;
            } 
        
        else 
            {
                System.out.println(--image_number);
            }
    }
    
     public void showWindow(String filename) 
        {   
            JFrame window = new JFrame();
            window.setTitle(filename);
            window.setVisible(true);
            window.setSize(600, 600); // 1024 x 768, 800 x 800
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}