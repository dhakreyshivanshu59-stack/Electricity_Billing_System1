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

        // Report menu
        JMenu report = new JMenu("Report");
        report.setForeground(Color.WHITE);
        report.setFont(new Font("Segoe UI", Font.BOLD, 14));

        JMenuItem r1 = new JMenuItem("Generate Bill");
        r1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        r1.addActionListener(this);
        report.add(r1);

        // Utility menu
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.WHITE);
        utility.setFont(new Font("Segoe UI", Font.BOLD, 14));

        JMenuItem ut1 = new JMenuItem("Notepad");
        ut1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        ut1.addActionListener(this);

        JMenuItem ut2 = new JMenuItem("Calculator");
        ut2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        ut2.addActionListener(this);

        JMenuItem ut3 = new JMenuItem("Web Browser");
        ut3.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        ut3.addActionListener(this);

        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);

        // Exit menu
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.WHITE);
        exit.setFont(new Font("Segoe UI", Font.BOLD, 14));

        JMenuItem ex = new JMenuItem("Exit");
        ex.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        ex.addActionListener(this);
        exit.add(ex);

        mb.add(master);
        mb.add(user);
        mb.add(report);
        mb.add(utility);
        mb.add(exit);
        setJMenuBar(mb);

        setLayout(new FlowLayout());
        setVisible(false);
    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        if (msg.equals("Customer Details")) {
            new customer_details().setVisible(true);
        } else if (msg.equals("New Customer")) {
            new new_customer().setVisible(true);
        } else if (msg.equals("Calculate Bill")) {
            new calculate_bill().setVisible(true);
        } else if (msg.equals("Pay Bill")) {
            new pay_bill().setVisible(true);
        } else if (msg.equals("Notepad")) {
            try { Runtime.getRuntime().exec("notepad.exe"); } catch (Exception e) {}
        } else if (msg.equals("Calculator")) {
            try { Runtime.getRuntime().exec("calc.exe"); } catch (Exception e) {}
        } else if (msg.equals("Web Browser")) {
            try { Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"); } catch (Exception e) {}
        } else if (msg.equals("Exit")) {
            System.exit(0);
        } else if (msg.equals("Generate Bill")) {
            new generate_bill().setVisible(true);
        } else if (msg.equals("Last Bill")) {
            new LastBill().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new Project().setVisible(true);
    }
}