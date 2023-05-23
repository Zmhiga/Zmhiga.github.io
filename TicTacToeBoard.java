// Zachary Higa, lab section 3

/* This program designs the TicTacToe board that will be used in the game.
 * The board will have a mouse listener, so when the user clicks on a cell, a red square icon will appear.
 * The program will also play and select cells at random to place a blue diamond icon in the selected cells.
 * When the ending conditions are met, the ending prompt will appear on the screen, and the user can feel free to play again and restart by clicking the board.
 */

import java.awt.Color;

import java.awt.Dimension;

import java.awt.Graphics;

import java.awt.event.MouseEvent;

import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class TicTacToeBoard extends JPanel {
	
	// Initializing the private variables positionX and positionY that will be used to determine which cell the user is clicking on.
	
	private int positionX;
	
	private int positionY;
	
	// Initializing the moveCounter variable which will keep track of the move that we are at.
	
	private int moveCounter;
	
	// Initializing the String variable end that will determine when the game has ended.
	
	private String end = null;
	
	// Initializing the Color variables for each cell that will keep track of each cell's color (diamond or square), and also determine when someone has won or lost.
	
	private Color cellOne = null;
	
	private Color cellTwo = null;
	
	private Color cellThree = null;
	
	private Color cellFour = null;
	
	private Color cellFive = null;
	
	private Color cellSix = null;
	
	private Color cellSeven = null;
	
	private Color cellEight = null;
	
	private Color cellNine = null;
	
	// Initializing and constructing an array, cells, with Color objects of size 9.
	
	private Color[] cells = new Color[9];
	
	// Constructing our TicTacToe board.
	
	public TicTacToeBoard() {
		
		// Adding a mouse listener to the TicTacToe board.
		
		addMouseListener(new MouseClick());
		
		// Assigning the int value 0 to the moveCounter variable.
		
		moveCounter = 0;
		
		// Setting the size of the TicTacToe board with the given dimension.
		
		setPreferredSize(new Dimension(300,300));
		
	}
	
	// The class MouseClick that implements the MouseListener interface.
	
	class MouseClick implements MouseListener {
		
		// When the mouse is clicked, the method below will be called by the TicTacToe board.

		public void mouseClicked(MouseEvent e) {
				
			// Gets the x and y coordinates/position of where the mouse was clicked on the TicTacToe board.
				
			positionX = e.getX();
				
			positionY = e.getY();
			
			// Initializing a Color Object, pickedCell, that will take the color of the cell that the user has chosen.
			
			Color pickedCell = null;
			
			// As the mouse is clicked, the moveCounter will increment as the user will choose a cell as their move.
			
			moveCounter++;
			
			// At the given position X and Y, the user has selected the first cell (first column, first row).
				
			if ((positionX > 0) && (positionX < 100) && (positionY > 0) && (positionY < 100)) {
				
				// Assigning the pickedCell to assume the color of cellOne if it has a color.
					
				pickedCell = cellOne;
				
				// If the cell does not have a color, then we will give the cell the color red.
				
				if (cellOne == null) {
					
					cellOne = Color.RED;
					
				}
					
			}
			
			// At the given position X and Y, the user has selected the second cell (second column, first row).
				
			else if ((positionX > 100) && (positionX < 200) && (positionY > 0) && (positionY < 100)) {
					
					pickedCell = cellTwo;
					
					if (cellTwo == null) {
						
						cellTwo = Color.RED;
						
					}
					
				}
			
			// At the given position X and Y, the user has selected the third cell (third column, first row).
				
			else if ((positionX > 200) && (positionX < 300) && (positionY > 0) && (positionY < 100)) {
					
				pickedCell = cellThree;
					
				if (cellThree == null) {
						
					cellThree = Color.RED;
						
				}
					
			}
			
			// At the given position X and Y, the user has selected the fourth cell (first column, second row).
				
			else if ((positionX > 0) && (positionX < 100) && (positionY > 100) && (positionY < 200)) {
					
				pickedCell = cellFour;
					
				if (cellFour == null) {
						
					cellFour = Color.RED;
						
				}
					
			}
			
			// At the given position X and Y, the user has selected the fifth cell (second column, second row).
				
			else if ((positionX > 100) && (positionX < 200) && (positionY > 100) && (positionY < 200)) {
					
				pickedCell = cellFive;
					
				if (cellFive == null) {
						
					cellFive = Color.RED;
						
				}
					
			}
			
			// At the given position X and Y, the user has selected the sixth cell (third column, second row).
				
			else if ((positionX > 200) && (positionX < 300) && (positionY > 100) && (positionY < 200)) {
					
				pickedCell = cellSix;
					
				if (cellSix == null) {
						
					cellSix = Color.RED;
						
				}
					
			}
			
			// At the given position X and Y, the user has selected the seventh cell (first column, third row).
				
			else if ((positionX > 0) && (positionX < 100) && (positionY > 200) && (positionY < 300)) {
					
				pickedCell = cellSeven;
					
				if (cellSeven == null) {
						
					cellSeven = Color.RED;
						
				}
					
			}
			
			// At the given position X and Y, the user has selected the eighth cell (second column, third row).
				
			else if ((positionX > 100) && (positionX < 200) && (positionY > 200) && (positionY < 300)) {
					
				pickedCell = cellEight;
					
				if (cellEight == null) {
						
					cellEight = Color.RED;
						
				}
					
			}
			
			// At the given position X and Y, the user has selected the ninth cell (third column, third row).
				
			else if ((positionX > 200) && (positionX < 300) && (positionY > 200) && (positionY < 300)) {
					
				pickedCell = cellNine;
					
				if (cellNine == null) {
						
					cellNine = Color.RED;
						
				}
					
			}
			
			// If one of the gridlines is selected, then we will assign pickedCell the color black, so the user will be able to click again before the program makes its move.
				
			else {
					
				pickedCell = Color.BLACK;
					
			}
			
			// If the cell (or gridline) picked has a color assigned to it, then we will reduce the move counter, and the user will get to click another cell that does not have a color.
				
			if (pickedCell != null) {
				
				moveCounter--;
				
			}
			
			// If the cell chosen is null, then a cell was now assigned a color, so it's the program's turn to choose a cell.
				
			else {
			
			// The paintComponents method will be called, and the TicTacToe board will be repainted each time that the mouse is clicked.
			
			repaint();
			
			// If the moveCounter is at nine, then the player will choose the last spot to place their icon, and it would be painted using the repaint above.
			
			if (moveCounter == 9) {
				
				
			}
			
			// If the moveCounter is not yet at nine, then the program can still play and randomly select a spot cell to take.
			
			else {
				
				// for loop that takes every cell, and in order, assigns the color of each to each index of the array cells.
			
				for (int index = 0; index < 8; index++) {
				
					cells[0] = cellOne;
				
					cells[1] = cellTwo;
				
					cells[2] = cellThree;
				
					cells[3] = cellFour;
				
					cells[4] = cellFive;
				
					cells[5] = cellSix;
				
					cells[6] = cellSeven;
				
					cells[7] = cellEight;
				
					cells[8] = cellNine;
				
				}
				
				// Initializing and assigning the variable chooseCell to be a number between 0 (inclusive) and 9.
			
				int chooseCell = (int) (9 * Math.random());
				
				// Initializing the variable randomCell to take the color at the randomly selected index of the array.
			
				Color randomCell = cells[chooseCell];
				
				// If the randomCell's color is not null, then we will continue to randomly choose indices of the array until we find an index with no color assigned to it.
			
				while (randomCell != null) {
				
					chooseCell = (int) (9 * Math.random());
				
					randomCell = cells[chooseCell];
				
				}
				
				/* When the randomCell has no color, we will assign the color blue to the randomly selected index of the array.
				 * Then, we will assign each cell to its corresponding array index color, and one of the cells will now be assigned the color blue.
				 */
			
				if (randomCell == null) {
				
					cells[chooseCell] = Color.BLUE;
				
					cellOne = cells[0];
				
					cellTwo = cells[1];
				
					cellThree = cells[2];
				
					cellFour = cells[3];
				
					cellFive = cells[4];
				
					cellSix = cells[5];
				
					cellSeven = cells[6];
				
					cellEight = cells[7];
				
					cellNine = cells[8];
				
				}
				
				// After the program makes its move, we will add that another move has been made to the moveCounter.
			
				moveCounter++;
				
				// Calling the paintComponent method, drawing the diamond in the new cell that the program selected.
			
				repaint();
			
			}
			
		}
			
	}
		
		// Other methods included through the implementation of the interface MouseListener
		
		public void mousePressed(MouseEvent e) {
			
		}

		public void mouseReleased(MouseEvent e) {
			
			
		}

		public void mouseEntered(MouseEvent e) {
			
		}

		public void mouseExited(MouseEvent e) {
			
		}
		
	}
	
	// The paintComponent method that will be used to draw the components of our TicTacToe board.
	
	public void paintComponent(Graphics g) {
		
		// Overrides the paintComponent method of the super class.
		
		super.paintComponent(g);
		
		// Gets the width and height of the board that we will be playing on.
		
		int width = getWidth();
		
		int height = getHeight();
		
		// Drawing the grid for the TicTacToe Board in the color black.
		
		g.setColor(Color.BLACK);
		
		g.drawLine(width / 3, 0, width / 3, height);
		
		g.drawLine(2 * width / 3, 0, 2 * width / 3, height);
		
		g.drawLine(0, height / 3, width, height / 3);
		
		g.drawLine(0, 2 * height / 3, width, 2 * height / 3);
		
		// If the first cell has been selected by the user or program, then the cell will have a red square/blue diamond icon on it.
		
		if (cellOne == Color.RED) {
			
			g.setColor(Color.RED);
			
			g.drawLine(10, 90, 90, 90);
			
			g.drawLine(90, 90, 90, 10);
			
			g.drawLine(90, 10, 10, 10);
			
			g.drawLine(10, 10, 10, 90);
			
		}
		
		else if (cellOne == Color.BLUE) {
			
			g.setColor(Color.BLUE);
			
			g.drawLine(10, 50, 50, 90);
			
			g.drawLine(50, 90, 90, 50);
			
			g.drawLine(90, 50, 50, 10);
			
			g.drawLine(50, 10, 10, 50);
			
		}
		
		// If the second cell has been selected by the user or program, then the cell will have a red square/blue diamond icon on it.
		
		if (cellTwo == Color.RED) {
			
			g.setColor(Color.RED);
			
			g.drawLine(110, 10, 190, 10);
			
			g.drawLine(190, 10, 190, 90);
			
			g.drawLine(190, 90, 110, 90);
			
			g.drawLine(110, 90, 110, 10);
			
		}
		
		else if (cellTwo == Color.BLUE) {
			
			g.setColor(Color.BLUE);
			
			g.drawLine(110, 50, 150, 90);
			
			g.drawLine(150, 90, 190, 50);
			
			g.drawLine(190, 50, 150, 10);
			
			g.drawLine(150, 10, 110, 50);
			
		}
		
		// If the third cell has been selected by the user or program, then the cell will have a red square/blue diamond icon on it.
		
		if (cellThree == Color.RED) {
			
			g.setColor(Color.RED);
			
			g.drawLine(210, 10, 290, 10);
			
			g.drawLine(290, 10, 290, 90);
			
			g.drawLine(290, 90, 210, 90);
			
			g.drawLine(210, 90, 210, 10);
			
		}
		
		else if (cellThree == Color.BLUE) {
			
			g.setColor(Color.BLUE);
			
			g.drawLine(210, 50, 250, 90);
			
			g.drawLine(250, 90, 290, 50);
			
			g.drawLine(290, 50, 250, 10);
			
			g.drawLine(250, 10, 210, 50);
			
		}
		
		// If the fourth cell has been selected by the user or program, then the cell will have a red square/blue diamond icon on it.
		
		if (cellFour == Color.RED) {
			
			g.setColor(Color.RED);
			
			g.drawLine(10, 110, 90, 110);
			
			g.drawLine(90, 110, 90, 190);
			
			g.drawLine(90, 190, 10, 190);
			
			g.drawLine(10, 190, 10, 110);
			
		}
		
		else if (cellFour == Color.BLUE) {
			
			g.setColor(Color.BLUE);
			
			g.drawLine(10, 150, 50, 190);
			
			g.drawLine(50, 190, 90, 150);
			
			g.drawLine(90, 150, 50, 110);
			
			g.drawLine(50, 110, 10, 150);
			
		}
		
		// If the fifth cell has been selected by the user or program, then the cell will have a red square/blue diamond icon on it.
		
		if (cellFive == Color.RED) {
			
			g.setColor(Color.RED);
			
			g.drawLine(110, 110, 190, 110);
			
			g.drawLine(190, 110, 190, 190);
			
			g.drawLine(190, 190, 110, 190);
			
			g.drawLine(110, 190, 110, 110);
			
		}
		
		else if (cellFive == Color.BLUE) {
			
			g.setColor(Color.BLUE);
			
			g.drawLine(110, 150, 150, 190);
			
			g.drawLine(150, 190, 190, 150);
			
			g.drawLine(190, 150, 150, 110);
			
			g.drawLine(150, 110, 110, 150);
			
		}
		
		// If the sixth cell has been selected by the user or program, then the cell will have a red square/blue diamond icon on it.
		
		if (cellSix == Color.RED) {
			
			g.setColor(Color.RED);
			
			g.drawLine(210, 110, 290, 110);
			
			g.drawLine(290, 110, 290, 190);
			
			g.drawLine(290, 190, 210, 190);
			
			g.drawLine(210, 190, 210, 110);
			
		}
		
		else if (cellSix == Color.BLUE) {
			
			g.setColor(Color.BLUE);
			
			g.drawLine(210, 150, 250, 190);
			
			g.drawLine(250, 190, 290, 150);
			
			g.drawLine(290, 150, 250, 110);
			
			g.drawLine(250, 110, 210, 150);
			
		}
		
		// If the seventh cell has been selected by the user or program, then the cell will have a red square/blue diamond icon on it.
		
		if (cellSeven == Color.RED) {
			
			g.setColor(Color.RED);
			
			g.drawLine(10, 210, 90, 210);
			
			g.drawLine(90, 210, 90, 290);
			
			g.drawLine(90, 290, 10, 290);
			
			g.drawLine(10, 290, 10, 210);
			
		}
		
		else if (cellSeven == Color.BLUE) {
			
			g.setColor(Color.BLUE);
			
			g.drawLine(10, 250, 50, 290);
			
			g.drawLine(50, 290, 90, 250);
			
			g.drawLine(90, 250, 50, 210);
			
			g.drawLine(50, 210, 10, 250);
			
		}
		
		// If the eighth cell has been selected by the user or program, then the cell will have a red square/blue diamond icon on it.
		
		if (cellEight == Color.RED) {
			
			g.setColor(Color.RED);
			
			g.drawLine(110, 210, 190, 210);
			
			g.drawLine(190, 210, 190, 290);
			
			g.drawLine(190, 290, 110, 290);
			
			g.drawLine(110, 290, 110, 210);
			
		}
		
		else if (cellEight == Color.BLUE) {
			
			g.setColor(Color.BLUE);
			
			g.drawLine(110, 250, 150, 290);
			
			g.drawLine(150, 290, 190, 250);
			
			g.drawLine(190, 250, 150, 210);
			
			g.drawLine(150, 210, 110, 250);
			
		}
		
		// If the ninth cell has been selected by the user or program, then the cell will have a red square/blue diamond icon on it.
		
		if (cellNine == Color.RED) {
			
			g.setColor(Color.RED);
			
			g.drawLine(210, 210, 290, 210);
			
			g.drawLine(290, 210, 290, 290);
			
			g.drawLine(290, 290, 210, 290);
			
			g.drawLine(210, 290, 210, 210);
			
		}

		else if (cellNine == Color.BLUE) {
			
			g.setColor(Color.BLUE);
			
			g.drawLine(210, 250, 250, 290);
			
			g.drawLine(250, 290, 290, 250);
			
			g.drawLine(290, 250, 250, 210);
			
			g.drawLine(250, 210, 210, 250);
			
		}
		
		// Changing the color to black that will be used to write out the statements when the winning/losing conditions are met.
		
		g.setColor(Color.BLACK);
		
		// If the conditions for a player/program getting three in a row (losing) are met, then the ending congratulatory prompt will appear.
		
		if ((cellOne == Color.RED) && (cellTwo == Color.RED) && (cellThree == Color.RED)) {
			
			g.drawString("The Winner is the Diamond Player", 50, 150);
			
			end = "done";
			
		}
		
		else if ((cellOne == Color.BLUE) && (cellTwo == Color.BLUE) && (cellThree == Color.BLUE)) {
			
			g.drawString("The Winner is the Square Player", 50, 150);
			
			end = "done";
			
		}
		
		else if ((cellOne == Color.RED) && (cellFour == Color.RED) && (cellSeven == Color.RED)) {
			
			g.drawString("The Winner is the Diamond Player", 50, 150);
			
			end = "done";
			
		}
		
		else if ((cellOne == Color.BLUE) && (cellFour == Color.BLUE) && (cellSeven == Color.BLUE)) {
			
			g.drawString("The Winner is the Square Player", 50, 150);
			
			end = "done";
			
		}
		
		else if ((cellOne == Color.RED) && (cellFive == Color.RED) && (cellNine == Color.RED)) {
			
			g.drawString("The Winner is the Diamond Player", 50, 150);
			
			end = "done";
			
		}
		
		else if ((cellOne == Color.BLUE) && (cellFive == Color.BLUE) && (cellNine == Color.BLUE)) {
			
			g.drawString("The Winner is the Square Player", 50, 150);
			
			end = "done";
			
		}
		
		else if ((cellFour == Color.RED) && (cellFive == Color.RED) && (cellSix == Color.RED)) {
			
			g.drawString("The Winner is the Diamond Player", 50, 150);
			
			end = "done";
			
		}
		
		else if ((cellFour == Color.BLUE) && (cellFive == Color.BLUE) && (cellSix == Color.BLUE)) {
			
			g.drawString("The Winner is the Square Player", 50, 150);
			
			end = "done";
			
		}
		
		else if ((cellSeven == Color.RED) && (cellEight == Color.RED) && (cellNine == Color.RED)) {
			
			g.drawString("The Winner is the Diamond Player", 50, 150);
			
			end = "done";
			
		}
		
		else if ((cellSeven == Color.BLUE) && (cellEight == Color.BLUE) && (cellNine == Color.BLUE)) {
			
			g.drawString("The Winner is the Square Player", 50, 150);
			
			end = "done";
			
		}
		
		else if ((cellThree == Color.RED) && (cellFive == Color.RED) && (cellSeven == Color.RED)) {
			
			g.drawString("The Winner is the Diamond Player", 50, 150);
			
			end = "done";
			
		}
		
		else if ((cellThree == Color.BLUE) && (cellFive == Color.BLUE) && (cellSeven == Color.BLUE)) {
			
			g.drawString("The Winner is the Square Player", 50, 150);
			
			end = "done";
			
		}
		
		else if ((cellTwo == Color.RED) && (cellFive == Color.RED) && (cellEight == Color.RED)) {
			
			g.drawString("The Winner is the Diamond Player", 50, 150);
			
			end = "done";
			
		}
		
		else if ((cellTwo == Color.BLUE) && (cellFive == Color.BLUE) && (cellEight == Color.BLUE)) {
			
			g.drawString("The Winner is the Square Player", 50, 150);
			
			end = "done";
			
		}
		
		else if ((cellThree == Color.RED) && (cellSix == Color.RED) && (cellNine == Color.RED)) {
			
			g.drawString("The Winner is the Diamond Player", 50, 150);
			
			end = "done";
			
		}
		
		else if ((cellThree == Color.BLUE) && (cellSix == Color.BLUE) && (cellNine == Color.BLUE)) {
			
			g.drawString("The Winner is the Square Player", 50, 150);
			
			end = "done";
			
		}
		
		// In the case where none of the ending conditions are met, neither the player or program has won the game.
		
		else if ((cellOne != null) && (cellTwo != null) && (cellThree != null) && (cellFour != null) && (cellFive != null) && (cellSix != null) && (cellSeven != null) && (cellEight != null) && (cellNine != null) && (moveCounter == 9)) {
			
			g.drawString("There is No Winner For This Game", 50, 150);
			
			end = "done";
			
		}
		
		// Clearing the board after we complete the game by resetting the click counter and the colors of every cell.
		
		if (end == "done") {
			
			g.drawString("Click Anywhere to Start New Game", 50, 280);
			
			cellOne = null;
			
			cellTwo = null;
			
			cellThree = null;
			
			cellFour = null;
			
			cellFive = null;
			
			cellSix = null;
			
			cellSeven = null;
			
			cellEight = null;
			
			cellNine = null;
			
			end = null;
			
			moveCounter = 0;
			
		}
		
	}
	
	
	
}