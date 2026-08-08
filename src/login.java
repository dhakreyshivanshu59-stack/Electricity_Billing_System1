import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;   // Added this

public class login extends JFrame implements ActionListener {
    // ... (rest of the code remains same)

    public void actionPerformed(ActionEvent ae) {
        try {
            conn c1 = new conn();
            String u = tf1.getText();
            String v = pf2.getText();
            String q = "select * from login where username='" + u + "' and password='" + v + "'";
            ResultSet rs = c1.s.executeQuery(q);
            if (rs.next()) {
                new Project().setVisible(true);
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid login");
                tf1.setText("");
                pf2.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}