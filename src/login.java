import java.awt.*;
import java.awt.event.*;
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
        add(l1);

        l2 = new JLabel("Password");
        l2.setBounds(40, 70, 100, 30);
        add(l2);

        tf1 = new JTextField();
        tf1.setBounds(150, 20, 150, 30);
        add(tf1);

        pf2 = new JPasswordField();
        pf2.setBounds(150, 70, 150, 30);
        add(pf2);

        b1 = new JButton("Login");
        b1.setBounds(40, 140, 120, 30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBounds(180, 140, 120, 30);
        b2.addActionListener(this);
        add(b2);

        setSize(400, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        // Placeholder for now
    }

    public static void main(String[] args) {
        new login().setVisible(true);
    }
}