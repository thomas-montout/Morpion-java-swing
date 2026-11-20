package Vue;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreMorpion extends JFrame implements ActionListener {

    // Joueurs
    private JLabel lblJ1 = new JLabel("Nom J1");
    private JTextField txtJ1 = new JTextField("");
    private JLabel lblJ2 = new JLabel("Nom J2");
    private JTextField txtJ2 = new JTextField("");

    // Mode
    private JRadioButton rb2joueurs = new JRadioButton("2 joueurs");
    private JRadioButton rbOrdinateur = new JRadioButton("Ordinateur");
    private ButtonGroup groupeMode = new ButtonGroup();

    // Liste des coups
    private JTextArea txtListeCoups = new JTextArea();

    // Grille
    private JLabel lblTour = new JLabel("À Thomas de jouer (X)");
    private JButton tab[] = new JButton[9];

    // Temps
    private JRadioButton rbSans = new JRadioButton("Sans");
    private JRadioButton rbAvec = new JRadioButton("Avec");
    private ButtonGroup groupeTemps = new ButtonGroup();
    private JLabel lblChrono = new JLabel("00:00");

    // Boutons du bas
    private JButton btSauvegarder = new JButton("Sauvegarder");
    private JButton btCharger = new JButton("Charger");
    private JButton btRejouer = new JButton("Rejouer");
    private JButton btQuitter = new JButton("Quitter");


    public FenetreMorpion() {
        this.setTitle("TP Jeu Morpion 2027");
        this.setSize(660, 460);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);

        // --- Joueurs ---
        lblJ1.setBounds(20, 20, 60, 25);
        this.add(lblJ1);
        txtJ1.setBounds(80, 20, 170, 25);
        this.add(txtJ1);

        lblJ2.setBounds(20, 55, 60, 25);
        this.add(lblJ2);
        txtJ2.setBounds(80, 55, 170, 25);
        this.add(txtJ2);

        // --- Mode ---
        groupeMode.add(rb2joueurs);
        groupeMode.add(rbOrdinateur);
        rb2joueurs.setSelected(true);

        rb2joueurs.setBounds(20, 95, 100, 25);
        this.add(rb2joueurs);
        rbOrdinateur.setBounds(130, 95, 110, 25);
        this.add(rbOrdinateur);

        // --- Liste des coups ---
        txtListeCoups.setEditable(false);
        txtListeCoups.setBounds(20, 135, 230, 200);
        this.add(txtListeCoups);

        // --- Grille ---
        lblTour.setBounds(330, 15, 240, 25);
        this.add(lblTour);

        for (int i = 0; i < 9; i++) {
            tab[i] = new JButton("");
            int x = 330 + (i % 3) * 80;
            int y = 45 + (i / 3) * 80;
            tab[i].setBounds(x, y, 75, 75);
            tab[i].addActionListener(this);
            this.add(tab[i]);
        }

        // --- Temps ---
        groupeTemps.add(rbSans);
        groupeTemps.add(rbAvec);
        rbSans.setSelected(true);

        rbSans.setBounds(330, 300, 70, 25);
        this.add(rbSans);
        rbAvec.setBounds(400, 300, 70, 25);
        this.add(rbAvec);
        lblChrono.setBounds(510, 300, 60, 25);
        this.add(lblChrono);

        // --- Boutons du bas ---
        btSauvegarder.setBounds(20, 360, 120, 30);
        this.add(btSauvegarder);
        btCharger.setBounds(150, 360, 120, 30);
        this.add(btCharger);
        btRejouer.setBounds(410, 360, 100, 30);
        this.add(btRejouer);
        btQuitter.setBounds(520, 360, 100, 30);
        this.add(btQuitter);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
