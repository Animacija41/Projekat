package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;


import gui.ZaposleniPanel;

public class SimpleDialogZaposleni extends JDialog {
	private static final long serialVersionUID = 3591599721565020284L;

	public SimpleDialogZaposleni(Frame parent, String title, boolean modal) {
		super(parent, title, modal);

		setSize(300, 400);
		setLocationRelativeTo(parent);

		JPanel panCentar = new JPanel();
		// Primeri koriscenja Focus Listenera
				JPanel panZaposleniPanel = new ZaposleniPanel();
				panCentar.add(panZaposleniPanel);
				
				JPanel statusBar = new JPanel();
				statusBar.setBackground(Color.LIGHT_GRAY);
				statusBar.setPreferredSize(new Dimension(100, 30));
				
				JButton btnOk=new JButton("Ok");
				btnOk.setPreferredSize(new Dimension(75,25));

				JButton btnCancel=new JButton("Cancel");
				btnCancel.setPreferredSize(new Dimension(75,25));
				statusBar.add(btnOk);
				
				statusBar.add(btnCancel); 
				
				
				add(panCentar, BorderLayout.CENTER);
				add(statusBar, BorderLayout.SOUTH);
	}
}
