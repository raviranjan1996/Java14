package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

class RedButtonListner implements ActionListener {
	private Pannel redpannel;
	private Color color;
	 public RedButtonListner(Pannel pannel , Color  color) {
		 this.redpannel = pannel;
		 this.color = color;//here we are copying the reference of the object Pannel which is defined in MainFrame
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	redpannel.color(color);
		

	}
	
		
	
	

}

class BlueButtonListner implements ActionListener {
	private Pannel bluepannel;
	private Color color;
	public BlueButtonListner(Pannel pannel , Color color) {
		this.bluepannel = pannel;
		this.color = color;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		bluepannel.color(color);
	}

}

public class ToolBar extends JToolBar {

	private static final long serialVersionUID = 1L;

	public ToolBar(Pannel pannel) {

		final JButton jRedButton = new JButton("Red");
		final JButton jBlueButton = new JButton("Blue");
		jRedButton.addActionListener(new RedButtonListner(pannel , Color.red));
		jBlueButton.addActionListener(new BlueButtonListner(pannel , Color.blue));
		add(jRedButton);
		add(jBlueButton);
		setBackground(Color.cyan);

	}

}
