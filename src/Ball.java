
import java.util.Random;
import javax.swing.ImageIcon;


/**
 * The class for the ball in a 
 * game of pong
 * @author Anton Öbom & Lisa Lund
 * @version 2014-05-15
 */
public class Ball extends Sprite implements Commons {

	private double deltaX;
	private double deltaY;
	private double speed;
	protected String ball = "images/sushi1.png";
	
	/**
	 * Creates a new ball according to 
	 * standard numbers.
	 */
	public Ball(double speed) {		
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
			setDeltaX(-speed);
		}

		boolean directionY = rn.nextBoolean();
		if (directionY) {
			setDeltaY(-speed);
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
			setDeltaY(deltaY = speed);
		} 

		if (y >= rectangleY + fieldHeight - image.getHeight(null)) {
			setDeltaY(deltaY = -speed);
		}

		if (x == rectangleX) { 
			setDeltaX(deltaX = speed);
		}
		
		if(x == rectangleX + fieldWidth - image.getWidth(null)){
			setDeltaX(deltaX = -speed);
		}
	}

	public void setDeltaX(double newSpeed) {
		deltaX = newSpeed;
	}

	public void setDeltaY(double newSpeed) {
		deltaY = newSpeed;
	}
	
	public void invertSpeed(){

		setDeltaX(deltaX *= -1);
		setDeltaY(deltaY *= -1); 
	}
	
	public void topBounce(){
		if(Math.abs(deltaX) > speed){ //if it had a middle bounce before
			setDeltaX((deltaX /= -3)*2);
			setDeltaY(-speed);
		}
		else{
		setDeltaX(deltaX *= -1);
		setDeltaY(-speed);
		}
	}
	
	public void middleBounce(){
		if(Math.abs(deltaX) > speed){
			setDeltaX(deltaX *= -1);
			setDeltaY(0);
		}
		else{
		setDeltaX(deltaX *= -1.5);
		setDeltaY(0);
		}
	}
	
	public void lowBounce(){
		if(Math.abs(deltaX) > speed){ //if it had a middle bounce before
			setDeltaX((deltaX /= -3)*2);
			setDeltaY(speed);
		}
		else{
		setDeltaX(deltaX *= -1);
		setDeltaY(speed);
		}
	}
}
