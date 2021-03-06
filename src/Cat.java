import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Cat {
	// drawing constants are private - noone needs to know what we're doing
	// pick a head dimension
	private static final int HEAD_DIMENSION = 100;
	// eyes will be about 1/4 from top of head and 1/4 from left
	private static final int EYE_Y = HEAD_DIMENSION/4;
	private static final int EYE_X = HEAD_DIMENSION/4;
	private static final int EYE_SEPARATION = HEAD_DIMENSION/3;
	// pick eye dimensions
	private static final int EYE_HEIGHT = 20;
	private static final int EYE_WIDTH = 10;
	// pick mouth height, width is based on head dimension
	private static final int MOUTH_HEIGHT = 10;
	private static final int MOUTH_WIDTH = HEAD_DIMENSION/4;
	// mouth starts about 40% from left edge of head
	private static final int MOUTH_X = HEAD_DIMENSION/5 * 2;
	private static final int MOUTH_Y = HEAD_DIMENSION/5 * 3;
	// ears will at top of head.
	private static final int EAR_SEPARATION = HEAD_DIMENSION - HEAD_DIMENSION/3;
	private static final int EAR_HEIGHT = 30;
	private static final int EAR_WIDTH = 30;
	// pupils 
	private static final int PUPIL_Y = HEAD_DIMENSION/4;
	private static final int PUPIL_X = HEAD_DIMENSION/4;
	private static final int PUPIL_SEPARATION = HEAD_DIMENSION/3;
	private static final int PUPIL_HEIGHT = 8;
	private static final int PUPIL_WIDTH = 8;
	//sun
	private static final int SUN_DISTANCE_X = 100;
	private static final int SUN_DIAMETER = 100;
	// cloud obscuring part of the sun
	private static final int CLOUD_HEIGHT = 30;
	private static final int CLOUD_WIDTH = 110;
	private static final int CLOUD_DISTANCE = 50;
	
	// draw will render the Cat on the Graphics object
	public void draw(Graphics g, int catX, int catY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=catX;
		int y=catY;
		// Draw the head
		g2.setColor(Color.black);
		g2.fillOval(x, y, HEAD_DIMENSION, HEAD_DIMENSION);
		// Draw the eyes
		x = catX + EYE_X; 
		y = catY + EYE_Y;
		g2.setColor(Color.blue);
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		x += EYE_SEPARATION;
		g2.setColor(Color.ORANGE);
		g2.fillOval(x, y, EYE_WIDTH, EYE_HEIGHT);
		// Draw the pupils
		x = catX + PUPIL_X; 
		y = catY + PUPIL_Y;
		g2.setColor(Color.black);
		g2.fillOval(x, y, PUPIL_WIDTH, PUPIL_HEIGHT);
		x += PUPIL_SEPARATION;
		g2.setColor(Color.black);
		g2.fillOval(x, y, PUPIL_WIDTH, PUPIL_HEIGHT);
		// Draw the mouth
		g2.setColor(Color.pink);
		x = catX + MOUTH_X;
		y = catY + MOUTH_Y;
		g2.fillOval(x, y, MOUTH_WIDTH, MOUTH_HEIGHT);
		g2.setColor(Color.black);
		// Meow text appears below cat head, +10 places below 
		// so it doesn't overlap the drawing
		g2.drawString("I'm partway to being the GitHub Octocat!", catX, catY+HEAD_DIMENSION+20);
		// Draw the ears
		x = catX; 
		y = catY;
		g2.setColor(Color.black);
		g2.fillOval(x,y,EAR_WIDTH, EAR_HEIGHT);
		x += EAR_SEPARATION;
		g2.fillOval(x, y, EAR_WIDTH, EAR_HEIGHT);
		// Draw the sun
		x += SUN_DISTANCE_X;
		g2.setColor(Color.yellow);
		g2.fillOval(x, y, SUN_DIAMETER, SUN_DIAMETER);
		// Add a cloud covering the sun
		y += CLOUD_DISTANCE;
		g2.setColor(Color.gray);
		g2.fillOval(x, y, CLOUD_WIDTH, CLOUD_HEIGHT);
	}
}
