package Pong;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 * The class for the ball in a 
 * game of pong
 * @author Lisa Lund & Anton Obom 
 */
public class Ball extends Sprite implements Commons { //vars är Sprite? 

	private int deltaX;
	private int deltaY;
	protected String ball = "../images/sushi1.png";
	
	/**
	 * Creates a new ball according to 
	 * standard numbers.
	 */
	public Ball() {		
		ImageIcon icon = new ImageIcon(this.getClass().getResource(ball));
		image = icon.getImage(); //vad är image för typ?

		int width = image.getWidth(null);  //lade till int innan width och height, och detta kanske borde vara ett fält?
		int heigth = image.getHeigth(null);

		reset();
	}

	/**
	 * Resets a ball's position to the 
	 * middle and gives it a random moving
	 * direction.
	 */
	public void reset() {
		x = rectangleX + fieldWidth/2 - width/2; //width och height måste vara fält för att kunna kallas
		y = rectangleY + fieldHeigth/2 - heigth/2; //troligtvis måste x och y också vara fält för att detta ska kompilera...

		deltaX = 1;
		deltaY = 1;

		Random rn = new Random();

		boolean directionX = rn.nextBoolean();
		if (direction) {
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

		if (y == rectangleY + fieldHeigth) {
			setBallSpeedY(-1);
		}

		if (ballX == getPaddleX || ballX == paneWidth - getPaddleX) { //wat.
			if //wat
		}
	}

	public void setBallSpeedX(int newSpeed) {
		deltaX = newSpeed;
	}

	public void setBallSpeedY(int newSpeed) {
		deltaY = newSpeed;
	}
}
