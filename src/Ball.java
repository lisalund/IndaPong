import java.util.Random;

/**
 * the class for the ball in a pong game
 * @author lisa
 *
 */
public class Ball {
	static final int ballDiameter = 10;
	static int ballX;
	static int ballY;
	static int ballSpeedX;
	static int ballSpeedY;
	
	/**
	 * Creates a new ball
	 * according to standard
	 * numbers.
	 */
	public void ball(int paneWidth, int paneHeigth) {
		ballX = paneWidth/2;
		ballY = paneHeigth/2;
		Random rn = new Random();
		ballSpeedX = rn.nextInt(10)+1;
		if (ballSpeedX > 5) {
			ballSpeedX = 5 - ballSpeedX;
		}
		ballSpeedY = rn.nextInt(10)+1;
		if (ballSpeedY > 5) {
			ballSpeedY = 5 - ballSpeedY;
		}
	}
	
	/**
	 * Checks if the ball interacts
	 * with the walls, the paddles
	 * or enters a player's zone.
	 */
//	public void ifInteract() {
//		if (ballY == getYMin()) {
//			ballSpeedY = -ballSpeedY;
//		} 

//		if (ballY == getYMax()) {
//			ballSpeedY = -ballSpeedY;
//		}

//		if (ballX == getPaddleX || ballX == paneWidth - getPaddleX) {
//			if 
//		}


//	}

	public void reset() {

	}

}
