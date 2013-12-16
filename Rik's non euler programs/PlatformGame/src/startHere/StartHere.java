package startHere;


import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.util.Random;


@SuppressWarnings("serial")
public class StartHere extends Applet implements Runnable, KeyListener{
	Image i, city, platformbrick;
	Graphics grap;
	URL url;
	
	int width = 800;
	int height = 600;
	
	Ball b1 = new Ball();
	Platform p[] = new Platform[8];
	
	@Override
	public void init() {
		setSize(width, height);
		addKeyListener(this);
		
		try{
			url = getDocumentBase();
		}catch(Exception e) {
		}
		
		city = getImage(url, "images/city3.png");
		platformbrick = getImage(url, "images/platformbrick.png");
	}
	
	@Override
	public void start() {
		for(int i = 0; i < p.length; i++) {
			Random r = new Random();
			p[i] = new Platform((getWidth() + 200*i), Platform.yRandomHeight(this));
		}
		
		Thread thread = new Thread(this);
		thread.start();
	}
	
	@Override
	public void run() {
		while(true) {
			for(int i = 0; i < p.length; i++) {
				p[i].update(this, b1);
			}
			b1.update(this);
			
			repaint();
			try {
				Thread.sleep(17);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	// DOUBLE BUFFER
		public void update(Graphics g) {
			if(i == null) {
				i = createImage(this.getSize().width, this.getSize().height);
				grap = i.getGraphics();
			}
			
			grap.setColor(getBackground());
			grap.fillRect(0, 0, this.getSize().width, this.getSize().height);
			
			grap.setColor(getForeground());
			paint(grap);
					
			g.drawImage(i, 0, 0, this);
		}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void paint(Graphics g) {
		g.fillRect(0, 0, getWidth(), getHeight());
		g.drawImage(city, 0, 0, this);
		b1.paint(g);
		
		for(int i = 0; i < p.length; i++) {
			p[i].paint(g);
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				b1.moveLeft();
				System.out.println("Left is pressed");
				break;
			case KeyEvent.VK_RIGHT:
				b1.moveRight();
				System.out.println("Right is pressed");
				break;
			case KeyEvent.VK_DOWN:
				b1.slowDown();
				System.out.println("Down is pressed");
				break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
