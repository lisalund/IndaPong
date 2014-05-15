
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 * Class for the paddles in a Pong game.
 * @author Anton Öbom
 * @version 2014-05-15
 */
public class Paddle extends Sprite implements Commons {

	private int deltaPaddle;
	private int up;
	private int down;
	String paddle = "images/paddle.png";
	
	/**
	 * Creates a new paddle.
	 */
	public Paddle(int keyCodeUp, int keyCodeDown, int location) {
		//ImageIcon icon = new ImageIcon(this.getClass().getResource(paddle));
		ImageIcon icon = new ImageIcon(paddle);

		image = icon.getImage(); 

		up = keyCodeUp;
		down = keyCodeDown;
		
		// Don't know why this works
		height = image.getWidth(null);
		width = image.getHeight(null); 

		x = location;

		reset();
	}

	public void reset() { 
		y = rectangleY + fieldHeight/2; 
	}
	
	public void move() {
		// Check if paddle is too close to edges
		// for a normal move
		if (deltaPaddle < 0) {
			if (y + deltaPaddle < rectangleY) {
				return;
			// If there is less than deltaPaddle to edge
			} else if ((deltaPaddle * -1) > y - rectangleY) {
				y = rectangleY;
			}
		} else { // When deltaPaddle is positive
			if ((y + deltaPaddle + width) > rectangleY + fieldHeight) {
				return;
			// If there is less than deltaPaddle to edge
			} else if (deltaPaddle + width > ((rectangleY + fieldHeight) - y)) {
				y = (rectangleY + fieldHeight - width);
			} 
		}
		
		// If paddle isn't too close to edges
		// for a normal move
		y += deltaPaddle;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == up) {
			deltaPaddle = -6;
		} else if (key == down) {
			deltaPaddle = 6;
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
	
	public int getUp(){
		return up;
	}
	
	public int getDown(){
		return down;
	}
	

}