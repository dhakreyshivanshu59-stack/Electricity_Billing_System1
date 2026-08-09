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

        mb.add(master);
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