/**
 * 
 */
package gui;

import java.awt.Dimension;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.FormatStyle;

import javax.swing.JLabel;
import javax.swing.text.DateFormatter;

/**
 * @author matov
 *https://stackoverflow.com/questions/3035880/how-can-i-create-a-bar-in-the-bottom-of-a-java-app-like-a-status-bar
 * VEZBE_06_Date-enum-kolekcije-sortiranje.doc
 */
public class MyStratusBar extends JLabel{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 2435356;

	/** Creates a new instance of StatusBar */
    public MyStratusBar() {
        super();
        super.setPreferredSize(new Dimension(100, 16));
        
        LocalDate curentLocalDate = LocalDate.now();
        
		setMessage("Date: " + curentLocalDate);
      
    }

    public void setMessage(String message) {
        setText(" "+message);        
    }        
}

