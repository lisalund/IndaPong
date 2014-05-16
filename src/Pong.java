import java.awt.*;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 * The main class of the Pong game.
 * Creates the window and initiates the game.
 * @author Lisa Lund
 * @version 2014-05-10
 *
 */
public class Pong implements Commons{

	public static void main(String[] args) {
		new Pong();
	}

	/**
	 * Creates a new Pong game
	 */
	public Pong() {
		
		JFrame window = new JFrame("Pong");
		Board board = new Board();
				
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new BorderLayout());
		window.add(board, BorderLayout.CENTER);
		
		window.setSize(WIDTH, HEIGHT);
		window.setVisible(true);

	}

}