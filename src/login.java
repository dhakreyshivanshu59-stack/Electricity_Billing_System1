import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class login extends JFrame implements ActionListener {
    JLabel l1, l2;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1, b2;

    login() {
        super("Login Page");
        setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(40, 20, 100, 30);
        l1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        add(l1);

        l2 = new JLabel("Password");
        l2.setBounds(40, 70, 100, 30);
        l2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        add(l2);

        tf1 = new JTextField();
        tf1.setBounds(150, 20, 150, 30);
        tf1.setBackground(Color.WHITE);
        add(tf1);

        pf2 = new JPasswordField();
        pf2.setBounds(150, 70, 150, 30);
        pf2.setBackground(Color.WHITE);
        add(pf2);

        b1 = new JButton("Login");
        b1.setBounds(40, 140, 120, 30);
        b1.setBackground(new Color(52, 152, 219));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 14));
        b1.setFocusPainted(false);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(180, 140, 120, 30);
        b2.setBackground(new Color(189, 195, 199));
        b2.setForeground(Color.BLACK);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 14));
        b2.setFocusPainted(false);
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(new Color(240, 244, 248));
        setSize(400, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        // Handle Cancel button
        if (ae.getSource() == b2) {
            System.exit(0);
            return;
        }

        // Handle Login button
        String u = tf1.getText().trim();
        String v = pf2.getText().trim();

        // Input validation
        if (u.isEmpty() || v.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username and password cannot be empty");
            return;
        }

        try {
            conn c1 = new conn();
            String q = "select * from login where username='" + u + "' and password='" + v + "'";
            ResultSet rs = c1.s.executeQuery(q);
            if (rs.next()) {
                new Project().setVisible(true);
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
                tf1.setText("");
                pf2.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database connection error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new login().setVisible(true);
    }
}