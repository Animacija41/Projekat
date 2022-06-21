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
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import gui.MainFrame.SimpleDialogZaposleni;

import gui.MainFrame.ZaposleniPanel; 
class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	private DefaultTableModel model1 = new DefaultTableModel(100,8);
	private DefaultTableModel model2 = new DefaultTableModel(100,6);
	private JTable table1 = new JTable(model1);
	private JTable table2 = new JTable(model2);
	
	Zaposleni zaposlen=new Zaposleni();
	ZaposleniKontroler kontroler=new ZaposleniKontroler();
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
			 
			 JTabbedPane tabs=new JTabbedPane();
		  		tabs.addTab("zaposleni",null,table1);
		  		tabs.addTab("softver",null,table2);
		  		
		  		add(tabs);
		 }
	
	  		
	  		
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
				zaposlen.setPrezime(txtPrezime.getText());
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
				zaposlen.setIme(txtIme.getText());
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
				zaposlen.setEmail(txtEmail.getText());
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
						btnOk.addActionListener (new ActionListener () {
							 public void actionPerformed (ActionEvent e) {
								
							 
							 }
						});

						JButton btnCancel=new JButton("Cancel");
						btnCancel.setPreferredSize(new Dimension(75,25));
						statusBar.add(btnOk);
						
						statusBar.add(btnCancel); 
						
						
						add(panCentar, BorderLayout.CENTER);
						add(statusBar, BorderLayout.SOUTH);
			}
		}
		public class MyMenuBar extends JMenuBar{
			

			/**
			 * 
			 */
			private static final long serialVersionUID = -7863806568418316202L;

			public MyMenuBar(final JFrame parent) {

				JMenu file = new JMenu("File");
				JMenu miNew = new JMenu("New");
	JMenuItem miZaposleni = new JMenuItem("Zaposleni");
				
				miZaposleni.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						SimpleDialogZaposleni dialog = new SimpleDialogZaposleni(parent, "Dialog Zaposleni", true);
						dialog.setVisible(true);

					}
				});
				
				JMenuItem miSoftver = new JMenuItem("Softver");
				miSoftver.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						SimpleDialogSoftver dialog = new SimpleDialogSoftver(parent, "Dialog Softver", true);
						dialog.setVisible(true);

					}
				});
				
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
				miabout.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						SimpleDialogAbout dialog = new SimpleDialogAbout(parent, "About", true);
						dialog.setVisible(true);

					}
				});
				
				
				
				help.add(miabout);
				help.addSeparator();
				

				add(file);
				add(edit);
				add(help);

			}
		}

		public class MyToolbar  extends JToolBar{

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			public MyToolbar(final JFrame parent) {
				// u konstruktor nadklase, tj klse JToolbar prosledjuje
				// se orijentacija toolbar-a, moguca i sa konstantom: SwingConstants.VERTICAL

				super(SwingConstants.HORIZONTAL);
				JButton btnNew = new JButton();
				btnNew.setToolTipText("New");
				btnNew.setIcon(new ImageIcon("ikonice/add.png"));
				add(btnNew);

				addSeparator();
				
				btnNew.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						
						SimpleDialogZaposleni dialog = new SimpleDialogZaposleni(parent, "Dialog Zaposleni", true);
						dialog.setVisible(true);

					}
				});

				JButton btnOpen = new JButton();
				btnOpen.setToolTipText("Open");
				btnOpen.setIcon(new ImageIcon("ikonice/editing.png"));
				add(btnOpen);

				addSeparator();

				JToggleButton tglBtnDelete = new JToggleButton();
				tglBtnDelete.setToolTipText("Delete");
				tglBtnDelete.setIcon(new ImageIcon("ikonice/recycle-bin.png"));
				add(tglBtnDelete);

				// toolbar je pokretljiv, probati i sa staticnim toolbarom
				setFloatable(true);
				setBackground(new Color(255, 255, 204));

			}
		}

}
	

