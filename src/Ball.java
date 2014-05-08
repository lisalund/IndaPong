/**
 * the class for the ball in a pong game
 * @author lisa
 *
 */
public class Ball {
	static final int ballDiameter = 10;
	static int ballX;
	static int ballY;
	static int ballSpeedX = 10;
	static int ballSpeedY = 10;
	
	/**
	 * Creates a new ball
	 * according to standard
	 * numbers.
	 */
	public void ball(int paneWidth, int paneHeigth) {
		ballX = paneWidth/2;
		ballY = paneHeigth/2;
	}
	
	public void move() {

	}

}
