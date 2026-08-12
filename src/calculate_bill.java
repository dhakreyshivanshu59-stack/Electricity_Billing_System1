import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class calculate_bill extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    Choice c1;
    JButton b1;

    calculate_bill() {
        setLayout(null);
        setSize(600, 300);
        setLocationRelativeTo(null); // ⭐
        getContentPane().setBackground(new Color(240, 244, 248));

        l1 = new JLabel("Calculate Bill");
        l1.setFont(new Font("Segoe UI", Font.BOLD, 22));
        l1.setForeground(new Color(44, 62, 80));
        l1.setBounds(200, 10, 200, 30);
        add(l1);

        l2 = new JLabel("Meter Number");
        l2.setBounds(50, 70, 100, 30);
        add(l2);
        c1 = new Choice();
        c1.setBounds(180, 70, 150, 30);
        // Populate choices from database (sample)
        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select meter_number from emp");
            while (rs.next()) c1.add(rs.getString("meter_number"));
        } catch (Exception e) {}
        add(c1);

        l3 = new JLabel("Units Consumed");
        l3.setBounds(50, 120, 120, 30);
        add(l3);
        t1 = new JTextField();
        t1.setBounds(180, 120, 150, 30);
        add(t1);

        l4 = new JLabel("Total Bill");
        l4.setBounds(50, 170, 100, 30);
        add(l4);
        t2 = new JTextField();
        t2.setBounds(180, 170, 150, 30);
        t2.setEditable(false);
        add(t2);

        b1 = new JButton("Calculate");
        b1.setBackground(new Color(46, 204, 113));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 14));
        b1.setBounds(200, 220, 120, 30);
        b1.addActionListener(this);
        add(b1);
        setVisible(false);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            int units = Integer.parseInt(t1.getText());
            int amount = 0;
            if (units <= 100) amount = units * 5;
            else if (units <= 200) amount = 100 * 5 + (units - 100) * 7;
            else amount = 100 * 5 + 100 * 7 + (units - 200) * 10;
            t2.setText(String.valueOf(amount));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter valid units");
        }
    }

    public static void main(String[] args) {
        new calculate_bill().setVisible(true);
    }
}