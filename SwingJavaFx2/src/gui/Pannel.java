package gui;

import java.awt.Color;

import javax.swing.JPanel;

public class Pannel extends JPanel implements ColorChangeListener{

	private static final long serialVersionUID = 1L;
	public Pannel() {
		setBackground(Color.DARK_GRAY);
	}
	
	public void changeColour(Color color) {
		setBackground(color);
	}

}
