import java.awt.*;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class PongPanel extends JPanel{

	/**
	 * constructs the panel for the pong game
	 * 
	 */
	public PongPanel (){
		JPanel pongPanel = new JPanel();
		//pongPanel.setBackground(Color.cyan);
	}
	
	/**
	 * Sets a background to the PongPanel
	 * @param c The desired colour
	 */
	public void paintBackground(PongPanel p, Color c){
		p.setBackground(c);
	}
	
	/**
	 * Sets a border to the PongPanel
	 * 
	 * @param p The pongPanel to receive the border
	 * @param w The width of the border
	 * @param c The colour of the border
	 */
	public void setBorder(PongPanel p, int w, Color c){
		p.setBorder(new LineBorder(c, w));
	}
	
	public void paintComponent(Graphics g){
		g.drawRect(0, 0, 600, 400);
	}

	
}
