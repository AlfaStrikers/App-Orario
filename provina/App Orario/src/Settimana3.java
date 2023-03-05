import javax.swing.*;
import java.awt.*;


public class Settimana3 extends JFrame {
    public Settimana3() {
        setSize(0, 0);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(false);
        setTitle("Settimana 3 - Orario VT");

        ImageIcon icon = new ImageIcon("C:/Users/Alfa/Desktop/provina/App Orario/settimana3.png");
        JLabel label = new JLabel(icon);

        getContentPane().add(label, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }


}
