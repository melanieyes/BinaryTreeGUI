// This class runs the entire application
/*
 This application visualize major departments at Fulbright by tree structure. 
 Functions of this application:
 Search: Type name on search bar -> faculty's name will change color
-----------------
 Find all faculty in a department: 
 Click on department's name -> all faculty's node will change color.
*/
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
    
    public static void main(String[] args) {
        Main app = new Main();
        Frame frame = new Frame();
        app.addComponentsToFrame(frame);
    }

    private void addComponentsToFrame(JFrame frame) { // Add all the components to the frame (canvas, buttons, etc)
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert("Huynh Viet Linh", "Computer Science");
        tree.insert("Huynh The Dang", "Computer Science");
        tree.insert("Phan Thanh Trung", "Computer Science");
        tree.insert("Nguyen Thi Trang", "Integrated Sciences");
        tree.insert("Nguyen Thi Huyen Trang", "Integrated Sciences");
        tree.insert("Nguyen Thi Hong Dung", "Integrated Sciences");
        tree.insert("Jesse Hollister", "Integrated Sciences");

        

        DepartmentPanel departmentPanel = new DepartmentPanel(); //Create bottom department sort panel
        SearchBar searchBar = new SearchBar(tree); //Create top node settings panel

        frame.add(searchBar);
        frame.setVisible(true); //Paint method is called whenever canvas needs to be drawn
    }
}

