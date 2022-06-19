package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import gui.MyFocusListener;
import gui.MyKeyListener;

public class ZaposleniPanel extends JPanel{
	private static final long serialVersionUID = 7826375022683547554L;

	public ZaposleniPanel() {

		super(new BorderLayout());
		setBorder(new TitledBorder(new EtchedBorder(), "Unesite podatke"));
		setBackground(new Color(1, 1, 1));

		Dimension dim = new Dimension(100, 25);
		MyFocusListener focusListener = new MyFocusListener();

		JPanel panPrezime = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panPrezime.setBackground(new Color(254, 254, 208));

		JLabel lblPrezime = new JLabel("Prezime*:");
		lblPrezime.setPreferredSize(dim);
		JTextField txtPrezime = new JTextField();
		txtPrezime.setPreferredSize(dim);
		txtPrezime.setName("txtPrezime");
		txtPrezime.setBackground(Color.GRAY);
		txtPrezime.addFocusListener(focusListener);

		panPrezime.add(lblPrezime);
		panPrezime.add(txtPrezime);

		JPanel panIme = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panIme.setBackground(new Color(254, 254, 208));
		JLabel lblIme = new JLabel("Ime:");
		lblIme.setPreferredSize(dim);
		JTextField txtIme = new JTextField();
		txtIme.setBackground(Color.GRAY);
		txtIme.setName("txtIme");
		txtIme.addFocusListener(focusListener);
		txtIme.setPreferredSize(dim);
		panIme.add(lblIme);
		panIme.add(txtIme);

		JPanel panAdresa = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panAdresa.setBackground(new Color(254, 254, 208));
		JLabel lblAdresa = new JLabel("Adresa:");
		lblAdresa.setPreferredSize(dim);
		JTextField txtAdresa = new JTextField();
		txtAdresa.setBackground(Color.GRAY);
		txtAdresa.setName("txtAdresa");
		txtAdresa.addFocusListener(focusListener);
		txtAdresa.setPreferredSize(dim);
		panAdresa.add(lblAdresa);
		panAdresa.add(txtAdresa);
		
		JPanel panEmail = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panEmail.setBackground(new Color(254, 254, 208));
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setPreferredSize(dim);
		JTextField txtEmail = new JTextField();
		txtEmail.setBackground(Color.GRAY);
		txtEmail.setName("txtAdresa");
		txtEmail.addFocusListener(focusListener);
		txtEmail.setPreferredSize(dim);
		panEmail.add(lblEmail);
		panEmail.add(txtEmail);
		
		JPanel panAlati = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panAlati.setBackground(new Color(254, 254, 208));
		JLabel lblAlati = new JLabel("Alati:");
		lblAlati.setPreferredSize(dim);
		JTextField txtAlati = new JTextField();
		txtAlati.setBackground(Color.GRAY);
		txtAlati.setName("txtAlati");
		txtAlati.addFocusListener(focusListener);
		txtAlati.setPreferredSize(dim);
		panAlati.add(lblAlati);
		panAlati.add(txtAlati);
		
		JPanel panRadnoMesto = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panRadnoMesto.setBackground(new Color(254, 254, 208));
		JLabel lblRadnoMesto = new JLabel("RadnoMesto:");
		lblRadnoMesto.setPreferredSize(dim);
		JTextField txtRadnoMesto = new JTextField();
		txtRadnoMesto.setBackground(Color.GRAY);
		txtRadnoMesto.setName("txtRadnoMesto");
		txtRadnoMesto.addFocusListener(focusListener);
		txtRadnoMesto.setPreferredSize(dim);
		panRadnoMesto.add(lblRadnoMesto);
		panRadnoMesto.add(txtRadnoMesto);
		
		
		KeyListener keyListener=new MyKeyListener();
	  	
	  	JPanel panJMBG=new JPanel(new FlowLayout(FlowLayout.LEFT));
	  	panJMBG.setBackground(new Color(254, 254, 208));
	  	
	  	JLabel lblJMBG=new JLabel("JMBG:");
	  	lblJMBG.setPreferredSize(dim);
	  	JTextField txtJMBG=new JTextField();
	  	txtJMBG.setBackground(Color.GRAY);
	  	txtJMBG.setPreferredSize(dim);
	  	txtJMBG.setName("txtJMBG");
	  	txtJMBG.addKeyListener(keyListener);
	  	
	  	panJMBG.add(lblJMBG);
	  	panJMBG.add(txtJMBG);
	  	
	  	JPanel panDatumRodjenja=new JPanel(new FlowLayout(FlowLayout.LEFT));
	  	panDatumRodjenja.setBackground(new Color(254, 254, 208));
	  	
	  	JLabel lblDatumRodjenja=new JLabel("Datum Rodjenja:");
	  	lblDatumRodjenja.setPreferredSize(dim);
	  	JTextField txtDatumRodjenja=new JTextField();
	  	txtDatumRodjenja.setBackground(Color.GRAY);
	  	txtDatumRodjenja.setPreferredSize(dim);
	  	txtDatumRodjenja.setName("txtDatumRodjenja");
	  	txtDatumRodjenja.addKeyListener(keyListener);
	  	
	  	panDatumRodjenja.add(lblDatumRodjenja);
	  	panDatumRodjenja.add(txtDatumRodjenja);
	  	
		
		

		Box boxCentar = Box.createVerticalBox();
		boxCentar.add(Box.createVerticalStrut(20));
		boxCentar.add(panPrezime);
		boxCentar.add(panIme);
		boxCentar.add(panJMBG);
		boxCentar.add(panDatumRodjenja);
		boxCentar.add(panEmail);
		boxCentar.add(panAdresa);
		boxCentar.add(panAlati);
		boxCentar.add(panRadnoMesto);
		boxCentar.add(Box.createGlue());
		add(boxCentar, BorderLayout.NORTH);

	}

}
