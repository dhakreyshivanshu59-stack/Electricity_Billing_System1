import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener {

    Project() {
        super("Electricity Billing System");
        setSize(1500, 800);
        setLocationRelativeTo(null);

        // Background image
        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("images/main.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1420, 720, Image.SCALE_SMOOTH);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        add(l1);

        // Menu bar
        JMenuBar mb = new JMenuBar();
        mb.setBackground(new Color(52, 73, 94));

        // Master menu
        JMenu master = new JMenu("Master");
        master.setForeground(Color.WHITE);
        master.setFont(new Font("Segoe UI", Font.BOLD, 14));

        JMenuItem m1 = new JMenuItem("New Customer");
        m1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        m1.addActionListener(this);

        JMenuItem m2 = new JMenuItem("Customer Details");
        m2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        m2.addActionListener(this);

        master.add(m1);
        master.add(m2);

        // User menu
        JMenu user = new JMenu("User");
        user.setForeground(Color.WHITE);
        user.setFont(new Font("Segoe UI", Font.BOLD, 14));

        JMenuItem u1 = new JMenuItem("Pay Bill");
        u1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        u1.addActionListener(this);

        JMenuItem u2 = new JMenuItem("Calculate Bill");
        u2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        u2.addActionListener(this);

        JMenuItem u3 = new JMenuItem("Last Bill");
        u3.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        u3.addActionListener(this);

        user.add(u1);
        user.add(u2);
        user.add(u3);

        mb.add(master);
        mb.add(user);
        setJMenuBar(mb);

        setLayout(new FlowLayout());
        setVisible(false);
    }

    public void actionPerformed(ActionEvent ae) {
        // Will implement later
    }

    public static void main(String[] args) {
        new Project().setVisible(true);
    }
}