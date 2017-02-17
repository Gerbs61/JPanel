import java.awt.Color;
import java. awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsDude extends Canvas
{ 

	public static void main(String[] args)
		{
  			GraphicsDude canvas = new GraphicsDude();
	        JFrame frame = new JFrame();
	        frame.setSize(600, 600);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.black);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    	}
	public void paint(Graphics graphics) 
	{
	 graphics.setColor(Color.white);
	 graphics.fillRect(47, 247, 500, 100);
	}
}


