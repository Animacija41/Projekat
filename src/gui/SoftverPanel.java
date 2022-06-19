package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyListener;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class SoftverPanel extends JPanel{
	private static final long serialVersionUID = 7826375022683547554L;

	public SoftverPanel() {

		super(new BorderLayout());
		setBorder(new TitledBorder(new EtchedBorder(), "Unesite podatke"));
		setBackground(new Color(1, 1, 1));

		Dimension dim = new Dimension(100, 25);
		MyFocusListener focusListener = new MyFocusListener();

		JPanel panNazivSoftvera = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panNazivSoftvera.setBackground(new Color(254, 254, 208));

		JLabel lblNazivSoftvera = new JLabel("Naziv Softvera :");
		lblNazivSoftvera.setPreferredSize(dim);
		JTextField txtNazivSoftvera = new JTextField();
		txtNazivSoftvera.setPreferredSize(dim);
		txtNazivSoftvera.setName("txtNazivSoftvera");
		txtNazivSoftvera.setBackground(Color.GRAY);
		txtNazivSoftvera.addFocusListener(focusListener);

		panNazivSoftvera.add(lblNazivSoftvera);
		panNazivSoftvera.add(txtNazivSoftvera);

		JPanel panCetkice = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panCetkice.setBackground(new Color(254, 254, 208));
		JLabel lblCetkice = new JLabel("Cetkice:");
		lblCetkice.setPreferredSize(dim);
		JTextField txtCetkice = new JTextField();
		txtCetkice.setBackground(Color.GRAY);
		txtCetkice.setName("txtCetkice");
		txtCetkice.addFocusListener(focusListener);
		txtCetkice.setPreferredSize(dim);
		panCetkice.add(lblCetkice);
		panCetkice.add(txtCetkice);

		JPanel panModifikatori = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panModifikatori.setBackground(new Color(254, 254, 208));
		JLabel lblModifikatori = new JLabel("Modifikatori:");
		lblModifikatori.setPreferredSize(dim);
		JTextField txtModifikatori = new JTextField();
		txtModifikatori.setBackground(Color.GRAY);
		txtModifikatori.setName("txtModifikatori");
		txtModifikatori.addFocusListener(focusListener);
		txtModifikatori.setPreferredSize(dim);
		panModifikatori.add(lblModifikatori);
		panModifikatori.add(txtModifikatori);
		
		JPanel panFormatFajla = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panFormatFajla.setBackground(new Color(254, 254, 208));
		JLabel lblFormatFajla = new JLabel("FormatFajla:");
		lblFormatFajla.setPreferredSize(dim);
		JTextField txtFormatFajla = new JTextField();
		txtFormatFajla.setBackground(Color.GRAY);
		txtFormatFajla.setName("txtFormatFajla");
		txtFormatFajla.addFocusListener(focusListener);
		txtFormatFajla.setPreferredSize(dim);
		panFormatFajla.add(lblFormatFajla);
		panFormatFajla.add(txtFormatFajla);
		
		JPanel panAlatizaAnimaciju = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panAlatizaAnimaciju.setBackground(new Color(254, 254, 208));
		JLabel lblAlatizaAnimaciju = new JLabel("Alati za Animaciju:");
		lblAlatizaAnimaciju.setPreferredSize(dim);
		JTextField txtAlatizaAnimaciju = new JTextField();
		txtAlatizaAnimaciju.setBackground(Color.GRAY);
		txtAlatizaAnimaciju.setName("txtAlatizaAnimaciju");
		txtAlatizaAnimaciju.addFocusListener(focusListener);
		txtAlatizaAnimaciju.setPreferredSize(dim);
		panAlatizaAnimaciju.add(lblAlatizaAnimaciju);
		panAlatizaAnimaciju.add(txtAlatizaAnimaciju);
		
		JPanel panRender = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panRender.setBackground(new Color(254, 254, 208));
		JLabel lblRender = new JLabel("Render:");
		lblRender.setPreferredSize(dim);
		JTextField txtRender = new JTextField();
		txtRender.setBackground(Color.GRAY);
		txtRender.setName("txtRender");
		txtRender.addFocusListener(focusListener);
		txtRender.setPreferredSize(dim);
		panRender.add(lblRender);
		panRender.add(txtRender);
		
		
		
	  	
	  
	  	
		
		
		

		Box boxCentar = Box.createVerticalBox();
		boxCentar.add(Box.createVerticalStrut(20));
		boxCentar.add(panNazivSoftvera);
		boxCentar.add(panCetkice);
		
		
		boxCentar.add(panModifikatori);
		boxCentar.add(panFormatFajla);
		boxCentar.add(panAlatizaAnimaciju);
		boxCentar.add(panRender);
		

		boxCentar.add(Box.createGlue());
		add(boxCentar, BorderLayout.NORTH);

	}

}
