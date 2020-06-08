package project5;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Project5 extends JFrame {

    private Shape[] thearray = new Shape[100]; // 100 Shapes, circle's, tri's and rects

    public Project5() {
        setTitle("Window");
        setVisible(true);
        setSize(600, 600); // 1024 x 768, 800 x 800
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        Project5 tpo = new Project5();

        tpo.add(new NewPanel());

        tpo.run();

    } // end of main

    public void run() {

        int count = 0;

// ------------------------ Fill the array section ----------------------
        thearray[count++] = new Circle(20, 20, 40);

        thearray[count++] = new Triangle(70, 70, 20, 30);

        thearray[count++] = new Rectangle(150, 150, 40, 40);

// ------------------------------ array fill done ------------------------
//--------------------------- loop through the array --------------------
        for (int i = 0; i < count; i++) { // loop through all objects in the array

            thearray[i].display(); // don’t care what kind of object, display it

        } // end for loop

        int offset = 0;

        double totalarea = 0.0;

        while (thearray[offset] != null) { // loop through all objects in the array

            totalarea = totalarea + thearray[offset].area(); // get area for this object

            offset++;

        } // end while loop

        System.out.println("The total area for " + offset + " Shape objects is " + totalarea);

    } // end of run

    static class NewPanel extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            
            
        }
    }

} // end of class Project5
