import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.*;

class Departments {
    JButton major;
    String text;
    int x_pos;
    int y_pos;
    int width;
    int height;
    public Departments(JButton major, String text, int x_pos, int y_pos, int width, int height) {
        this.major = major;
        this.text = text;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.width = width;
        this.height = height;
    }

    public void set_up_button() {
        this.major = new JButton(this.text);
        this.major.setForeground(Color.BLACK);
        this.major.setBackground(Color.CYAN);
        this.major.setBounds(this.x_pos, y_pos, this.width, this.height);
        this.major.addActionListener(this);
    }

    
}

public class DepartmentPanel extends JPanel implements ActionListener {
    DepartmentPanel() {
        JPanel panel = new JPanel();  
        panel.setBounds(40,80,200,200);    
        panel.setBackground(Color.gray); 
        JButton CS, IS, Math, Eng, Arts, Soci, Psy, Econ, VS, Lit, His;
        Departments comp_sci = new Departments(CS, "Computer Science", 10, 20, 20, 20);
        comp_sci.set_up_button();
        Departments in_sci = new Departments(IS, "Integrated Sciences", 10, 20, 20, 20);
        in_sci.set_up_button();
        Departments eng = new Departments(Eng, "Engineering", 10, 20, 20, 20);
        Departments math = new Departments(Math, "Applied Mathematics", 10, 20, 20, 20);
        Departments arts = new Departments(Arts, "Computer Science", 10, 20, 20, 20);
        Departments soci = new Departments(Soci, "Computer Science", 10, 20, 20, 20);
        Departments vs = new Departments(VS, "Computer Science", 10, 20, 20, 20);
        Departments lit = new Departments(Lit, "Computer Science", 10, 20, 20, 20);
        Departments psycho = new Departments(Psy, "Computer Science", 10, 20, 20, 20);
        Departments econ = new Departments(Econ, "Computer Science", 10, 20, 20, 20);
        Departments his = new Departments(His, "Computer Science", 10, 20, 20, 20);
     
    }

    DepartmentPanel(BinarySearchTree tree) {
        
    }



}