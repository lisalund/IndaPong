
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import javax.swing.JPanel;

public class PongPanel extends JPanel{
	
	/**
	 * Constructor for the PongPanel class
	 * Sets the background color
	 */
	public PongPanel(){
		setBackground(Color.BLACK);
	}
	
	/**
	 * Paints the rectangle that limits the playing area and the dotted line
	 * that separates the two halves.
	 * the rectangle is 100 px shorter and narrower than the main window.
	 */
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.drawRect(70, 75, 650, 450);
		
		paintLine(g, ((70+650)/2), );
		
	}
	
	/**
	 * Creates a dotted line from point x to point y.
	 */
	public void paintLine(Graphics g, int x, int y){
		
	}
	
}