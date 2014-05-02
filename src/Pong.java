import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Pong implements KeyListener{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("Pong");
		PongPanel pongPanel = new PongPanel();
		pongPanel.paintBackground(pongPanel, Color.RED);
		pongPanel.setBorder(pongPanel, 7, Color.CYAN);
		
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(pongPanel);
		
		//måla upp fönstret lämplig storlek c:
		window.setSize(800, 600);
		window.setVisible(true);
		//actionlistener p1 och p2

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

}
