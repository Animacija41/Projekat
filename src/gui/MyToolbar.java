package gui;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

/**
 * 
 */
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
