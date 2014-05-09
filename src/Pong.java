import java.awt.*;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Pong{
	private static final int WIDTH = 800; //the width of the window
	private static final int HEIGHT = 600; //the height of the window


	//private static int playerOneScore = 0;
	//private static int playerTwoScore = 0;

	//private Ball ball = new Ball();

	//private static Paddle p1; //the right player TODO: lägg till i board?
	//private static Paddle p2; //the left player  TODO: se ovan.

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
		//actionlistener p1 och p2
		
		//p1 = new Paddle(20, 60, 100, 100); //bara lite testvärden för att se att de ritas upp... I board...?
		//p2 = new Paddle(20, 60, 250, 200); //TODO: ändra så att det stämmer med konstruktorn efter paddle klassen är klar

	}

//	/**
//	 * Listens for when a key is held down
//	 */
//	@Override
//	public void keyPressed(KeyEvent e) {
//		// TODO till Paddle
//		int key = e.getKeyCode();
//		
//	}
//
//	/**
//	 * Listens for when a key is released
//	 */
//	@Override
//	public void keyReleased(KeyEvent e) {
//		// Nothing happens when a key isn't being pressed
//		//TODO: till paddle
//		
//	}

//	/**
//	 * Listens to a single pressed key on the keyboard
//	 */
//	@Override
//	public void keyTyped(KeyEvent e) {
//		//TODO: till Paddle
//		int key = e.getKeyCode();
//		
//		if (key == KeyEvent.VK_UP){ //down arrow key
//			p1.moveUp();
//		}
//		if (key == KeyEvent.VK_DOWN){ //up arrow key
//			p1.moveDown();
//		}
//		if (key == KeyEvent.VK_W){ //w key
//			p2.moveUp();
//		}
//		if (key == KeyEvent.VK_S){ //s keys
//			p2.moveDown();
//		}
//	}

//	public int getP1Score() {
//		return playerOneScore;
//	}

//	public int getP2Score() {
//		return playerTwoScore;
//	}
	

}
