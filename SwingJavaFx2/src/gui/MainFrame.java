package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainFrame(String title) {
		super(title);

		final Pannel mainPannel = new Pannel();
		
		final ToolBar toolBar = new ToolBar();
		
		toolBar.setColorChangeListner(mainPannel);
		add(toolBar, BorderLayout.NORTH);
		add(mainPannel, BorderLayout.CENTER);
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}
