package gui;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private GamePanel pannel = new GamePanel();

	public MainFrame() {
		super("Game of Life");

		add(pannel, BorderLayout.CENTER);
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {

				int code = e.getKeyCode();
				switch (code) {
				case 32:
					pannel.next();
				
					break;
				case 10:
					pannel.randomize();
					break;
				case 8:
					pannel.clear();
					break;

				}
			}

		});

		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

}
