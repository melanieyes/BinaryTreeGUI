/* This class runs the entire application
-------------------------

 This application visualize major departments at Fulbright by tree structure. 
 Functions of this application:
 1. Search: 
 Type name on search bar -> faculty's name will change color

 2. Find all faculty in a department: 
 Click on department's name -> all faculty's node will change color.
*/

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame {
    Frame() {
        this.setTitle("Fulbright Undergraduate Departments"); // set title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false); // prevent frame from being resized 
        this.setSize(1000, 1200); // set the x-dimension and y-dimension of frame 
        this.setVisible(true); // make frame visible     
        this.getContentPane().setBackground(new Color(255, 255, 255)); // Change color of background 
    }
}

