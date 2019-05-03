import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;


public class Triangle extends JPanel implements ActionListener{

	int x,y,x1,y1,x2,y2,x3,y3;
	int rnd;

	Random random = new Random();
	Timer timer = new Timer(2,this);
	public Triangle(){
		timer.start();	
		x = random.nextInt(1720);
		y = random.nextInt(940);
		x1 = random.nextInt(1720);
		y1 = random.nextInt(940);
		x2 = random.nextInt(1720);
		y2 = random.nextInt(940);
		x3 = random.nextInt(1720);
		y3 = random.nextInt(940);
		setFocusable(true);
	}
	
	public void paint(Graphics g){
//	  super.paint(g);

		g.fillOval(x,y,3,3);
		g.setColor(Color.black);
		g.fillOval(x1,y1,5,5);
		g.fillOval(x2,y2,5,5);
		g.fillOval(x3,y3,5,5);
		
		g.setColor(Color.red);
		rnd = random.nextInt(3);
		
		if(rnd == 0){
			g.setColor(Color.red);
			x = (x+x1)/2;
			y = (y+y1)/2;
			g.fillOval(x,y,2,2);
		}
		if(rnd == 1){
			g.setColor(Color.green);
			x = (x+x2)/2;
		    y = (y+y2)/2;
		    g.fillOval(x,y,2,2);
		}
		if(rnd == 2){
			g.setColor(Color.blue);
			x = (x+x3)/2;
		    y = (y+y3)/2;
		    g.fillOval(x,y,2,2);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();
		
	}

	
}
