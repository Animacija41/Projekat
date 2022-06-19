package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * 
 */

/**
 * @author matov
 *
 */
public class MyMenuBar extends JMenuBar{
	

		/**
		 * 
		 */
		private static final long serialVersionUID = -7863806568418316202L;

		public MyMenuBar() {

			JMenu file = new JMenu("File");
			JMenu miNew = new JMenu("New");
			JMenuItem miZaposleni = new JMenuItem("Zaposleni");
			JMenuItem miSoftver = new JMenuItem("Softver");
			miNew.add(miZaposleni);
			miNew.addSeparator();
			miNew.add(miSoftver);

			JMenu miOpen = new JMenu("Open");
			JMenuItem miZaposleni1 = new JMenuItem("Zaposleni");
			JMenuItem miSoftver1 = new JMenuItem("Softver");
			miOpen.add(miZaposleni1);
			miOpen.addSeparator();
			miOpen.add(miSoftver1);
			
			
			JMenuItem miExit = new JMenuItem("Exit");
			
			file.add(miNew);
			file.addSeparator();
			file.add(miOpen);
			file.addSeparator();
			
			miExit.addActionListener (new ActionListener () {
				 public void actionPerformed (ActionEvent e) {
				  System.exit(0);
				 }
			});
			file.add(miExit);
			
			
			

			JMenu edit = new JMenu("Edit");
			

			JMenuItem miedit = new JMenuItem("Edit");
			JMenuItem midelete = new JMenuItem("Delete");
			
			edit.add(miedit);
			edit.addSeparator();
			edit.add(midelete);
			edit.addSeparator();
			
			
			
			JMenu help = new JMenu("Help");
			JMenuItem miabout = new JMenuItem("About");
			
			help.add(miabout);
			help.addSeparator();
			

			add(file);
			add(edit);
			add(help);

		}
	}

