
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.util.Random;

import javax.swing.JPanel;

public class PongPanel extends JPanel{
	
	private final static int rectangleX = 70; //the playing field's x-position
	private final static int rectangleY = 75; //the playing field's y-position
	private final static int fieldWidth = 650; //the width of the playing field
	private final static int fieldHeight = 450; //the height of the playing filed

	static final int ballDiameter = 20;
	static int ballX;
	static int ballY;
	static int ballSpeedX;
	static int ballSpeedY;

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
//	
//	/**
//	 * draw the ball in the middle of the playingfield
//	 */
//	public void newBall(){
//		//create a new ball in the middle of the field
//		//g.fillOval(rectangleX + (fieldWidth/2) - ballDiameter/2, +
//			//rectangleY + (fieldHeight/2) - ballDiameter/2, ballDiameter, ballDiameter);
//		
//		ballX = fieldWidth/2;
//		ballY = fieldHeight/2;
//		Random rn = new Random();
//		ballSpeedX = rn.nextInt(10)+1;
//		if (ballSpeedX > 5) {
//			ballSpeedX = 5 - ballSpeedX;
//		}
//		ballSpeedY = rn.nextInt(10)+1;
//		if (ballSpeedY > 5) {
//			ballSpeedY = 5 - ballSpeedY;
//		}
//	}
	
		
}