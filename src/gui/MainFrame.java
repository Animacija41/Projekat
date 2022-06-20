package gui;
/**
 * 
 */

/**
 * @author matov
 *
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel; 
class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	

	public MainFrame() {
		 Toolkit kit = Toolkit.getDefaultToolkit();
		 Dimension screenSize = kit.getScreenSize();
		 int screenHeight = screenSize.height;
		 int screenWidth = screenSize.width;
		 // Podesavamo dimenzije prozora na polovinu dimenzija ekrana
		 setSize(screenWidth / 2, screenHeight / 2);
		 // Dodeljujemo ikonu
		 Image img = kit.getImage("images/iko.jpg");
		 setIconImage(img);
		 //Podesavamo naslov
		 setTitle("Animacije");
		 //Postavljamo akciju pri zatvaranju prozora
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 addWindowListener(new MyWindowListener());
		 
		// kreiramo jedan panel i dodajemo ga u JFrame
			JPanel panel = new JPanel();
			panel.setBackground(Color.WHITE);
			this.add(panel); 
		 
			// kreiranje naslednika klase JMenuBar i njeno postavljanje u glavni prozor
			// aplikacije
			MyMenuBar menu = new MyMenuBar(this);
			this.setJMenuBar(menu);

			// kreiramo instancu klase Toolbar
			MyToolbar toolbar = new MyToolbar(this);
			// dodajemo u Frame naš Toolbar, klasa BorderLayout se odnosi na rad sa
			// prostorim rasporedom
			// komponenti, za sada je dovoljno znati da na ovaj nacin Toolbar se postavlja
			// na vrh glavne forme
			add(toolbar, BorderLayout.NORTH);

			 MyStatusBar MyStratusBar = new MyStatusBar();
			 getContentPane().add(MyStratusBar,BorderLayout.SOUTH);
			
			
		 }
}
	

