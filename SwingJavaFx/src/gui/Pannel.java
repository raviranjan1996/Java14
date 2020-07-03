package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class Pannel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public Pannel() {
		setLayout(new BorderLayout());
		setBackground(Color.green);
		System.out.println("panel");
	}

}
