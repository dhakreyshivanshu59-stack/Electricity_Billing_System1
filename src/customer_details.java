import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class customer_details extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField t1, t2, t3, t4, t5, t6, t7;
    JButton b1;

    customer_details() {
        setLayout(null);
        setSize(700, 500);
        setLocationRelativeTo(null);

        l1 = new JLabel("CUSTOMER DETAILS");
        l1.setFont(new Font("Segoe UI", Font.BOLD, 24));
        l1.setForeground(new Color(44, 62, 80));
        l1.setBounds(250, 10, 300, 30);
        add(l1);

        l2 = new JLabel("Name");
        l2.setBounds(50, 80, 100, 30);
        add(l2);
        t1 = new JTextField();
        t1.setBounds(180, 80, 200, 30);
        t1.setEditable(false);
        add(t1);

        l3 = new JLabel("Meter Number");
        l3.setBounds(50, 130, 100, 30);
        add(l3);
        t2 = new JTextField();
        t2.setBounds(180, 130, 200, 30);
        t2.setEditable(false);
        add(t2);

        l4 = new JLabel("Address");
        l4.setBounds(50, 180, 100, 30);
        add(l4);
        t3 = new JTextField();
        t3.setBounds(180, 180, 200, 30);
        t3.setEditable(false);
        add(t3);

        l5 = new JLabel("State");
        l5.setBounds(50, 230, 100, 30);
        add(l5);
        t4 = new JTextField();
        t4.setBounds(180, 230, 200, 30);
        t4.setEditable(false);
        add(t4);

        l6 = new JLabel("City");
        l6.setBounds(50, 280, 100, 30);
        add(l6);
        t5 = new JTextField();
        t5.setBounds(180, 280, 200, 30);
        t5.setEditable(false);
        add(t5);

        l7 = new JLabel("Email");
        l7.setBounds(50, 330, 100, 30);
        add(l7);
        t6 = new JTextField();
        t6.setBounds(180, 330, 200, 30);
        t6.setEditable(false);
        add(t6);

        JLabel l8 = new JLabel("Phone");
        l8.setBounds(50, 380, 100, 30);
        add(l8);
        t7 = new JTextField();
        t7.setBounds(180, 380, 200, 30);
        t7.setEditable(false);
        add(t7);

        b1 = new JButton("Show Details");
        b1.setBounds(250, 430, 150, 30);
        b1.addActionListener(this);
        add(b1);

        setVisible(false);
    }

    public void actionPerformed(ActionEvent ae) {
        // Placeholder for now
    }

    public static void main(String[] args) {
        new customer_details().setVisible(true);
    }
}