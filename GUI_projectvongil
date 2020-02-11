/**
 *Text genereted by Simple GUI Extension for BlueJ
 */
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class GUI_projectvonGil extends JFrame {

    private JButton JBaufnahme;
    private JButton JBbehandle;
    private JButton JBsucheAlle;
    private JButton JBsucheNoch;
    private JButton JBsucheNot;
    private JCheckBox JCBaufnahmeNotfall;
    private JLabel JLalle;
    private JLabel JLaufnahme;
    private JLabel JLausgabe;
    private JLabel JLbehandle;
    private JLabel JLnoch;
    private JLabel JLnot;
    private JLabel JLsuche;
    private JLabel JLsucheIn;
    private JLabel JLvorhanden;
    private JLabel JLvorhandenName;
    private JLabel JLvorhandenNotfall;
    private JTextArea JTAalle;
    private JTextArea JTAnoch;
    private JTextArea JTAnot;
    private JTextArea JTAsucheNameNotfall;
    private JTextField JTFaufnahmeName;
    private JTextField JTFbehandle;
    private JTextField JTFsuche;
    private JTextField JTFsucheVorhanden;
    Model aModel;

    public GUI_projectvonGil(Model pModel){

        this.setTitle("Notaufnahme");
        this.setSize(610,650);
        aModel = pModel;

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(610,650));
        contentPane.setBackground(new Color(192,192,192));

        JCBaufnahmeNotfall = new JCheckBox();
        JCBaufnahmeNotfall.setBounds(320,5,90,35);
        JCBaufnahmeNotfall.setBackground(new Color(214,217,223));
        JCBaufnahmeNotfall.setForeground(new Color(0,0,0));
        JCBaufnahmeNotfall.setEnabled(true);
        JCBaufnahmeNotfall.setFont(new Font("sansserif",0,12));
        JCBaufnahmeNotfall.setText("Notfall?");
        JCBaufnahmeNotfall.setVisible(true);

        JBaufnahme = new JButton();
        JBaufnahme.setBounds(450,5,140,35);
        JBaufnahme.setBackground(new Color(214,217,223));
        JBaufnahme.setForeground(new Color(0,0,0));
        JBaufnahme.setEnabled(true);
        JBaufnahme.setFont(new Font("sansserif",0,12));
        JBaufnahme.setText("Hinzufügen");
        JBaufnahme.setVisible(true);
        JBaufnahme.addActionListener(new ActionListener()
             {
                 public void actionPerformed(ActionEvent e)
                 {
                     aModel.einliefern(JTFaufnahmeName.getText(), JCBaufnahmeNotfall.isSelected());
                     JCBaufnahmeNotfall.setSelected(false);
                     JTFaufnahmeName.setText("Name");
                 }
             }
        );

        JBbehandle = new JButton();
        JBbehandle.setBounds(343,191,200,35);
        JBbehandle.setBackground(new Color(214,217,223));
        JBbehandle.setForeground(new Color(0,0,0));
        JBbehandle.setEnabled(true);
        JBbehandle.setFont(new Font("sansserif",0,12));
        JBbehandle.setText("Behandlung");
        JBbehandle.setVisible(true);
        JBbehandle.addActionListener(new ActionListener()
             {
                 public void actionPerformed(ActionEvent e)
                 {
                     aModel.behandeln(JTFbehandle.getText());
                     JTFbehandle.setText("Name");
                 }
             }
        );

        JBsucheAlle = new JButton();
        JBsucheAlle.setBounds(258,56,110,35);
        JBsucheAlle.setBackground(new Color(214,217,223));
        JBsucheAlle.setForeground(new Color(0,0,0));
        JBsucheAlle.setEnabled(true);
        JBsucheAlle.setFont(new Font("SansSerif",0,12));
        JBsucheAlle.setText("Alle Patienten");
        JBsucheAlle.setVisible(true);
        JBsucheAlle.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              {
                    aModel.patientVorhandenAusgabe(JTFsuche.getText());
              }
          }
        );
        JBsucheNoch = new JButton();
        JBsucheNoch.setBounds(461,55,140,35);
        JBsucheNoch.setBackground(new Color(214,217,223));
        JBsucheNoch.setForeground(new Color(0,0,0));
        JBsucheNoch.setEnabled(true);
        JBsucheNoch.setFont(new Font("SansSerif",0,12));
        JBsucheNoch.setText("Noch zu behandeln");
        JBsucheNoch.setVisible(true);
        JBsucheNoch.addActionListener(new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              {
                  aModel.patientNochZuBehandelnAusgabe(JTFsuche.getText());
              }
          }
        );

        JBsucheNot = new JButton();
        JBsucheNot.setBounds(371,55,90,35);
        JBsucheNot.setBackground(new Color(214,217,223));
        JBsucheNot.setForeground(new Color(0,0,0));
        JBsucheNot.setEnabled(true);
        JBsucheNot.setFont(new Font("sansserif",0,12));
        JBsucheNot.setText("Notfälle");
        JBsucheNot.setVisible(true);
        JBsucheNot.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent e)
             {
                 aModel.patientNotfallAusgabe(JTFsuche.getText());
             }
         }
        );

        JLalle = new JLabel();
        JLalle.setBounds(32,284,90,35);
        JLalle.setBackground(new Color(214,217,223));
        JLalle.setForeground(new Color(0,0,0));
        JLalle.setEnabled(true);
        JLalle.setFont(new Font("sansserif",0,12));
        JLalle.setText("Alle Patienten");
        JLalle.setVisible(true);

        JLaufnahme = new JLabel();
        JLaufnahme.setBounds(10,5,140,35);
        JLaufnahme.setBackground(new Color(214,217,223));
        JLaufnahme.setForeground(new Color(0,0,0));
        JLaufnahme.setEnabled(true);
        JLaufnahme.setFont(new Font("SansSerif",0,12));
        JLaufnahme.setText("Aufnahme Patient Name:");
        JLaufnahme.setVisible(true);

        JLausgabe = new JLabel();
        JLausgabe.setBounds(17,248,120,35);
        JLausgabe.setBackground(new Color(214,217,223));
        JLausgabe.setForeground(new Color(0,0,0));
        JLausgabe.setEnabled(true);
        JLausgabe.setFont(new Font("sansserif",0,12));
        JLausgabe.setText("Ausgabe der Listen:");
        JLausgabe.setVisible(true);

        JLbehandle = new JLabel();
        JLbehandle.setBounds(51,192,110,35);
        JLbehandle.setBackground(new Color(214,217,223));
        JLbehandle.setForeground(new Color(0,0,0));
        JLbehandle.setEnabled(true);
        JLbehandle.setFont(new Font("sansserif",0,12));
        JLbehandle.setText("Behandle Patient:");
        JLbehandle.setVisible(true);

        JLnoch = new JLabel();
        JLnoch.setBounds(431,281,140,35);
        JLnoch.setBackground(new Color(214,217,223));
        JLnoch.setForeground(new Color(0,0,0));
        JLnoch.setEnabled(true);
        JLnoch.setFont(new Font("sansserif",0,12));
        JLnoch.setText("Noch zu behandeln");
        JLnoch.setVisible(true);

        JLnot = new JLabel();
        JLnot.setBounds(231,283,90,35);
        JLnot.setBackground(new Color(214,217,223));
        JLnot.setForeground(new Color(0,0,0));
        JLnot.setEnabled(true);
        JLnot.setFont(new Font("sansserif",0,12));
        JLnot.setText("Notfälle");
        JLnot.setVisible(true);

        JLsuche = new JLabel();
        JLsuche.setBounds(11,56,90,35);
        JLsuche.setBackground(new Color(214,217,223));
        JLsuche.setForeground(new Color(0,0,0));
        JLsuche.setEnabled(true);
        JLsuche.setFont(new Font("sansserif",0,12));
        JLsuche.setText("Suche Name");
        JLsuche.setVisible(true);

        JLsucheIn = new JLabel();
        JLsucheIn.setBounds(240,57,90,35);
        JLsucheIn.setBackground(new Color(214,217,223));
        JLsucheIn.setForeground(new Color(0,0,0));
        JLsucheIn.setEnabled(true);
        JLsucheIn.setFont(new Font("sansserif",0,12));
        JLsucheIn.setText("in");
        JLsucheIn.setVisible(true);

        JLvorhanden = new JLabel();
        JLvorhanden.setBounds(14,103,90,35);
        JLvorhanden.setBackground(new Color(214,217,223));
        JLvorhanden.setForeground(new Color(0,0,0));
        JLvorhanden.setEnabled(true);
        JLvorhanden.setFont(new Font("sansserif",0,12));
        JLvorhanden.setText("Vorhanden:");
        JLvorhanden.setVisible(true);

        JLvorhandenName = new JLabel();
        JLvorhandenName.setBounds(170,100,90,35);
        JLvorhandenName.setBackground(new Color(214,217,223));
        JLvorhandenName.setForeground(new Color(0,0,0));
        JLvorhandenName.setEnabled(true);
        JLvorhandenName.setFont(new Font("sansserif",0,12));
        JLvorhandenName.setText("Name:");
        JLvorhandenName.setVisible(true);

        JLvorhandenNotfall = new JLabel();
        JLvorhandenNotfall.setBounds(168,120,90,35);
        JLvorhandenNotfall.setBackground(new Color(214,217,223));
        JLvorhandenNotfall.setForeground(new Color(0,0,0));
        JLvorhandenNotfall.setEnabled(true);
        JLvorhandenNotfall.setFont(new Font("sansserif",0,12));
        JLvorhandenNotfall.setText("Notfall:");
        JLvorhandenNotfall.setVisible(true);

        JTAalle = new JTextArea();
        JTAalle.setBounds(27,323,150,300);
        JTAalle.setBackground(new Color(255,255,255));
        JTAalle.setForeground(new Color(0,0,0));
        JTAalle.setEnabled(true);
        JTAalle.setFont(new Font("sansserif",0,12));
        JTAalle.setText("Patienten");
        JTAalle.setBorder(BorderFactory.createBevelBorder(1));
        JTAalle.setVisible(true);

        JTAnoch = new JTextArea();
        JTAnoch.setBounds(430,319,150,300);
        JTAnoch.setBackground(new Color(255,255,255));
        JTAnoch.setForeground(new Color(0,0,0));
        JTAnoch.setEnabled(true);
        JTAnoch.setFont(new Font("sansserif",0,12));
        JTAnoch.setText("Patienten");
        JTAnoch.setBorder(BorderFactory.createBevelBorder(1));
        JTAnoch.setVisible(true);

        JTAnot = new JTextArea();
        JTAnot.setBounds(229,321,150,300);
        JTAnot.setBackground(new Color(255,255,255));
        JTAnot.setForeground(new Color(0,0,0));
        JTAnot.setEnabled(true);
        JTAnot.setFont(new Font("sansserif",0,12));
        JTAnot.setText("Patienten");
        JTAnot.setBorder(BorderFactory.createBevelBorder(1));
        JTAnot.setVisible(true);

        JTAsucheNameNotfall = new JTextArea();
        JTAsucheNameNotfall.setBounds(210,107,170,60);
        JTAsucheNameNotfall.setBackground(new Color(255,255,255));
        JTAsucheNameNotfall.setForeground(new Color(0,0,0));
        JTAsucheNameNotfall.setEnabled(true);
        JTAsucheNameNotfall.setFont(new Font("SansSerif",0,14));
        JTAsucheNameNotfall.setText("Name\nNotfall");
        JTAsucheNameNotfall.setBorder(BorderFactory.createBevelBorder(1));
        JTAsucheNameNotfall.setVisible(true);

        JTFaufnahmeName = new JTextField();
        JTFaufnahmeName.setBounds(160,5,150,35);
        JTFaufnahmeName.setBackground(new Color(255,255,255));
        JTFaufnahmeName.setForeground(new Color(0,0,0));
        JTFaufnahmeName.setEnabled(true);
        JTFaufnahmeName.setFont(new Font("sansserif",0,12));
        JTFaufnahmeName.setText("Name");
        JTFaufnahmeName.setVisible(true);

        JTFbehandle = new JTextField();
        JTFbehandle.setBounds(187,192,150,35);
        JTFbehandle.setBackground(new Color(255,255,255));
        JTFbehandle.setForeground(new Color(0,0,0));
        JTFbehandle.setEnabled(true);
        JTFbehandle.setFont(new Font("sansserif",0,12));
        JTFbehandle.setText("Name");
        JTFbehandle.setVisible(true);

        JTFsuche = new JTextField();
        JTFsuche.setBounds(86,56,150,35);
        JTFsuche.setBackground(new Color(255,255,255));
        JTFsuche.setForeground(new Color(0,0,0));
        JTFsuche.setEnabled(true);
        JTFsuche.setFont(new Font("sansserif",0,12));
        JTFsuche.setText("Name");
        JTFsuche.setVisible(true);

        JTFsucheVorhanden = new JTextField();
        JTFsucheVorhanden.setBounds(81,102,60,35);
        JTFsucheVorhanden.setBackground(new Color(255,255,255));
        JTFsucheVorhanden.setForeground(new Color(0,0,0));
        JTFsucheVorhanden.setEnabled(true);
        JTFsucheVorhanden.setFont(new Font("sansserif",0,12));
        JTFsucheVorhanden.setText("Ja/Nein");
        JTFsucheVorhanden.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(JBaufnahme);
        contentPane.add(JBbehandle);
        contentPane.add(JBsucheAlle);
        contentPane.add(JBsucheNoch);
        contentPane.add(JBsucheNot);
        contentPane.add(JCBaufnahmeNotfall);
        contentPane.add(JLalle);
        contentPane.add(JLaufnahme);
        contentPane.add(JLausgabe);
        contentPane.add(JLbehandle);
        contentPane.add(JLnoch);
        contentPane.add(JLnot);
        contentPane.add(JLsuche);
        contentPane.add(JLsucheIn);
        contentPane.add(JLvorhanden);
        contentPane.add(JLvorhandenName);
        contentPane.add(JLvorhandenNotfall);
        contentPane.add(JTAalle);
        contentPane.add(JTAnoch);
        contentPane.add(JTAnot);
        contentPane.add(JTAsucheNameNotfall);
        contentPane.add(JTFaufnahmeName);
        contentPane.add(JTFbehandle);
        contentPane.add(JTFsuche);
        contentPane.add(JTFsucheVorhanden);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    public void allePatientenAusgabe(String pInhalt)
    {
        JTAalle.setText(pInhalt);
    }
    public void nochPatientenAusgabe(String pInhalt)
    {
        JTAnoch.setText(pInhalt);
    }
    public void notPatientenAusgabe(String pInhalt)
    {
        JTAnot.setText(pInhalt);
    }

    public void ausgabeInfoFeld(String pName, String pNotfall){
        JTAsucheNameNotfall.setText(pName + "\n" + pNotfall);
    }

    public void ausgabeVorhanden(String pText){
        JTFsucheVorhanden.setText(pText);
    }
}
