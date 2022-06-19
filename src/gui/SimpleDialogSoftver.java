package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class SimpleDialogSoftver extends JDialog{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public SimpleDialogSoftver(Frame parent, String title, boolean modal) {
		super(parent, title, modal);

		setSize(300, 400);
		setLocationRelativeTo(parent);

		JPanel panCentar = new JPanel();
		// Primeri koriscenja Focus Listenera
				JPanel panSoftverPanel = new SoftverPanel();
				panCentar.add(panSoftverPanel);
				
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
