package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreMorpion extends JFrame  implements ActionListener {

    // Colors
    private Color fond = new Color(0x16181D);
    private Color panneau = new Color(0x22262E);
    private Color texte = new Color(0xE8EAED);
    private Color bleuX = new Color(0x4FC3F7);
    private Color orangeO = new Color(0xFFB74D);
    private Color bordure = new Color(0x3A404C);

    // Elements
    private JTextField txtJ1 = new JTextField("");
    private JLabel lblJ1 = new JLabel("Joueur 1");
    private JTextField txtJ2 = new JTextField("");
    private JLabel lblJ2 = new JLabel("Joueur 2");

    private JRadioButton rb2joueur = new JRadioButton("2 joueurs");
    private JRadioButton rbOrdinateur = new JRadioButton("Ordinateur");
    private ButtonGroup groupeMode = new ButtonGroup();

    private JButton tab[] = new JButton[9];

    private JTextArea txtListeCoups = new JTextArea();
    private JButton btSauvegarder = new JButton("Sauvegarder");
    private JButton btCharger = new JButton("Charger");

    private JLabel lbltemps = new JLabel("Temps: ");
    private JRadioButton rbSans = new JRadioButton("Sans");
    private JRadioButton rbAvec = new JRadioButton("Avec");

    private JButton btRejouer = new JButton("Rejouer");
    private JButton btQuitter = new JButton("Quitter");


    public FenetreMorpion() {
        this.setTitle("Super Morpion");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().setBackground(panneau);

        groupeMode.add(rb2joueur);
        groupeMode.add(rbOrdinateur);
        rb2joueur.setSelected(true);

        lblJ1.setForeground(this.texte);
        lblJ2.setForeground(this.texte);

        txtJ1.setBackground(this.fond);
        txtJ1.setForeground(this.texte);
        txtJ1.setCaretColor(this.texte);
        txtJ1.setBorder(BorderFactory.createLineBorder(this.bordure));

        txtJ2.setBackground(this.fond);
        txtJ2.setForeground(this.texte);
        txtJ2.setCaretColor(this.texte);
        txtJ2.setBorder(BorderFactory.createLineBorder(this.bordure));

        btRejouer.setBackground(this.bleuX);
        btRejouer.setForeground(Color.BLACK);
        btRejouer.setFocusPainted(false);

        btQuitter.setBackground(this.bleuX);
        btQuitter.setForeground(Color.BLACK);
        btQuitter.setFocusPainted(false);

        this.setLayout(null);

        this.lblJ1.setBounds(20, 40, 80, 20);
        this.add(this.lblJ1);
        this.lblJ2.setBounds(20, 80, 80, 20);
        this.add(this.lblJ2);
        this.txtJ1.setBounds(100, 40, 140, 20);
        this.add(this.txtJ1);
        this.txtJ2.setBounds(100, 80, 140, 20);
        this.add(this.txtJ2);

        this.rb2joueur.setBounds(20, 120, 100, 20);
        this.add(this.rb2joueur);
        this.rbOrdinateur.setBounds(20, 160, 100, 20);
        this.add(this.rbOrdinateur);

        this.txtListeCoups.setBounds(20, 200, 220, 240);
        this.add(this.txtListeCoups);

        this.btSauvegarder.setBounds(20, 500, 150, 20);
        this.add(this.btSauvegarder);
        this.btCharger.setBounds(190, 500, 150, 20);
        this.add(this.btCharger);

        this.btQuitter.setBounds(400, 540, 150, 20);
        this.add(this.btQuitter);

        this.btRejouer.setBounds(400, 580, 150, 20);
        this.add(this.btRejouer);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
