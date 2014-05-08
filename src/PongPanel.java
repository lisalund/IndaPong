
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import javax.swing.JPanel;

public class PongPanel extends JPanel{
	
	private final static int rectangleX = 70; //the playing field's x-position
	private final static int rectangleY = 75; //the playing field's y-position
	private final static int fieldWidth = 650; //the width of the playing field
	private final static int fieldHeight = 450; //the height of the playing filed
	/**
	 * Constructor for the PongPanel class
	 * Sets the background color
	 */
	public PongPanel(){
		setBackground(Color.BLACK);
	}
	
	/**
	 * returns the y-value for the top of the playing field
	 */
	public int getYMin(){
		return rectangleY;
	}
	
	/**
	 * returns the y-value  for the bottom of the playing field
	 */
	public int getYMax(){
		return rectangleY + fieldHeight;
	}
	
	/**
	 * returns the x-value for the left edge of the playing field
	 */
	public int getXMin(){
		return rectangleX;
	}
	
	/**
	 * returns the x-value for the right edge of the playing field
	 */
	public int getXMax(){
		return rectangleX + fieldWidth;
	}
	
	/**
	 * Paints the rectangle that limits the playing area and the dotted line
	 * that separates the two halves.
	 * the rectangle is 100 px shorter and narrower than the main window.
	 */
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.drawRect(rectangleX, rectangleY, fieldWidth, fieldHeight);
		
		//draw a line down the middle of the playing field
		g.drawLine(rectangleX + (fieldWidth/2), rectangleY, rectangleX + 
				(fieldWidth/2), rectangleY + fieldHeight);
		
	}
	
	
	
}