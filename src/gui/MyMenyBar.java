package gui;
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
public class MyMenyBar extends JMenuBar{
	

		/**
		 * 
		 */
		private static final long serialVersionUID = -7863806568418316202L;

		public MyMenyBar() {

			JMenu file = new JMenu("File");
			JMenu miNew = new JMenu("New");
			JMenuItem miProject = new JMenuItem("Project");
			JMenuItem miPackage = new JMenuItem("Package");
			miNew.add(miProject);
			miNew.addSeparator();
			miNew.add(miPackage);

			JMenu miOpen = new JMenu("Open");
			JMenuItem miProject1 = new JMenuItem("Project");
			JMenuItem miPackage1 = new JMenuItem("Package");
			miOpen.add(miProject1);
			miOpen.addSeparator();
			miOpen.add(miPackage1);
			
			
			JMenuItem miExit = new JMenuItem("Exit");
			
			file.add(miNew);
			file.addSeparator();
			file.add(miOpen);
			file.addSeparator();
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

