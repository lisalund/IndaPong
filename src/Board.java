
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;

/**
 * The class where the game itself is run
 * and where most of the game logics are held.
 * @author Lisa Lund & Anton Öbom
 * @version 2014-05-15
 */
@SuppressWarnings("serial")
public class Board extends JPanel implements Commons{

	private Timer timer;
	private Ball ball;
	private Paddle p1;
	private Paddle p2;
	private Integer p1Score; //player 1's score
	private Integer p2Score; //and player 2's score
	private final static double BALLSPEED = 3;
	private int paddlePart;
	

	/**
	 * Constructor for the PongPanel class
	 * Sets the background color, adds the ball,
	 * creates the paddles and initiates score
	 */
	public Board(){
		addKeyListener(new Adapter());
		setFocusable(true);
		setBackground(Color.BLACK);
		this.ball = new Ball(BALLSPEED);
		this.p1 = new Paddle(KeyEvent.VK_UP, KeyEvent.VK_DOWN, (getXMax() - PADDLEPADDING - 16));
		this.p2 = new Paddle(KeyEvent.VK_W, KeyEvent.VK_S, (getXMin() + PADDLEPADDING));
		this.paddlePart = (p1.getWidth()/3);
		this.p1Score = 0;
		this.p2Score = 0;
		
		timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 1000, 10);
		
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
		g.setFont(new Font("ArcadeClassic", Font.PLAIN, 37)); //länk till fonten: http://www.dafont.com/arcade-classic-pizz.font
		g.drawRect(rectangleX, rectangleY, fieldWidth, fieldHeight);
		
		//draw a line down the middle of the playing field
		g.drawLine(rectangleX + (fieldWidth/2), rectangleY, rectangleX + 
				(fieldWidth/2), rectangleY + fieldHeight);
		
		//draw the ball, paddles and scores
		g.drawImage(ball.getImage(), ball.getX(), ball.getY(), 
				ball.getHeight(), ball.getWidth(), this);
		g.drawImage(p1.getImage(), p1.getX(), p1.getY(), p1.getHeight(),
				p1.getWidth(), this);
		g.drawImage(p2.getImage(), p2.getX(), p2.getY(), p2.getHeight(),
				p2.getWidth(), this);
		g.drawString(p1Score.toString(), getXMax() - 20, getYMin() - 10);
		g.drawString(p2Score.toString(), getXMin() + 10, getYMin() - 10);
		
		Toolkit.getDefaultToolkit().sync();
		g.dispose();
	}

	/**
	 * Creates an adapter so that a KeyAdapter in this class
	 * can control the paddles
	 * @author Lisa Lund
	 *
	 */
	private class Adapter extends KeyAdapter{
		
		/**
		 * Checks if the key pressed belongs to p1 or p2 and acts accordingly
		 */
		public void keyPressed(KeyEvent e){
			int key = e.getKeyCode();
			
			if(key == p1.getUp() || key == p1.getDown()){
				p1.keyPressed(e);
			}
			
			if(key == p2.getUp() || key == p2.getDown()){
				p2.keyPressed(e);
			}
		}
		
		/**
		 * Checks if the key released belongs to p1 or p2 and acts accordingly
		 */
		public void keyReleased(KeyEvent e){
			int key = e.getKeyCode();
			
			if (key == p1.getUp() || key == p1.getDown()){
				p1.keyReleased(e);
			}
			
			if (key == p2.getUp() || key == p2.getDown()){
				p2.keyReleased(e);
			}
		}

	}
	
	/**
	 * Checks if any player has scored. If they have increments points
	 * and resets the ball.
	 */
	public void score(){
		if(ball.x <= getXMin()){ //p1 scored
			p1Score++;
			ball.reset();
		}
		if(ball.x >= getXMax() - ball.getWidth()){ //p2 scored.
			p2Score++;
			ball.reset();	
		}
	}
	
	/**
	 * Checks if the ball touches a paddle.
	 */
	public void checkInteraction() {
		if ((ball.getRect()).intersects(p1.getRect())) {
			int pointOfInteraction = (ball.getY() + (ball.getHeight()/2) - p1.getY());
			if(pointOfInteraction < 0){
				ball.topBounce();
			}
			else if(pointOfInteraction > p1.getWidth()){
				ball.lowBounce();
			}
			else if (pointOfInteraction < paddlePart) {
				ball.topBounce();
			} else if (pointOfInteraction >= (paddlePart * 2)) {
				ball.lowBounce();
			} else {
				ball.middleBounce();
			}
			
		} else if ((ball.getRect()).intersects(p2.getRect())) {
			int pointOfInteraction = (ball.getY() + (ball.getWidth()/2) - p2.getY());
			if(pointOfInteraction < 0){
				ball.topBounce();
			}
			else if(pointOfInteraction > p2.getWidth()){
				ball.lowBounce();
			}
			else if (pointOfInteraction < paddlePart) {
				ball.topBounce();
			} else if (pointOfInteraction >= (paddlePart * 2)) {
				ball.lowBounce();
			} else {
				ball.middleBounce();
			}
		}
	}
	
	
	/**
	 * Creates a task to be performed every set interval.
	 * @author Lisa Lund
	 *
	 */
	private class Task extends TimerTask {

		@Override
		public void run() {
			ball.step();
			p1.move();
			p2.move();
			checkInteraction();
			score();
			repaint();
			
		}
		
	}
		
}