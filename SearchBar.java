import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class SearchBar extends JPanel implements ActionListener {
    JLabel label;
    JLabel result;
    JTextField text_field;
    JButton search_button;
    BinarySearchTree tree;

    SearchBar(BinarySearchTree tree) {
        int y_pos = 5;
        int x_pos_modify = 25;
        
        label = new JLabel("Enter name: ");
        label.setBounds(225 + x_pos_modify, y_pos,150,20);
        label.setForeground(Color.black);

        text_field = new JTextField(); 
        text_field.setBounds(300 + x_pos_modify, y_pos,200,20);

        search_button = new JButton("Search");
        search_button.setBounds(500 + x_pos_modify, y_pos,100,20);

        result = new JLabel("");
        result.setBounds(300 + x_pos_modify, y_pos + 20,500,20);
        result.setForeground(Color.BLACK);

        search_button.addActionListener(this);
        add(label);  
        add(result);
        add(text_field);  
        add(search_button);  
        setSize(300,300);  
        setLayout(null);    

    }

    public void actionPerformed(ActionEvent evt) {
        try {
            String text = text_field.getText();
            result.setText("Department: " + tree.get_department(tree.root, text));
        }
        
        catch (IllegalAccessError e) {
            result.setText("Person does not exist");
        }
    }
}