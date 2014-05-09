package breakout;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 * Class for the paddles in a Pong game.
 * @author Lisa Lund & Anton Obom
 */
public class Paddle extends Sprite implements Commons {

	private int deltaPaddle;
	private int up;
	private int down;
	String paddle = "../images/paddle.png"
	
	/**
	 * Creates a new paddle.
	 */
	public Paddle(int keyCodeUp, int keyCodeDown, int location) {
		ImageIcon icon = new ImageIcon(this.getClass().getResource(paddle));
		image = icon.getImage();

		up = keyCodeUp;
		down = keyCodeDown;

		width = image.getWidth(null);
		heigth = image.getHeigth(null);

		x = location;

		reset();
	}

	public reset() {
		y = rectangleY + fieldHeigth/2; 
	}
	
	public void move() {
		// Check if paddle is too close to edges
		// for a normal move
		if (deltaPaddle < 0) {
			if (y + deltaPaddle < rectangleY) {
				return;
			// If there is less than deltaPaddle to edge
			} else if (deltaPaddle > y - rectangleY) {
				y = rectangleY;
			}
		} else {
			if (y + deltaPaddle > rectangleY + fieldHeigth) {
				return;
			// If there is less than deltaPaddle to edge
			} else if (deltaPaddle > ((rectangleY + fieldHeigth) - y))
				y = rectangleY + fieldHeigth;
			}
		}
		// If paddle isn't too close to edges
		// for a normal move
		y += deltaPaddle;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == up) {
			deltaPaddle = -2;
		} else if (key == down) {
			deltaPaddle = 2;
		}

	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == up) {
			deltaPaddle = 0;
		} else if (key == down) {
			deltaPaddle = 0;
		}
	}

}
