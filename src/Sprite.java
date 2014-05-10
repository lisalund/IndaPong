import java.awt.Image;

/**
 * A base class for Pong, where the images for
 * the ball and paddles are held and their variables can be set
 * @author Lusa Lund
 *
 */
public class Sprite {

	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected Image image;
	
	/**
	 * sets the x value
	 */
	public void setX(int newX){
		this.x = newX;
	}
	
	/**
	 * sets the y value
	 */
	public void setY(int newY){
		this.y = newY;
	}
	
	/**
	 * returns the x value
	 */
	public int getX(){
		return x;
	}
	
	/**
	 * returns the y value
	 */
	public int getY(){
		return y;
	}
	
	/**
	 * returns the width of the image
	 */
	public int getHeight(){
		return height;
	}
	
	/**
	 * returns the height of the image
	 */
	public int getWidth(){
		return width;
	}
	
	/**
	 * returns the sprite's image
	 */
	public Image getImage(){
		return image;
	}
}
