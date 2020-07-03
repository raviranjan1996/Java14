package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title);
		add(new ToolBar() , BorderLayout.NORTH);
		add(new Pannel(), BorderLayout.CENTER);
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
