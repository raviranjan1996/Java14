package gui;

import java.awt.BorderLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private GamePanel pannel = new GamePanel();
	public static String defaultFIleName = "gameOfLife.gol";

	public MainFrame() {
		super("Game of Life");

		add(pannel, BorderLayout.CENTER);

		MenuItem openItem = new MenuItem("Open");
		MenuItem saveItem = new MenuItem("Save");

		Menu fileMenu = new Menu("File");
		fileMenu.add(openItem);
		fileMenu.add(saveItem);

		MenuBar menuBar = new MenuBar();
		menuBar.add(fileMenu);

		setMenuBar(menuBar);

		JFileChooser fileChooser = new JFileChooser();
		var filter = new FileNameExtensionFilter("Game of life Files", "gol");
		fileChooser.addChoosableFileFilter(filter);
		fileChooser.setFileFilter(filter);
		
		
		//w can choose any way between saveItem and openItem
		openItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				int userOption = fileChooser.showOpenDialog(MainFrame.this);
				if (userOption == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fileChooser.getSelectedFile();
					pannel.open(selectedFile);
				}


			}
		});

		saveItem.addActionListener(e -> {
			File fileName = new File(defaultFIleName);
			fileChooser.setSelectedFile(fileName);
			int userOption = fileChooser.showSaveDialog(MainFrame.this);
			if (userOption == JFileChooser.APPROVE_OPTION) {
				File selectedFile = fileChooser.getSelectedFile();
				pannel.save(selectedFile);
			}
		});

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
