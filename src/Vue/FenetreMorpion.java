package Vue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreMorpion extends JFrame  implements ActionListener {

    private JTextField txtJ1 = new JTextField("J1");
    private JLabel lblJ1 = new JLabel("J1");
    private JTextField txtJ2 = new JTextField("J2");
    private JLabel lblJ2 = new JLabel("J2");

    private JRadioButton rb2joueur = new JRadioButton("2 joueurs");
    private JRadioButton rbOrdinateur = new JRadioButton("Ordinateur");


    private JButton tab[] = new JButton[9];

    private JTextArea txtListeCoups = new JTextArea();
    private JButton btSave = new JButton("Sauvegarder");
    private JButton btLoad = new JButton("Charger");

    private JLabel temps = new JLabel("Temps: ");
    private JRadioButton rbSans = new JRadioButton("Sans");
    private JRadioButton rbAvec = new JRadioButton("Avec");

    private JButton btReplay = new JButton("Replay");
    private JButton btLeave = new JButton("Leave");


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
