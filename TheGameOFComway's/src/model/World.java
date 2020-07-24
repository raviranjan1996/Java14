package model;

import java.util.Arrays;
import java.util.Random;

public class World {

	private int rows;
	private int columns;
	private Random random = new Random();
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
				buffer[row][col]= status;
			}
		}
		
		for(int row = 0 ; row < rows ; row++) {
			for(int col = 0 ; col < columns ; col++) {
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

}
