/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author RoryGlenn
 */
public class Project1 {

    //c. Write an accompanying main method 
    //which invokes both power1 and power2 for 
    //increasing values of 𝑛 up to 𝑛 = 32
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            System.out.println(i + "! is "
                    + power1(i) + " iteratively.");
            System.out.println(i + "! is "
                    + power2(i) + " recursively.");
        }

    }

    
    
    //a. Write an iterative method power1 to compute 𝑥𝑛 for 𝑛 ≥ 0.
    public static int power1(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    //b. Write a recursive method power2 to compute 𝑥𝑛
    public static int power2(int n) {
        if (n == 0) {
            
            return 1;   
        } 
        
        else 
        {
            return n * power2(n - 1);
        }
    }

}

