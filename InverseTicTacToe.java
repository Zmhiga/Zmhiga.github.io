// Zachary Higa, lab section 3

/* This program builds the JFrame that will present the Inverse TicTacToe game that the user can interact with.
 * We add the TicTacToe board constructed in our other program to be added to this frame to interact with.
 * When this program is run, the game will start, and the user will see the TicTacToe board on their screen.
 * The user will click and interact with the frame, and they will be able to play with the program until they choose to close the window.
 */

import javax.swing.JFrame;

// Our class InverseTicTacToe is a subclass of the super class JFrame

public class InverseTicTacToe extends JFrame {
	
	// Constructing InverseTicTacToe frame
	
	public InverseTicTacToe() {
		
		// Setting the title of the frame to be "Inverse Tic-Tac Toe".
		
		setTitle("Inverse Tic-Tac Toe");
		
		// The program will exit when the frame is closed by the user.
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Constructing a new TicTacToe board.
		
		TicTacToeBoard board = new TicTacToeBoard();
		
		// Adding the TicTacToe board to our frame.
		
		add(board);
		
		// Setting the frame to be visible.
		
		setVisible(true);
		
		// Packing the contents of the TicTacToe board to the frame
		
		pack();
	
	}
	
	public static void main(String[] args) {
		
		// Constructing a InverseTicTacToe object, so a frame will pop up when the program is run.
		
		InverseTicTacToe display = new InverseTicTacToe();
		
	}
	
}

