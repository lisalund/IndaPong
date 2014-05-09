import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Pong implements KeyListener{
	private static final int WIDTH = 800; //the width of the window
	private static final int HEIGHT = 600; //the height of the window


	private static int playerOneScore = 0;
	private static int playerTwoScore = 0;

	private Ball ball = new Ball();

	private static Paddle p1; //the right player
	private static Paddle p2; //the left player

	public static void main(String[] args) {
		new Pong();
	}

	/**
	 * Creates a new Pong game
	 */
	public Pong() {
		
		JFrame window = new JFrame("Pong");
		Board pongPanel = new Board();
				
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new BorderLayout());
		window.add(pongPanel, BorderLayout.CENTER);
		
		//måla upp fönstret lämplig storlek c:
		window.setSize(WIDTH, HEIGHT);
		window.setVisible(true);
		//actionlistener p1 och p2
		
		p1 = new Paddle(20, 60, 100, 100); //bara lite testvärden för att se att de ritas upp...
		p2 = new Paddle(20, 60, 250, 200);

	}

	/**
	 * Listens for when a key is held down
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyCode();
		
	}

	/**
	 * Listens for when a key is released
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		// Nothing happens when a key isn't being pressed
		
	}

	/**
	 * Listens to a single pressed key on the keyboard
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_UP){ //down arrow key
			p1.moveUp();
		}
		if (key == KeyEvent.VK_DOWN){ //up arrow key
			p1.moveDown();
		}
		if (key == KeyEvent.VK_W){ //w key
			p2.moveUp();
		}
		if (key == KeyEvent.VK_S){ //s keys
			p2.moveDown();
		}
	}

	public int getP1Score() {
		return playerOneScore;
	}

	public int getP2Score() {
		return playerTwoScore;
	}
	

}
