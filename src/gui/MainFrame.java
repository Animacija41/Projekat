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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
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
	private JTextField txtRender = new JTextField();
	private JTextField txtAlatizaAnimaciju = new JTextField();
	private JTextField txtFormatFajla = new JTextField();
	private JTextField txtModifikatori = new JTextField();
	private JTextField txtNazivSoftvera = new JTextField();
	private JTextField txtNazivCetkice = new JTextField();
	private JTextField txtNamenaCetkice = new JTextField();
	private JTextField txtBojaCetkice = new JTextField();
	private JTextField txtCetkice = new JTextField();
	private JTextField txtPrezime = new JTextField();
	private JTextField txtIme = new JTextField();
	private JTextField txtUlica = new JTextField();
	private JTextField txtBroj = new JTextField();
	private JTextField txtGrad = new JTextField();
	private JTextField txtAlati = new JTextField();
	private JTextField txtEmail = new JTextField();
	private JTextField txtDatumRodjenja=new JTextField();
	private JTextField txtJMBG=new JTextField();
	private JTextField txtRadnoMesto = new JTextField();
	private DefaultTableModel model1 = new DefaultTableModel(100,10);
	private DefaultTableModel model2 = new DefaultTableModel(100,8);
	private JTable table1 = new JTable(model1);
	private JTable table2 = new JTable(model2);
	JTabbedPane tabs=new JTabbedPane();

	ZaposleniKontroler kontroler=new ZaposleniKontroler();
	SoftverKontroler kontroler1=new SoftverKontroler();
	
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
			 
			 table1.setDefaultEditor(Object.class, null);
			 table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			 table2.setDefaultEditor(Object.class, null);
			 table2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			 	tabs=new JTabbedPane();
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
				
				txtIme.setBackground(Color.GRAY);
				txtIme.setName("txtIme");
				txtIme.addFocusListener(focusListener);
				txtIme.setPreferredSize(dim);
				panIme.add(lblIme);
				panIme.add(txtIme);
				
				JPanel panAdresa = new JPanel(new FlowLayout(FlowLayout.LEFT));
				panAdresa.setBackground(new Color(254, 254, 208));
				JLabel lblAdresa = new JLabel("Ulica:");
				lblAdresa.setPreferredSize(dim);
				
				txtUlica.setBackground(Color.GRAY);
				txtUlica.setName("txtUlica");
				txtUlica.addFocusListener(focusListener);
				txtUlica.setPreferredSize(dim);
				panAdresa.add(lblAdresa);
				panAdresa.add(txtUlica);
				
				JPanel panBroj = new JPanel(new FlowLayout(FlowLayout.LEFT));
				panBroj.setBackground(new Color(254, 254, 208));
				JLabel lblBroj = new JLabel("Broj:");
				lblBroj.setPreferredSize(dim);
				
				txtBroj.setBackground(Color.GRAY);
				txtBroj.setName("txtBroj");
				txtBroj.addFocusListener(focusListener);
				txtBroj.setPreferredSize(dim);
				panBroj.add(lblBroj);
				panBroj.add(txtBroj);
				
				JPanel panGrad = new JPanel(new FlowLayout(FlowLayout.LEFT));
				panGrad.setBackground(new Color(254, 254, 208));
				JLabel lblGrad = new JLabel("Grad:");
				lblGrad.setPreferredSize(dim);
				
				txtGrad.setBackground(Color.GRAY);
				txtGrad.setName("txtGrad");
				txtGrad.addFocusListener(focusListener);
				txtGrad.setPreferredSize(dim);
				panGrad.add(lblGrad);
				panGrad.add(txtGrad);
				
				JPanel panEmail = new JPanel(new FlowLayout(FlowLayout.LEFT));
				panEmail.setBackground(new Color(254, 254, 208));
				JLabel lblEmail = new JLabel("Email:");
				lblEmail.setPreferredSize(dim);
				
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
				boxCentar.add(panBroj);
				boxCentar.add(panGrad);
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

				setSize(300, 500);
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
								 String prezimeData = txtPrezime.getText();
									String imeData = txtIme.getText();
									String jmbgData = txtJMBG.getText();
									String datumRData = txtDatumRodjenja.getText();
									String emailData = txtEmail.getText();
									String ulicaData = txtUlica.getText();
									String brojData = txtBroj.getText();
									String gradData = txtGrad.getText();
									String alatiData = txtAlati.getText();
									String radnoMestoData = txtRadnoMesto.getText();
									Adresa a=new Adresa(ulicaData, brojData, gradData);
									Softver s=new Softver(alatiData);
									Zaposleni radnik = new Zaposleni(prezimeData, imeData, jmbgData, datumRData, emailData, a, s, radnoMestoData);
									
									 try {
										kontroler.addradnik(radnik);
									} catch (Exception e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									 System.out.println(kontroler.getAllZaposleni());
									 
										 
										 model1.setValueAt(radnik.getIme(), kontroler.getAllZaposleni().size()-1, 0);
										 model1.setValueAt(radnik.getPrezime(), kontroler.getAllZaposleni().size()-1, 1);	
										 model1.setValueAt(radnik.getJMBG(), kontroler.getAllZaposleni().size()-1, 2);
										 model1.setValueAt(radnik.getDatum(), kontroler.getAllZaposleni().size()-1, 3);
										 model1.setValueAt(radnik.getEmail(), kontroler.getAllZaposleni().size()-1, 4);
										 model1.setValueAt(a.getUlica(), kontroler.getAllZaposleni().size()-1, 5);
										 model1.setValueAt(a.getBroj(), kontroler.getAllZaposleni().size()-1, 6);
										 model1.setValueAt(a.getGrad(), kontroler.getAllZaposleni().size()-1, 7);
										 model1.setValueAt(s.getNaziv(), kontroler.getAllZaposleni().size()-1, 8);
										 model1.setValueAt(radnik.getRadnoMesto(), kontroler.getAllZaposleni().size()-1, 9);
										 
									dispose();
									txtPrezime.setText("");
									txtIme.setText("");
									txtJMBG.setText("");
									txtDatumRodjenja.setText("");
									txtEmail.setText("");
									txtUlica.setText("");
									txtBroj.setText("");
									txtGrad.setText("");
									txtAlati.setText("");
									txtRadnoMesto.setText("");
									
									
								 
							 
							 }
						});

						JButton btnCancel=new JButton("Cancel");
						btnCancel.addActionListener (new ActionListener () {
							 public void actionPerformed (ActionEvent e) {
								dispose();
							 }
						});
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
				
				miedit.addActionListener (new ActionListener () {
					 public void actionPerformed (ActionEvent e) {
						if (tabs.getSelectedIndex()==0) 
						{
							 SimpleDialogZaposleni1 dialog = new SimpleDialogZaposleni1(parent, "Dialog Zaposleni", true);
							 dialog.setVisible(true);
							
						 }
						else if(tabs.getSelectedIndex()==1) 
						 {
							SimpleDialogSoftver1 dialog = new SimpleDialogSoftver1(parent, "Dialog Softver", true);
							dialog.setVisible(true);
						}
						
					}
					
				});
				JMenuItem midelete = new JMenuItem("Delete");
				midelete.addActionListener (new ActionListener () {
					 public void actionPerformed (ActionEvent e) {
						 if (tabs.getSelectedIndex()==0) 
						 {
							 DialogDelete dijalog=new DialogDelete(parent, true);
						 }
						else if(tabs.getSelectedIndex()==1) 
						 {
							 DialogDelete2 dijalog2=new DialogDelete2(parent, true);
						 }
						
					 }
					
				});
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
				
				
				btnNew.addActionListener(new ActionListener() {

					
					public void actionPerformed(ActionEvent arg0) {
						
						if (tabs.getSelectedIndex()==0) 
						 {
							 SimpleDialogZaposleni dijalog=new SimpleDialogZaposleni(parent,"Dialog Zaposleni", true);
							 dijalog.setVisible(true);
						 }
						else if(tabs.getSelectedIndex()==1) 
						 {
							 SimpleDialogSoftver dijalog2=new SimpleDialogSoftver(parent,"Dialog Softver", true);
							 dijalog2.setVisible(true);
						 }
						

					}
				});
				add(btnNew);

				addSeparator();

				JButton btnEdit = new JButton();
				btnEdit.setToolTipText("Edit");
				btnEdit.setIcon(new ImageIcon("ikonice/editing.png"));
				btnEdit.addActionListener (new ActionListener () {
					 public void actionPerformed (ActionEvent e) {
						 if (tabs.getSelectedIndex()==0) 
						{
							 SimpleDialogZaposleni1 dialog = new SimpleDialogZaposleni1(parent, "Dialog Zaposleni", true);
							 dialog.setVisible(true);
							
						 }
						else if(tabs.getSelectedIndex()==1) 
						 {
							SimpleDialogSoftver1 dialog = new SimpleDialogSoftver1(parent, "Dialog Softver", true);
							dialog.setVisible(true);
						}
						
					 }
					
				});
				add(btnEdit);

				addSeparator();

				JButton BtnDelete = new JButton();
				BtnDelete.setToolTipText("Delete");
				BtnDelete.setIcon(new ImageIcon("ikonice/recycle-bin.png"));
				BtnDelete.addActionListener (new ActionListener () {
					 public void actionPerformed (ActionEvent e) {
						 if (tabs.getSelectedIndex()==0) 
						 {
							 DialogDelete dijalog=new DialogDelete(parent, true);
						 }
						else if(tabs.getSelectedIndex()==1) 
						 {
							 DialogDelete2 dijalog2=new DialogDelete2(parent, true);
						 }
						
					 }
					
				});
				add(BtnDelete);

				// toolbar je pokretljiv, probati i sa staticnim toolbarom
				setFloatable(true);
				setBackground(new Color(255, 255, 204));

			}
		}
		public class DialogDelete extends JOptionPane{
			public DialogDelete(final JFrame parent, boolean modal) {
				setSize(100, 200);
				setLocationRelativeTo(parent);
				int dijalog= JOptionPane.showConfirmDialog(parent, "Da li ste sigurni da zelite da obrisete zaposlenog?", "Confirm Deletion",  JOptionPane.OK_CANCEL_OPTION);
				String jmbg=table1.getValueAt(table1.getSelectedRow(),2).toString();		//getvalueat vraca text iz jmbg polja, index polja je 2
			
				if (dijalog != JOptionPane.OK_OPTION) {
					parent.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				} else
					
						model1.removeRow(table1.getSelectedRow());
				try {
					kontroler.removeradnik(jmbg);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
						
			}
		}
	public class DialogDelete2 extends JOptionPane{
			public DialogDelete2(final JFrame parent, boolean modal) {
				setSize(100, 200);
				setLocationRelativeTo(parent);
				int dijalog2= JOptionPane.showConfirmDialog(parent, "Da li ste sigurni da zelite da obrisete softver?", "Confirm Deletion",  JOptionPane.OK_CANCEL_OPTION);
				String name=table2.getValueAt(table2.getSelectedRow(),1).toString();
				
				if (dijalog2 != JOptionPane.OK_OPTION) {
					parent.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				} else
					model2.removeRow(table2.getSelectedRow());
				try {
					kontroler1.removeSoftver(name);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		}
		 public class SimpleDialogZaposleni1 extends JDialog {
				private static final long serialVersionUID = 3591599721565020284L;

				public SimpleDialogZaposleni1(Frame parent, String title, boolean modal) {
					super(parent, title, modal);

					setSize(300, 500);
					setLocationRelativeTo(parent);

					JPanel panCentar = new JPanel();
					// Primeri koriscenja Focus Listenera
							JPanel panZaposleniPanel = new ZaposleniPanel();
							panCentar.add(panZaposleniPanel);
							
							JPanel statusBar = new JPanel();
							statusBar.setBackground(Color.LIGHT_GRAY);
							statusBar.setPreferredSize(new Dimension(100, 30));
							
							String textFieldP = (String) model1.getValueAt(table1.getSelectedRow(),0); 
							String textFieldI = (String) model1.getValueAt(table1.getSelectedRow(),1); 
							String textFieldJ = (String) model1.getValueAt(table1.getSelectedRow(),2); 
							String textFieldDR = (String) model1.getValueAt(table1.getSelectedRow(),3); 
							String textFieldE = (String) model1.getValueAt(table1.getSelectedRow(),4); 
							String textFieldU = (String) model1.getValueAt(table1.getSelectedRow(),5); 
							String textFieldB = (String) model1.getValueAt(table1.getSelectedRow(),6);
							String textFieldG = (String) model1.getValueAt(table1.getSelectedRow(),7);
							String textFieldAl = (String) model1.getValueAt(table1.getSelectedRow(),8); 
							String textFieldRM = (String) model1.getValueAt(table1.getSelectedRow(),9); 
							txtPrezime.setText(textFieldP);
							txtIme.setText(textFieldI);
							txtJMBG.setText(textFieldJ);
							txtDatumRodjenja.setText(textFieldDR);
							txtEmail.setText(textFieldE);
							txtUlica.setText(textFieldU);
							txtBroj.setText(textFieldB);
							txtGrad.setText(textFieldG);
							txtAlati.setText(textFieldAl);
							txtRadnoMesto.setText(textFieldRM);
						
							JButton btnOk=new JButton("Ok");
							btnOk.setPreferredSize(new Dimension(75,25));
							btnOk.addActionListener (new ActionListener () {
								 public void actionPerformed (ActionEvent e) {
									 int index=-1;
										try {
											 System.out.println(textFieldJ);

											index=kontroler.getRadnikByJMBG(textFieldJ);
										} catch (Exception e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										
										String prezimeData = txtPrezime.getText();
										String imeData = txtIme.getText();
										String jmbgData = txtJMBG.getText();
										String datumRData = txtDatumRodjenja.getText();
										String emailData = txtEmail.getText();
										String ulicaData = txtUlica.getText();
										String brojData = txtBroj.getText();
										String gradData = txtGrad.getText();
										String alatiData = txtAlati.getText();
										String radnoMestoData = txtRadnoMesto.getText();
										Adresa a=new Adresa(ulicaData, brojData, gradData);
										Softver s=new Softver(alatiData);
										Zaposleni radnik = new Zaposleni(prezimeData, imeData, jmbgData, datumRData, emailData, a, s, radnoMestoData);
										
										
										 System.out.println(kontroler.getAllZaposleni());
										 
											 
											 model1.setValueAt(radnik.getIme(),index, 0);
											 model1.setValueAt(radnik.getPrezime(), index, 1);	
											 model1.setValueAt(radnik.getJMBG(), index, 2);
											 model1.setValueAt(radnik.getDatum(), index, 3);
											 model1.setValueAt(radnik.getEmail(), index, 4);
											 model1.setValueAt(a.getUlica(), index, 5);
											 model1.setValueAt(a.getBroj(), index, 6);
											 model1.setValueAt(a.getGrad(), index, 7);
											 model1.setValueAt(s.getNaziv(), index, 8);
											 model1.setValueAt(radnik.getRadnoMesto(), index, 9);
											 try {
												kontroler.updateradnik(radnik, textFieldJ);
											} catch (Exception e1) {
												// TODO Auto-generated catch block
												e1.printStackTrace();
											}

											 System.out.println(kontroler.getAllZaposleni());
											 
										dispose();
										
										txtPrezime.setText("");
										txtIme.setText("");
										txtJMBG.setText("");
										txtDatumRodjenja.setText("");
										txtEmail.setText("");
										txtUlica.setText("");
										txtBroj.setText("");
										txtGrad.setText("");
										txtAlati.setText("");
										txtRadnoMesto.setText("");
										
										
									 
								 
								 }
							});

							JButton btnCancel=new JButton("Cancel");
							btnCancel.addActionListener (new ActionListener () {
								 public void actionPerformed (ActionEvent e) {
									dispose();
								 }
							});
							btnCancel.setPreferredSize(new Dimension(75,25));
							statusBar.add(btnOk);
							
							statusBar.add(btnCancel); 
							
							
							add(panCentar, BorderLayout.CENTER);
							add(statusBar, BorderLayout.SOUTH);
				}
			}
		 
		 
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
					
					txtNazivSoftvera.setPreferredSize(dim);
					txtNazivSoftvera.setName("txtNazivSoftvera");
					txtNazivSoftvera.setBackground(Color.GRAY);
					txtNazivSoftvera.addFocusListener(focusListener);

					panNazivSoftvera.add(lblNazivSoftvera);
					panNazivSoftvera.add(txtNazivSoftvera);

					/**JPanel panCetkice = new JPanel(new FlowLayout(FlowLayout.LEFT));
					panCetkice.setBackground(new Color(254, 254, 208));
					JLabel lblCetkice = new JLabel("Cetkice:");
					lblCetkice.setPreferredSize(dim);
					
					txtCetkice.setBackground(Color.GRAY);
					txtCetkice.setName("txtCetkice");
					txtCetkice.addFocusListener(focusListener);
					txtCetkice.setPreferredSize(dim);
					panCetkice.add(lblCetkice);
					panCetkice.add(txtCetkice);*/
					
					JPanel panNazivCetkice = new JPanel(new FlowLayout(FlowLayout.LEFT));
					panNazivCetkice.setBackground(new Color(254, 254, 208));
					JLabel lblNazivCetkice = new JLabel("Naziv Cetkice:");
					lblNazivCetkice.setPreferredSize(dim);
					
					txtNazivCetkice.setBackground(Color.GRAY);
					txtNazivCetkice.setName("txtNazivCetkice");
					txtNazivCetkice.addFocusListener(focusListener);
					txtNazivCetkice.setPreferredSize(dim);
					panNazivCetkice.add(lblNazivCetkice);
					panNazivCetkice.add(txtNazivCetkice);
					
					JPanel panBojaCetkice = new JPanel(new FlowLayout(FlowLayout.LEFT));
					panBojaCetkice.setBackground(new Color(254, 254, 208));
					JLabel lblBojaCetkice = new JLabel("Boja Cetkice:");
					lblBojaCetkice.setPreferredSize(dim);
					
					txtBojaCetkice.setBackground(Color.GRAY);
					txtBojaCetkice.setName("txtBojaCetkice");
					txtBojaCetkice.addFocusListener(focusListener);
					txtBojaCetkice.setPreferredSize(dim);
					panBojaCetkice.add(lblBojaCetkice);
					panBojaCetkice.add(txtBojaCetkice);
					
					JPanel panNamenaCetkice = new JPanel(new FlowLayout(FlowLayout.LEFT));
					panNamenaCetkice.setBackground(new Color(254, 254, 208));
					JLabel lblNamenaCetkice = new JLabel("Namena Cetkice:");
					lblNamenaCetkice.setPreferredSize(dim);
					
					txtNamenaCetkice.setBackground(Color.GRAY);
					txtNamenaCetkice.setName("txtNamenaCetkice");
					txtNamenaCetkice.addFocusListener(focusListener);
					txtNamenaCetkice.setPreferredSize(dim);
					panNamenaCetkice.add(lblNamenaCetkice);
					panNamenaCetkice.add(txtNamenaCetkice);
					

					JPanel panModifikatori = new JPanel(new FlowLayout(FlowLayout.LEFT));
					panModifikatori.setBackground(new Color(254, 254, 208));
					JLabel lblModifikatori = new JLabel("Modifikatori:");
					lblModifikatori.setPreferredSize(dim);
					
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
					
					txtRender.setBackground(Color.GRAY);
					txtRender.setName("txtRender");
					txtRender.addFocusListener(focusListener);
					txtRender.setPreferredSize(dim);
					panRender.add(lblRender);
					panRender.add(txtRender);
					
					
					
				  	
				  
				  	
					
					
					

					Box boxCentar = Box.createVerticalBox();
					boxCentar.add(Box.createVerticalStrut(20));
					boxCentar.add(panNazivSoftvera);
					//boxCentar.add(panCetkice);
					boxCentar.add(panNazivCetkice);
					boxCentar.add(panNamenaCetkice);
					boxCentar.add(panBojaCetkice);
					boxCentar.add(panModifikatori);
					boxCentar.add(panFormatFajla);
					boxCentar.add(panAlatizaAnimaciju);
					boxCentar.add(panRender);
					

					boxCentar.add(Box.createGlue());
					add(boxCentar, BorderLayout.NORTH);

				}

			}
		 public class SimpleDialogSoftver extends JDialog{

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;
				public SimpleDialogSoftver(Frame parent, String title, boolean modal) {
					super(parent, title, modal);

					setSize(300, 500);
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
							btnOk.setPreferredSize(new Dimension(75,25));
							btnOk.addActionListener (new ActionListener () {
								 public void actionPerformed (ActionEvent e) {
									 String softverdata = txtNazivSoftvera.getText();
										//String cetkiceData = txtCetkice.getText();
										String nazivcetkiceData = txtNazivCetkice.getText();
										String namenacetkiceData = txtNamenaCetkice.getText();
										String bojacetkiceData = txtBojaCetkice.getText();
										String modifikatoriData = txtModifikatori.getText();
										String formatfajlaRData = txtFormatFajla.getText();
										String alatizaanimacijuData = txtAlatizaAnimaciju.getText();
										String renderData = txtRender.getText();
										
										Cetkica c=new Cetkica(nazivcetkiceData,namenacetkiceData,bojacetkiceData);
										Softver Softver = new Softver (softverdata,c, modifikatoriData, formatfajlaRData, alatizaanimacijuData,new Render());
										
										 try {
											kontroler1.addSoftver(Softver);
										} catch (Exception e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										 System.out.println(kontroler1.getAllsoftveri());
										 
											 
											 model2.setValueAt(Softver.getNaziv(), kontroler1.getAllsoftveri().size()-1, 0);
											// model2.setValueAt(Softver.getCetkica(), kontroler1.getAllsoftveri().size()-1, 1);
											 model2.setValueAt(c.getNaziv(), kontroler1.getAllsoftveri().size()-1, 1);
											 model2.setValueAt(c.getNamena(), kontroler1.getAllsoftveri().size()-1, 2);
											 model2.setValueAt(c.getBoja(), kontroler1.getAllsoftveri().size()-1, 3);
											 model2.setValueAt(Softver.getModifikator(), kontroler1.getAllsoftveri().size()-1, 4);
											 model2.setValueAt(Softver.getFormat(), kontroler1.getAllsoftveri().size()-1, 5);
											 model2.setValueAt(Softver.getAlat(), kontroler1.getAllsoftveri().size()-1, 6);
											 model2.setValueAt(Softver.getRender(), kontroler1.getAllsoftveri().size()-1, 7);
											
											 
										dispose();
										txtNazivSoftvera.setText("");
										//txtCetkice.setText("");
										txtNazivCetkice.setText("");
										txtNamenaCetkice.setText("");
										txtBojaCetkice.setText("");
										txtModifikatori.setText("");
										txtFormatFajla.setText("");
										txtAlatizaAnimaciju.setText("");
										txtRender.setText("");
										
										
									 
								 
								 }
							});

							JButton btnCancel=new JButton("Cancel");
							btnCancel.addActionListener (new ActionListener () {
								 public void actionPerformed (ActionEvent e) {
									dispose();
								 }
							});
							btnCancel.setPreferredSize(new Dimension(75,25));
							statusBar.add(btnOk);
							
							statusBar.add(btnCancel); 
							
							
							add(panCentar, BorderLayout.CENTER);
							add(statusBar, BorderLayout.SOUTH);
				}
			}
		 public class SimpleDialogSoftver1 extends JDialog{

			
				private static final long serialVersionUID = 1L;
				public SimpleDialogSoftver1(Frame parent, String title, boolean modal) {
					super(parent, title, modal);

					setSize(300, 500);
					setLocationRelativeTo(parent);

					JPanel panCentar = new JPanel();
					// Primeri koriscenja Focus Listenera
							JPanel panSoftverPanel = new SoftverPanel();
							panCentar.add(panSoftverPanel);
							
							JPanel statusBar = new JPanel();
							statusBar.setBackground(Color.LIGHT_GRAY);
							statusBar.setPreferredSize(new Dimension(100, 30));
							
							String textFieldS = (String) model2.getValueAt(table2.getSelectedRow(),0); 
							String textFieldNazivCetkica = (String) model2.getValueAt(table2.getSelectedRow(),1); 
							String textFieldJNamenaCetkica = (String) model2.getValueAt(table2.getSelectedRow(),2); 
							String textFieldBojaCetkica = (String) model2.getValueAt(table2.getSelectedRow(),3);
							String textFieldM = (String) model2.getValueAt(table2.getSelectedRow(),4);
							String textFieldFF = (String) model2.getValueAt(table2.getSelectedRow(),5); 
							String textFieldAA = (String) model2.getValueAt(table2.getSelectedRow(),6); 
							String textFieldR = (String) model2.getValueAt(table2.getSelectedRow(),7); 
							txtNazivSoftvera.setText(textFieldS);
							//txtCetkice.setText(textFieldI);
							txtNazivCetkice.setText(textFieldNazivCetkica);
							txtNamenaCetkice.setText(textFieldJNamenaCetkica);
							txtBojaCetkice.setText(textFieldBojaCetkica);
							txtModifikatori.setText(textFieldM);
							txtFormatFajla.setText(textFieldFF);
							txtAlatizaAnimaciju.setText(textFieldAA);
							txtRender.setText(textFieldR);
							
							
							
							JButton btnOk=new JButton("Ok");
							btnOk.setPreferredSize(new Dimension(75,25));
							btnOk.setPreferredSize(new Dimension(75,25));
							btnOk.addActionListener (new ActionListener () {
								 public void actionPerformed (ActionEvent e) {
									int index=-1;
										try {
											 System.out.println(textFieldS);

											index=kontroler1.getSoftverByName(textFieldS);
										} catch (Exception e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
									 
									 
										String softverdata = txtNazivSoftvera.getText();
										//String cetkiceData = txtCetkice.getText();
										String nazivcetkiceData = txtNazivCetkice.getText();
										String namenacetkiceData = txtNamenaCetkice.getText();
										String bojacetkiceData = txtBojaCetkice.getText();
										String modifikatoriData = txtModifikatori.getText();
										String formatfajlaRData = txtFormatFajla.getText();
										String alatizaanimacijuData = txtAlatizaAnimaciju.getText();
										String renderData = txtRender.getText();
										
										Cetkica c=new Cetkica(nazivcetkiceData,namenacetkiceData,bojacetkiceData);
										Softver Softver = new Softver (softverdata,c, modifikatoriData, formatfajlaRData, alatizaanimacijuData,new Render());
										
										 try {
											kontroler1.addSoftver(Softver);
										} catch (Exception e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										 System.out.println(kontroler1.getAllsoftveri());
										 
											 
											 model2.setValueAt(Softver.getNaziv(), kontroler1.getAllsoftveri().size()-1, 0);
											// model2.setValueAt(Softver.getCetkica(), kontroler1.getAllsoftveri().size()-1, 1);
											 model2.setValueAt(c.getNaziv(), kontroler1.getAllsoftveri().size()-1, 1);
											 model2.setValueAt(c.getNamena(), kontroler1.getAllsoftveri().size()-1, 2);
											 model2.setValueAt(c.getBoja(), kontroler1.getAllsoftveri().size()-1, 3);
											 model2.setValueAt(Softver.getModifikator(), kontroler1.getAllsoftveri().size()-1, 4);
											 model2.setValueAt(Softver.getFormat(), kontroler1.getAllsoftveri().size()-1, 5);
											 model2.setValueAt(Softver.getAlat(), kontroler1.getAllsoftveri().size()-1, 6);
											 model2.setValueAt(Softver.getRender(), kontroler1.getAllsoftveri().size()-1, 7);
											 try {
													kontroler1.updateSoftver(Softver, textFieldS);
												} catch (Exception e1) {
													// TODO Auto-generated catch block
													e1.printStackTrace();
												}

												 System.out.println(kontroler1.getAllsoftveri());
											
											 
										dispose();
										txtNazivSoftvera.setText("");
										//txtCetkice.setText("");
										txtNazivCetkice.setText("");
										txtNamenaCetkice.setText("");
										txtBojaCetkice.setText("");
										txtModifikatori.setText("");
										txtFormatFajla.setText("");
										txtAlatizaAnimaciju.setText("");
										txtRender.setText("");
										
										
									 
								 
								 }
							});

							JButton btnCancel=new JButton("Cancel");
							btnCancel.addActionListener (new ActionListener () {
								 public void actionPerformed (ActionEvent e) {
									dispose();
								 }
							});
							btnCancel.setPreferredSize(new Dimension(75,25));
							statusBar.add(btnOk);
							
							statusBar.add(btnCancel); 
							
							
							add(panCentar, BorderLayout.CENTER);
							add(statusBar, BorderLayout.SOUTH);
				}
			}
}
	

