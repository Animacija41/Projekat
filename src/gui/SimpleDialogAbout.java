package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.Box;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleDialogAbout  extends JDialog{

	private static final long serialVersionUID = 1L;
	public SimpleDialogAbout(Frame parent, String title, boolean modal) {
		
		super(parent, title, modal);
		setSize(400, 250);
		setLocationRelativeTo(parent);
		
		
		
		setBackground(new Color(1, 1, 1));
		
		
		JPanel pantxt = new JPanel();
		JLabel lbltxt = new JLabel("Autori: ");
		pantxt.add(lbltxt);
		
		JPanel pantxt1 = new JPanel();
		JLabel lbltxt1 = new JLabel("Aleksandra Matovic ");
		pantxt1.add(lbltxt1);
		
		JPanel pantxt2 = new JPanel();
		JLabel lbltxt2 = new JLabel("Anastasija Stevic ");
		pantxt2.add(lbltxt2);
		
		JPanel pantxt3 = new JPanel();
		JLabel lbltxt3 = new JLabel("Mijat Prodanovic ");
		pantxt3.add(lbltxt3);
		
		JPanel pantxt4 = new JPanel();
		JLabel lbltxt4 = new JLabel("Tamara Latisko");
		pantxt4.add(lbltxt4);
		
		
		
		Box boxCentar = Box.createVerticalBox();
		boxCentar.add(Box.createVerticalStrut(20));
		boxCentar.add(pantxt);
		boxCentar.add(pantxt1);
		boxCentar.add(pantxt2);
		boxCentar.add(pantxt3);
		boxCentar.add(pantxt4);
		boxCentar.add(Box.createGlue());
		add(boxCentar, BorderLayout.NORTH);	
				
				
		
		
		
		
		
				JPanel statusBar = new JPanel();
				statusBar.setBackground(Color.LIGHT_GRAY);
				statusBar.setPreferredSize(new Dimension(100, 30));
				
				
				
				add(statusBar, BorderLayout.SOUTH);
	}
	
	
}