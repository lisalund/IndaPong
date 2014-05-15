
import java.util.Random;
import javax.swing.ImageIcon;

/**
 * The class for the ball in a 
 * game of pong
 * @author Anton Obom & Lisa Lund
 */
public class Ball extends Sprite implements Commons {

	private int deltaX;
	private int deltaY;
	private int speed;
	protected String ball = "images/sushi1.png";
	
	/**
	 * Creates a new ball according to 
	 * standard numbers.
	 */
	public Ball(int speed) {		
//		ImageIcon icon = new ImageIcon(this.getClass().getResource(ball));
		ImageIcon icon = new ImageIcon(ball);

		image = icon.getImage(); 
		

		width = image.getWidth(null); 
		height = image.getHeight(null);
		this.speed = speed;

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
		deltaX = speed;
		deltaY = speed;

		Random rn = new Random();

		boolean directionX = rn.nextBoolean();
		if (directionX) {
			setBallSpeedX(-speed);
		}

		boolean directionY = rn.nextBoolean();
		if (directionY) {
			setBallSpeedY(-speed);
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

		if (y <= rectangleY) {
			setBallSpeedY(deltaY = speed);
		} 

		if (y >= rectangleY + fieldHeight - image.getHeight(null)) {
			setBallSpeedY(deltaY = -speed);
		}

		if (x == rectangleX) { 
			setBallSpeedX(deltaX = speed);
		}
		
		if(x == rectangleX + fieldWidth - image.getWidth(null)){
			setBallSpeedX(deltaX = -speed);
		}
	}

	public void setBallSpeedX(int newSpeed) {
		deltaX = newSpeed;
	}

	public void setBallSpeedY(int newSpeed) {
		deltaY = newSpeed;
	}
	
	public void invertSpeed(){

		setBallSpeedX(deltaX *= -1);
		setBallSpeedY(deltaY *= -1); 
	}
}
