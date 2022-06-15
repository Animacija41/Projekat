package gui;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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
	public MyToolbar() {
		// u konstruktor nadklase, tj klse JToolbar prosleđuje
		// se orijentacija toolbar-a, moguća i sa konstantom: SwingConstants.VERTICAL

		super(SwingConstants.HORIZONTAL);
		JButton btnNew = new JButton();
		btnNew.setToolTipText("New");
		btnNew.setIcon(new ImageIcon("ikonice/add.png"));
		add(btnNew);

		addSeparator();

		JButton btnOpen = new JButton();
		btnOpen.setToolTipText("Open");
		btnOpen.setIcon(new ImageIcon("ikonice/editing.png"));
		add(btnOpen);

		addSeparator();

		JToggleButton tglBtnBold = new JToggleButton();
		tglBtnBold.setToolTipText("Bold");
		tglBtnBold.setIcon(new ImageIcon("ikonice/recycle-bin.png"));
		add(tglBtnBold);

		// toolbar je pokretljiv, probati i sa statičnim toolbarom
		setFloatable(true);
		setBackground(new Color(255, 255, 204));

	}
}
