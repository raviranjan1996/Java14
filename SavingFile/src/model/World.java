package model;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

import exceptions.MismatchSizeException;
import gui.GamePanel;

public class World {

	private int rows;
	private int columns;
	private Random random = new Random();
	private String GAME_SAVED = "Game Saved";
	private String message = "Message";
	private boolean[][] grid;
	private boolean[][] buffer;

	public World(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;

		grid = new boolean[rows][columns];
		buffer = new boolean[rows][columns];
	}

	public boolean getCells(int row, int col) {
		return grid[row][col];

	}

	public void setCells(int row, int col, boolean status) {
		grid[row][col] = status;

	}

	public int getRow() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public void randomize() {

		for (int i = 0; i < rows * columns; i++) {

			int row = random.nextInt(rows);
			int col = random.nextInt(columns);
			setCells(row, col, true);
		}

	}

	public void clear() {
		for (int row = 0; row < rows; row++) {
			Arrays.fill(grid[row], false);
		}

	}

	public void next() {
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {

				int neighbour = countNeighbour(row, col);
				boolean status = false;
				if (neighbour < 2) {
					status = false;
				} else if (neighbour > 3) {
					status = false;
				} else if (neighbour == 3) {
					status = true;
				} else if (neighbour == 2) {
					status = getCells(row, col);
				}
				buffer[row][col] = status;
			}
		}

		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < columns; col++) {
				grid[row][col] = buffer[row][col];
			}
		}

	}

	private int countNeighbour(int row, int col) {
		int neighbour = 0;
		for (int rowOffset = -1; rowOffset <= 1; rowOffset++) {
			for (int colOffset = -1; colOffset <= 1; colOffset++) {

				if (rowOffset == 0 && colOffset == 0) {
					continue;
				}

				int gridRow = row + rowOffset;
				int gridCOl = col + colOffset;

				if (gridRow < 0) {
					continue;
				} else if (gridRow == rows) {
					continue;
				}
				if (gridCOl < 0) {
					continue;
				} else if (gridCOl == columns) {
					continue;
				}

				boolean status = getCells(gridRow, gridCOl);
				if (status) {
					neighbour++;
				}

			}
		}
		return neighbour;
	}

	public void save(File selectedFile) throws IOException {

		try (var dos = new DataOutputStream(new FileOutputStream(selectedFile))) {

			dos.writeInt(rows);
			dos.writeInt(columns);

			for (int row = 0; row < rows; row++) {
				for (int col = 0; col < columns; col++) {
					dos.writeBoolean(grid[row][col]);

				}
			}
			saveDialoge();

		} 
	}

	private void saveDialoge() {
		JOptionPane.showMessageDialog(null, GAME_SAVED, message, JOptionPane.INFORMATION_MESSAGE);

	}

	public void open(File selectedFile) throws IOException, MismatchSizeException {

		try (var dis = new DataInputStream(new FileInputStream(selectedFile))) {
			
			int filerows = dis.readInt();
			int filecolumns = dis.readInt();
					
			for(int row = 0 ; row < filerows ; row++) {
				for(int col =0 ; col < filecolumns ; col ++) {
					boolean status = dis.readBoolean();
					System.out.println(status);
					if(row >=rows || col >=columns) {
						continue;
					}
					else {
						grid[row][col] = status;
						
					}
				}
			}
			if(filerows != this.rows || filecolumns !=this.columns) {
				throw new MismatchSizeException();
			}
		} 
	}

}
