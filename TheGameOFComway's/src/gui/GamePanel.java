package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.swing.JPanel;

import model.World;

public class GamePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private final int CELLSIZE = 10;

	private static Color backgroudColor = Color.BLACK;
//	private static Color foregroudColor = Color.GREEN;
	private static Color gridColor = Color.GRAY;
	private World world;
	private int leftRightMargin;
	private int topBottomMargin;
	private static Color[] colors = {Color.pink , Color.blue , Color.green , Color.cyan};
	private Random random = new Random();
	private Color colours = colors[random.nextInt(colors.length)];

	public GamePanel() {
		addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				int row = (e.getY() - topBottomMargin) / CELLSIZE;
				int col = (e.getX() - leftRightMargin) / CELLSIZE;
				if (row >= world.getRow() || col >= world.getColumns()) {
					return;
				}
				boolean status = world.getCells(row, col);
				world.setCells(row, col, !status);

				repaint(); // calls the paint method as soon as possible
			}
		});
		//Executors.newScheduledThreadPool(1).scheduleAtFixedRate(()-> next(),500, 500, TimeUnit.MILLISECONDS);
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		int width = getWidth(); // return the width of the window
		int height = getHeight(); // retun the height of the window

		leftRightMargin = ((width % CELLSIZE) + CELLSIZE) / 2;
		topBottomMargin = ((height % CELLSIZE) + CELLSIZE) / 2;
		int row = (height - 2 * topBottomMargin) / CELLSIZE;

		int column = (width - 2 * leftRightMargin) / CELLSIZE;

		if (world == null) {
			world = new World(row, column);
		}

		else {
			if (world.getRow() != row || world.getColumns() != column) {

				world = new World(row, column);
			}
		}
		
		
		
		g2.setColor(backgroudColor);
		g2.fillRect(0, 0, width, height);
		g2.setColor(colours);
		drawGrid(g2, width, height);

		for (int col = 0; col < column; col++) {
			for (int rows = 0; rows < row; rows++) {
				boolean status = world.getCells(rows, col);
				fillColor(g2, rows, col, status);

			}
		}

	}

	private void fillColor(Graphics2D g2, int row, int col, boolean status) {
		Color color = status ? colours : backgroudColor;
    	g2.setColor(color);

		int x = leftRightMargin + col * CELLSIZE;
		int y = topBottomMargin + row * CELLSIZE;
		g2.fillRect(x + 2, y + 2, CELLSIZE - 3, CELLSIZE - 3);
	}

	private void drawGrid(Graphics2D g2, int width, int height) {
		g2.setColor(gridColor);
		for (int x = leftRightMargin; x <= width - leftRightMargin; x += CELLSIZE) {
			g2.drawLine(x, topBottomMargin, x, height - topBottomMargin);

		}

		for (int y = topBottomMargin; y <= width - topBottomMargin; y += CELLSIZE) {
			g2.drawLine(leftRightMargin, y, width - leftRightMargin, y);
		}

	}

	public void randomize() {
		world.randomize();
		repaint();

	}

	public void clear() {
		world.clear();
		repaint();

	}

	public void next() {
		world.next();
		repaint();

	}

}
