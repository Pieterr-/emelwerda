package startHere;


import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Platform {
	private static int dx;
	private int x, y;
	
	private static int height = 40;
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
			y = yRandomHeight(sh);
		}
	}
		
		
	
	private void checkCollision(Ball b) {
		int ballX = b.getX();
		int ballY = b.getY();
		double ballDy = b.getDy();
		int radius = b.getRadius();
		
		if(ballY + radius >= y && ballY + radius < y + width *0.5) {
			if(ballX >= x && ballX <= x + width) {
				if(ballDy < 0) {
				}else{
				double newDy = b.getGameDy();
				b.setY(y- radius);
				b.setDy(newDy);
				Ball.bouncecount++;
				System.out.println(Ball.bouncecount+ "th bounce");
				}
			}	
		}
	}
		
	
	public void paint(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(x, y, width, height);

	}
	
	public static int yRandomHeight(StartHere sh) {
		Random r = new Random ();
		int i;
		
		if(Ball.bouncecount < 50) {
			i = r.nextInt(2);
			i += 2;
		} else if(Ball.bouncecount < 100) {
			i = r.nextInt(3);
			i += 2;
			dx = -3;
		} else if(Ball.bouncecount < 150) {
			i = r.nextInt(4);
			i += 1;
			dx = -4;
		} else if(Ball.bouncecount < 200) {
			i = r.nextInt(5);
			i += 1;
		} else if(Ball.bouncecount < 250) {
			i = r.nextInt(6);
		} else{
			i = r.nextInt(7);
		} 
		
		
			if(i == 0) {
				return sh.getHeight() - 45;
			}else if(i == 1) {
				return sh.getHeight() - 90;
			}else if(i == 2) {
				return sh.getHeight() - 135;
			}else if(i == 3) {
				return sh.getHeight() - 180;
			}else if(i == 4) {
				return sh.getHeight() - 225;
			}else if(i == 5) {
				return sh.getHeight() - 270;
			}else{
				return sh.getHeight() - 315;
			}
		
		
		}
	
}

