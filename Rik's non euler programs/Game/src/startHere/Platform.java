package startHere;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Platform {
	private int dx;
	private int x, y;
	
	private int height = 40;
	private int width = 125;
	
	private Random r = new Random();
	
	public Platform() {
		x = 300;
		y = 500;
	}
	
	public Platform(int i, int j) {
		x = i;
		y = j;
		dx = -2;
	}
	
	public void update(StartHere sh, Ball b) {
		x+= dx;
		checkCollision(b);
		if(x < 0 - width) {
			x = sh.getWidth() + r.nextInt(400) ;
			y += r.nextInt(150) - 75;
			if(y >= sh.getHeight() - 40) {
				 y -= 40;
			}
		}
		
		
	}
	
	private void checkCollision(Ball b) {
		int ballX = b.getX();
		int ballY = b.getY();
		double ballDy = b.getDy();
		int radius = b.getRadius();
		
		if(ballY + radius >= y && ballY + radius < y + width) {
			if(ballX >= x && ballX <= x + width) {
				if(ballDy < 0) {
				}else{
				double newDy = b.getGameDy();
				b.setY(y- radius);
				b.setDy(newDy);
				}
			}	
		}
	
		
		//System.out.println(ballX + ", " + ballY);
		
	}
	
	
	public void paint(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(x, y, width, height);
	}
	

}

