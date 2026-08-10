import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class new_customer extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JTextField t1, t2, t3, t4, t5, t6, t7;
    JButton b1, b2;

    new_customer() {
        setLayout(null);
        setSize(700, 500);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(240, 244, 248)); // Added

        l1 = new JLabel("NEW CUSTOMER");
        l1.setFont(new Font("Segoe UI", Font.BOLD, 28));
        l1.setForeground(new Color(44, 62, 80));
        l1.setBounds(250, 10, 300, 30);
        add(l1);

        l2 = new JLabel("Name");
        l2.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // Added
        l2.setBounds(50, 80, 100, 30);
        add(l2);
        t1 = new JTextField();
        t1.setBounds(180, 80, 200, 30);
        add(t1);

        l3 = new JLabel("Meter Number");
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // Added
        l3.setBounds(50, 130, 100, 30);
        add(l3);
        t2 = new JTextField();
        t2.setBounds(180, 130, 200, 30);
        add(t2);

        l4 = new JLabel("Address");
        l4.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // Added
        l4.setBounds(50, 180, 100, 30);
        add(l4);
        t3 = new JTextField();
        t3.setBounds(180, 180, 200, 30);
        add(t3);

        l5 = new JLabel("State");
        l5.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // Added
        l5.setBounds(50, 230, 100, 30);
        add(l5);
        t4 = new JTextField();
        t4.setBounds(180, 230, 200, 30);
        add(t4);

        l6 = new JLabel("City");
        l6.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // Added
        l6.setBounds(50, 280, 100, 30);
        add(l6);
        t5 = new JTextField();
        t5.setBounds(180, 280, 200, 30);
        add(t5);

        l7 = new JLabel("Email");
        l7.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // Added
        l7.setBounds(50, 330, 100, 30);
        add(l7);
        t6 = new JTextField();
        t6.setBounds(180, 330, 200, 30);
        add(t6);

        l8 = new JLabel("Phone");
        l8.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // Added
        l8.setBounds(50, 380, 100, 30);
        add(l8);
        t7 = new JTextField();
        t7.setBounds(180, 380, 200, 30);
        add(t7);

        b1 = new JButton("Submit");
        b1.setBackground(new Color(46, 204, 113)); // Added green
        b1.setForeground(Color.WHITE);             // Added white text
        b1.setFont(new Font("Segoe UI", Font.BOLD, 14)); // Added
        b1.setBounds(100, 430, 120, 30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBackground(new Color(189, 195, 199)); // Added grey
        b2.setForeground(Color.BLACK);              // Added black text
        b2.setFont(new Font("Segoe UI", Font.BOLD, 14)); // Added
        b2.setBounds(280, 430, 120, 30);
        b2.addActionListener(this);
        add(b2);

        setVisible(false);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String name = t1.getText();
            String meter = t2.getText();
            String address = t3.getText();
            String state = t4.getText();
            String city = t5.getText();
            String email = t6.getText();
            String phone = t7.getText();
            try {
                conn c = new conn();
                String q = "insert into emp values('" + name + "','" + meter + "','" + address + "','" + state + "','" + city + "','" + email + "','" + phone + "')";
                c.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Customer Added Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new new_customer().setVisible(true);
    }
}