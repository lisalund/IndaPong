/**
 * Class for the paddles in a Pong game
 * @author lisa
 *
 */
public class Paddle {
	static int maxHeigth = 0;
	static final int paddleHeigth = 40;
	static final int paddleWidth = 6;
	static int locationX = 0;
	static int locationY;
	
	/**
	 * Creates a new paddle.
	 * @param boxHeigth
	 * @param boxWidth
	 * @param xCoord
	 * @param yCoord
	 */
	public Paddle(int paneHeigth, int paneWidth, int xCoord, int yCoord) {
		maxHeigth = paneHeigth;
		if (xCoord > 0 + paddleWidth/2 || xCoord <= paneWidth - paddleWidth/2) {
			locationX = xCoord;
		} else {
			// TODO : throw exception
		} if (yCoord > 0 + paddleHeigth/2 || yCoord <= paneHeigth - paddleHeigth/2) {
			locationY = yCoord;
		} else {
			// TODO: throw exception
		}
	}
	
	public void moveUp() {
		// Check if possible
		if (locationY > paddleHeigth/2) {
			locationY--;
		} // Do nothing otherwise
	}
	
	public void moveDown() {
		//Check if possible
		if (locationY < maxHeigth - paddleHeigth/2) {
			locationY++;
		} // Do nothing otherwise
	}

	public int getPaddleY() {
		return location
	}

}
