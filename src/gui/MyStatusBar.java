/**
 * 
 */
package gui;

import java.awt.Dimension;
import java.util.Date;
import java.text.SimpleDateFormat;


import javax.swing.JLabel;


/**
 * @author matov
 *https://stackoverflow.com/questions/3035880/how-can-i-create-a-bar-in-the-bottom-of-a-java-app-like-a-status-bar
 * VEZBE_06_Date-enum-kolekcije-sortiranje.doc
 */
public class MyStatusBar extends JLabel{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 2435356;

	/** Creates a new instance of StatusBar */
    public MyStatusBar() {
        super();
        super.setPreferredSize(new Dimension(100, 16));
        
        SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
        Date datum=new Date();
        
		setMessage("Datum: " + format.format(datum));
      
    }

    public void setMessage(String message) {
        setText(" "+message);        
    }        
}

