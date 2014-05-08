import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Pong implements KeyListener{
	private static final int WIDTH = 800; //the width of the window
	private static final int HEIGHT = 600; //the height of the window
<<<<<<< HEAD

	private static int playerOneScore = 0;
	private static int playerTwoScore = 0;

=======
	private Ball ball = new Ball();
<<<<<<< HEAD
	private static Paddle p1; //the right player
	private static Paddle p2; //the left player
=======
>>>>>>> FETCH_HEAD
>>>>>>> 824e9dcebde3faa8622280a3e872774d25f79f8a
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Pong");
		PongPanel pongPanel = new PongPanel();
				
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
		
	}

	/**
	 * Listens for when a key is released
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Listens to a single pressed key on the keyboard
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public int getP1Score() {
		return playerOneScore;
	}

	public int getP2Score() {
		return playerTwoScore;
	}
	

}
