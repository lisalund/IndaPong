
import java.awt.Color;
import java.awt.Graphics;

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
	 * Paints the rectangle that limits the playing area
	 * this rectangle is 100 px shorter and narrower than the main window.
	 */
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.drawRect(70, 75, 650, 450);
	}
	
}