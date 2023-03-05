import javax.swing.*;
import java.awt.*;


public class Settimana2 extends JFrame {
    public Settimana2() {
        setSize(0, 0);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(false);
        setTitle("Settimana 2 - Orario VT");

        ImageIcon icon = new ImageIcon("C:/Users/Alfa/Desktop/provina/App Orario/settimana2.png");
        JLabel label = new JLabel(icon);

        getContentPane().add(label, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }


}