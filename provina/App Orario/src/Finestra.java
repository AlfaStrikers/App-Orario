
/*Componenti importati: Swing (Set componenti GUI), AWT(Set per la personalizzazione della GUI)
ActionEvent e Listener (Per la gestione degli eventi collegata ai pulsanti per aprire altre finestre)
Progetto creato da Antonio C.M Friuli con l'aiuto dei tutorial di w3school e ChatGPT
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Finestra extends JFrame {

        public Finestra() {
            super("Orario VT");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(255, 170);
            setResizable(false);
            setLocationRelativeTo(null);
            JButton pulsante1 = new JButton("Settimana 1");
            add(pulsante1);
            JButton pulsante2 = new JButton("Settimana 2");
            add(pulsante2);
            JButton pulsante3 = new JButton("Settimana 3");
            add(pulsante3);
            JButton pulsante4 = new JButton("Settimana 4");
            add(pulsante4);

            // Evento collegato al pulsante 1 per poter aprire la finestra Settimana1
            pulsante1.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    Settimana1 settimana1 = new Settimana1();
                    settimana1.setVisible(true);
                }
            });

            pulsante2.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    Settimana2 settimana2 = new Settimana2();
                    settimana2.setVisible(true);
                }
            });

            pulsante3.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    Settimana3 settimana3 = new Settimana3();
                    settimana3.setVisible(true);
                }
            });

            pulsante4.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    Settimana4 settimana4 = new Settimana4();
                    settimana4.setVisible(true);
                }
            });

            // Nuovo container con BoxLayout verticale
            Container contentPane = getContentPane();
            contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

            // Aggiungo i pulsanti al container e uso il BoxFiller per spostarli più al centro per non farli sbattere sopra e sotto
            contentPane.add(Box.createVerticalGlue());
            contentPane.add(pulsante1);
            contentPane.add(pulsante2);
            contentPane.add(pulsante3);
            contentPane.add(pulsante4);
            contentPane.add(Box.createVerticalGlue());

            // Centro i pulsanti nel container (non mi piacciono attaccati alla finestra)
            pulsante1.setAlignmentX(JButton.CENTER_ALIGNMENT);
            pulsante2.setAlignmentX(JButton.CENTER_ALIGNMENT);
            pulsante3.setAlignmentX(JButton.CENTER_ALIGNMENT);
            pulsante4.setAlignmentX(JButton.CENTER_ALIGNMENT);



            setVisible(true);


        }
    }
