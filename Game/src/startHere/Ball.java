package startHere;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	private double x = 375, y = 20;
	private double dx= 0, dy=0, dt =0.2;
	private int radius = 20;
	private int gravity = 5;
	private double energyloss = 0.7;
	private double gameDy = -20;
	private String color = "CYAN";
	
	// look for what is passed in
	public Ball(int i, int j) {
		x = i;
		y = j;
	}
	
	public Ball() {}
	

	public void update(StartHere sh) {
		if(x + dx >= sh.getWidth() - radius || x + dx <= 0 + radius) {
			dx = -dx;
		}else{
			x = x + dx;
			if(dx > 20 ) {
				dx = 20;
			}
			if(dx < -20 ) {
				dx = -20;
			}
		}
	
		if(y + dy >= sh.getHeight() - radius) {
			dy *= energyloss;
			dx *= energyloss;
			dy = gameDy + -dy * 0.1;
		}else{
			dy += gravity*dt; // v = at
			y += dy + 0.5 * gravity *dt*dt -1; // s = 0.5a *t2 
		}
	
	}
	public void paint(Graphics g) {
		g.setColor(Color.getColor(color));
		g.fillOval((int)x - radius, (int)y - radius, radius*2, radius*2);
	}
	
	// KEYBOARD INTERACTION
	public void moveRight() {
		if(dx < 20 ) {
			dx += 1;
		}
	}
	
	public void moveLeft() {
		if(dx < 20) {
			dx -= 1;
		}
	}
	
	public void slowDown() {
		dx *= 0.8;
	}
	
	public void jump() {
		dy = 20;
	}
	
	//Getters and setters
	public int getX() {
		return (int)x;
	}
	public int getY() {
		return (int) y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setDy(double dy) {
		this.dy = dy;
	}
	public double getDy() {
		return dy;
	}
	public int getRadius() {
		return radius;
	}
	public double getGameDy() {
		return gameDy;
	}
	public void setGameDy(double gameDy) {
		this.gameDy = gameDy;
	}
	
	
}
