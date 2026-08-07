import java.awt.*;
import javax.swing.*;

public class splash {
    public static void main(String[] args) {
        fframe f1 = new fframe();
        f1.setVisible(true);
        int i;
        int x = 1;
        // ⭐ smoother animation
        for (i = 2; i <= 600; i += 2, x += 1) {
            f1.setLocation((800 - ((i + x) / 2)), 500 - (i / 2));
            f1.setSize(i + x, i);
            try {
                Thread.sleep(10);
            } catch (Exception e) {}
        }
        f1.setVisible(false);
        f1.dispose();
        new login().setVisible(true);
    }
}

class fframe extends JFrame implements Runnable {
    Thread t1;
    fframe() {
        super("Electricity Billing System");
        setLayout(new FlowLayout());
        // ⭐ replace images/icon.jpg with your own splash image
        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("images/icon.jpg"));
        Image i1 = ic.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
        ImageIcon icc1 = new ImageIcon(i1);
        JLabel l1 = new JLabel(icc1);
        add(l1);
        t1 = new Thread(this);
        t1.start();
    }
    public void run() {
        try {
            Thread.sleep(7000);
            setVisible(false);
            dispose();
        } catch (Exception e) {}
    }
}