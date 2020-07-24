package gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class ToolBar extends JToolBar {

	private static final long serialVersionUID = 1L;
	private ColorChangeListener colorChangeListner;
	

	
	public void setColorChangeListner(ColorChangeListener colorChangeListner) {
		this.colorChangeListner = colorChangeListner;
	}



	public ToolBar() {

		final JButton jRedButton = new JButton("Red");
		final JButton jBlueButton = new JButton("Blue");
		jRedButton.addActionListener(e->colorChangeListner.changeColour(Color.red));
		jBlueButton.addActionListener(e->colorChangeListner.changeColour(Color.blue));
		
		add(jRedButton);
		add(jBlueButton);
	}

}
