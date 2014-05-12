
import java.util.Random;
import javax.swing.ImageIcon;

/**
 * The class for the ball in a 
 * game of pong
 * @author Anton Obom 
 */
public class Ball extends Sprite implements Commons {

	private int deltaX;
	private int deltaY;
	protected String ball = "images/sushi1.png";
	
	/**
	 * Creates a new ball according to 
	 * standard numbers.
	 */
	public Ball() {		
//		ImageIcon icon = new ImageIcon(this.getClass().getResource(ball));
		ImageIcon icon = new ImageIcon(ball);

		image = icon.getImage(); 
		

		width = image.getWidth(null); 
		height = image.getHeight(null);

		reset();
	}

	/**
	 * Resets a ball's position to the 
	 * middle and gives it a random moving
	 * direction.
	 */
	public void reset() {
		x = rectangleX + fieldWidth/2 - width/2; 
		y = rectangleY + fieldHeight/2 - height/2; 
		deltaX = 1;
		deltaY = 1;

		Random rn = new Random();

		boolean directionX = rn.nextBoolean();
		if (directionX) {
			setBallSpeedX(-1);
		}

		boolean directionY = rn.nextBoolean();
		if (directionY) {
			setBallSpeedY(-1);
		}
	}
	
	/**
	 * Checks if the ball interacts
	 * with the walls, the paddles
	 * or enters a player's zone.
	 */
	public void step() {
		x += deltaX;
		y += deltaY;

		if (y == rectangleY) {
			setBallSpeedY(1);
		} 

		if (y == rectangleY + fieldHeight) {
			setBallSpeedY(-1);
		}

		//if (ballX == getPaddleX || ballX == paneWidth - getPaddleX) { 
			//if 
			
			//}
	}

	public void setBallSpeedX(int newSpeed) {
		deltaX = newSpeed;
	}

	public void setBallSpeedY(int newSpeed) {
		deltaY = newSpeed;
	}
}
