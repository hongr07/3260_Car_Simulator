package view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import controllers.ControlPanelController;
import view.ControlPanelView.ChangeType;

public class CarView extends JPanel implements ActionListener {

	public enum Direction {
	    North, South, East, West 
	}
	private int decreaseFuelRate = 5000; 
	private ControlPanelController controller;
	private Direction direction = Direction.North;
	private boolean engineOn = false, hasFuel = false, hasSpeed = false;
	Timer tm = new Timer(10, this);
	
	ActionListener decreaseFuelAction = new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
			controller.changeFuel(ChangeType.DOWN);
		}
	};
	Timer fuelTm = new Timer(decreaseFuelRate, decreaseFuelAction);
	
	public CarView() {
		
	}
	
	public CarView(ControlPanelController controller) {
		this.controller = controller;
	}
	
	//define values for vertical road line coordinates
	int x = 0, y = 20;
	int m = 60, s = 80; 
	int j = 110, b = 130;
	int p = 160, q = 180;
	int a = 220, c = 240;
	int k = 280, f = 300;
	int d = 340, h = 360;
	
	//define values for horizontal road line coordinates
	int x11 = 0, y11 = 20;
	int m11 = 60, s11 = 80; 
	int j11 = 110, b11 = 130;
	int p11 = 160, q11 = 180;
	int a11 = 220, c11 = 240;
	int k11 = 280, f11 = 300;
	int d11 = 340, h11 = 360;
	int x1 = 400, y1 = 420;
	int m1 = 460, s1 = 480; 
	int j1 = 520, b1 = 540;
	int p1 = 580, q1 = 600;
	int vel = 1;
	
	public void paint(Graphics g) {
		g.setColor(Color.green.darker());
		g.drawRect(0,0,685,383);
		g.fillRect(0,0,685,383);
		
		if(direction == Direction.North ||direction == Direction.South) {
			drawVerticalRoad(g);
		}
		else if(direction == Direction.East ||direction == Direction.West) {
			drawHorizontalRoad(g);
		}
		
	}
	
	
	public void drawVerticalRoad(Graphics g) {

		//Vertical road
		g.setColor(Color.gray);
		g.drawRect(285, 0, 90, 400);
		g.fillRect(285, 0, 90, 400);
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.white);
		
		//draw road lines for vertical road
		g2d.drawLine(330,x,330,y);
		g2d.drawLine(330,m,330,s);
		g2d.drawLine(330,j,330,b);
		g2d.drawLine(330,p,330,q);
		g2d.drawLine(330,a,330,c);
		g2d.drawLine(330,k,330,f);
		g2d.drawLine(330,d,330,h);
		
		// if engine is one, animate lines and start timer
		if (engineOn == true && hasFuel == true && hasSpeed == true) {
			tm.start();
			//check fuel
			fuelTm.start();
		} else if (engineOn == true && hasFuel) {
			fuelTm.start();
		} else {
			tm.stop();
			fuelTm.stop();
		}		
		
	      
		if(direction == Direction.North) {
			drawCarVerticalNorth(g);
		}
		else if(direction == Direction.South) {
			drawCarVerticalSouth(g);
		}
	}
		
	public void drawCarVerticalNorth(Graphics g) {
		//draw wheels
		g.setColor(Color.black);
		g.drawRect(305, 150, 55, 15);
		g.fillRect(305, 150, 55, 15);
		
		g.setColor(Color.black);
		g.drawRect(305, 210, 55, 15);
		g.fillRect(305, 210, 55, 15);
		//draw body
		g.setColor(Color.black);
		g.drawRect(310, 135, 45, 95);
		g.setColor(Color.blue);
		g.fillRect(310, 135, 45, 95);
		//draw top of car
		g.setColor(Color.black);
		g.drawRect(315, 150, 35, 30);
		g.setColor(Color.blue);
		g.fillRect(315, 150, 35, 30);
	}
	
	public void drawCarVerticalSouth(Graphics g) {
		//draw wheels
		g.setColor(Color.black);
		g.drawRect(305, 150, 55, 15);
		g.fillRect(305, 150, 55, 15);
		
		g.setColor(Color.black);
		g.drawRect(305, 210, 55, 15);
		g.fillRect(305, 210, 55, 15);
		//draw body
		g.setColor(Color.black);
		g.drawRect(310, 135, 45, 95);
		g.setColor(Color.blue);
		g.fillRect(310, 135, 45, 95);
		//draw top of car
		g.setColor(Color.black);
		g.drawRect(315, 185, 35, 30);
		g.setColor(Color.blue);
		g.fillRect(315, 185, 35, 30);
	}
	
	public void drawHorizontalRoad(Graphics g) {
		//Horizontal road
		g.setColor(Color.gray);
		g.drawRect(0, 140, 685, 90);
		g.fillRect(0, 140, 685, 90);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(Color.white);

		//draw road lines for horizontal road
		g2d.drawLine(x11,185,y11,185);
		g2d.drawLine(m11,185,s11,185);
		g2d.drawLine(j11,185,b11,185);
		g2d.drawLine(p11,185,q11,185);
		g2d.drawLine(a11,185,c11,185);
		g2d.drawLine(k11,185,f11,185);
		g2d.drawLine(d11,185,h11,185);
		g2d.drawLine(x1,185,y1,185);
		g2d.drawLine(m1,185,s1,185);
		g2d.drawLine(j1,185,b1,185);
		g2d.drawLine(p1,185,q1,185);
		
		//if engine is on, animate and start timer
		if (engineOn == true && hasFuel == true && hasSpeed == true) {
			tm.start();
			//check fuel
			fuelTm.start();
		} else if (engineOn == true && hasFuel) {
			fuelTm.start();
		} else {
			tm.stop();
			fuelTm.stop();
		}	

		
		if(direction == Direction.East) {
			drawCarHorizontalEast(g);
		}
		else if(direction == Direction.West) {
			drawCarHorizontalWest(g);
		}
	}
	
	public void drawCarHorizontalEast(Graphics g) {
		
		//draw wheels
		g.setColor(Color.black);
		g.drawOval(355, 195, 15, 15);
		g.fillOval(355, 195, 15, 15);
		
		g.setColor(Color.black);
		g.drawOval(310, 195, 15, 15);
		g.fillOval(310, 195, 15, 15);
		//draw top of car
		g.setColor(Color.black);
		g.drawRect(330, 145, 35, 25);
		g.setColor(Color.blue);
		g.fillRect(330, 145, 35, 25);
		//draw body
		g.setColor(Color.black);
		g.drawRect(300, 170, 80, 30);
		g.setColor(Color.blue);
		g.fillRect(300, 170, 80, 30);
		//draw window
		g.setColor(Color.black);
		g.drawRect(348, 150, 13, 13);
		g.setColor(Color.white);
		g.fillRect(348, 150, 13, 13);
		
	}
	
	public void drawCarHorizontalWest(Graphics g) {
		
		//draw wheels
		g.setColor(Color.black);
		g.drawOval(355, 195, 15, 15);
		g.fillOval(355, 195, 15, 15);
		
		g.setColor(Color.black);
		g.drawOval(310, 195, 15, 15);
		g.fillOval(310, 195, 15, 15);
		//draw top of car
		g.setColor(Color.black);
		g.drawRect(310, 145, 35, 25);
		g.setColor(Color.blue);
		g.fillRect(310, 145, 35, 25);
		//draw body
		g.setColor(Color.black);
		g.drawRect(300, 170, 80, 30);
		g.setColor(Color.blue);
		g.fillRect(300, 170, 80, 30);
		//draw window
		g.setColor(Color.black);
		g.drawRect(315, 150, 13, 13);
		g.setColor(Color.white);
		g.fillRect(315, 150, 13, 13);
		
	}
	
    public void setDirection(model.CarObject.Direction direction2) {
		switch (direction2) {
		case East:
			direction = Direction.East;
			break;
		case West:
			direction = Direction.West;
			break;
		case North:
			direction = Direction.North;
			break;
		case South:
			direction = Direction.South;
			break;
		default:
			break;
		}
		
	}

	public void setEngine(boolean eng) {
		if(eng == true) {
			engineOn = true;
		} else {
			engineOn = false;
		}
	}
	
	public void setFuel(float f) {
		if(f > 0) {
			hasFuel = true;
		} else {
			hasFuel = false;
		}
	}
	
	public void setSpeed(float f) {
		if(f > 0) {
			hasSpeed = true;
		} else {
			hasSpeed = false;
		}
	}
	
	public void incrementVelocity(float speed) {
		if(speed == 11) { incrementVelocityRate();}
		if(speed == 21) { incrementVelocityRate();}
		if(speed == 31) { incrementVelocityRate();}
		if(speed == 41) { incrementVelocityRate();}
		if(speed == 51) { incrementVelocityRate();}
		if(speed == 61) { incrementVelocityRate();}
		if(speed == 71) { incrementVelocityRate();}
		if(speed == 81) { incrementVelocityRate();}
		if(speed == 91) { incrementVelocityRate();}
		if(speed == 101) { incrementVelocityRate();}
		if(speed == 111) { incrementVelocityRate();}
	}
	private void incrementVelocityRate() {
		decreaseFuelRate = decreaseFuelRate - 250;
		vel+=1;
		fuelTm.setDelay(decreaseFuelRate);
	}
	
	public void decrementVelocity(float speed) {
		if(speed == 10) { decrementVelocityRate();}
		if(speed == 20) { decrementVelocityRate();}
		if(speed == 30) { decrementVelocityRate();}
		if(speed == 40) { decrementVelocityRate();}
		if(speed == 50) { decrementVelocityRate();}
		if(speed == 60) { decrementVelocityRate();}
		if(speed == 70) { decrementVelocityRate();}
		if(speed == 80) { decrementVelocityRate();}
		if(speed == 90) { decrementVelocityRate();}
		if(speed == 100) { decrementVelocityRate();}
		if(speed == 110) { decrementVelocityRate();}
	}
	
	private void decrementVelocityRate() {
		decreaseFuelRate = decreaseFuelRate + 250;
		vel-=1;
		fuelTm.setDelay(decreaseFuelRate);
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {

		if (direction == Direction.North) {
			//if line goes out of frame, reset to the top
			if (x < 0 || x > 400) {x = 0; y = 20;}
			if (j < 0 || j > 400) {j = 0; b = 20;}
			if (m < 0 || m > 400) {m = 0; s = 20;}
			if (p < 0 || p > 400) {p = 0; q = 20;}
			if (a < 0 || a > 400) {a = 0; c = 20;}
			if (k < 0 || k > 400) {k = 0; f = 20;}
			if (d < 0 || d > 400) {d = 0; h = 20;}
			//increase velocity of each coordinate so lines move down
			x = x + vel; y = y + vel;
			m = m + vel; s = s + vel;
			j = j + vel; b = b + vel;
			p = p + vel; q = q + vel;
			a = a + vel; c = c + vel;
			k = k + vel; f = f + vel;
			d = d + vel; h = h + vel;
			repaint();		
		}
		
		if (direction == Direction.South) {
			//if line goes out of frame, reset to the bottom
			if (x < 0 || x > 400) {x = 400; y = 380;}
			if (j < 0 || j > 400) {j = 400; b = 380;}
			if (m < 0 || m > 400) {m = 400; s = 380;}
			if (p < 0 || q > 400) {p = 400; q = 380;}
			if (a < 0 || a > 400) {a = 400; c = 380;}
			if (k < 0 || k > 400) {k = 400; f = 380;}
			if (d < 0 || d > 400) {d = 400; h = 380;}
			//decrease velocity of each coordinate so lines move up
			x = x - vel; y = y - vel;
			m = m - vel; s = s - vel;
			j = j - vel; b = b - vel;
			p = p - vel; q = q - vel;
			a = a - vel; c = c - vel;
			k = k - vel; f = f - vel;
			d = d - vel; h = h - vel;
			repaint();		
		}
		if (direction == Direction.East) {
			//if line goes out of frame, reset to the right
			if (j11 < 0 || j11 > 640) {j11 = 640; b11 = 620;}
			if (x11 < 0 || x11 > 640) {x11 = 640; y11 = 620;}
			if (m11 < 0 || m11 > 640) {m11 = 640; s11 = 620;}
			if (p11 < 0 || q11 > 640) {p11 = 640; q11 = 620;}
			if (a11 < 0 || a11 > 640) {a11 = 640; c11 = 620;}
			if (k11 < 0 || k11 > 640) {k11 = 640; f11 = 620;}
			if (d11 < 0 || d11 > 640) {d11 = 640; h11 = 620;}
			if (j1 < 0 || j1 > 640) {j1 = 640; b1 = 620;}
			if (x1 < 0 || x1 > 640) {x1 = 640; y1 = 620;}
			if (m1 < 0 || m1 > 640) {m1 = 640; s1 = 620;}
			if (p1 < 0 || q1 > 640) {p1 = 640; q1 = 620;}
			//decrease velocity of each coordinate so lines move left
			x11 = x11 - vel; y11 = y11 - vel;
			m11 = m11 - vel; s11 = s11 - vel;
			j11 = j11 - vel; b11 = b11 - vel;
			p11 = p11 - vel; q11 = q11 - vel;
			a11 = a11 - vel; c11 = c11 - vel;
			k11 = k11 - vel; f11 = f11 - vel;
			d11 = d11 - vel; h11 = h11 - vel;
			x1 = x1 - vel; y1 = y1 - vel;
			m1 = m1 - vel; s1 = s1 - vel;
			j1 = j1 - vel; b1 = b1 - vel;
			p1 = p1 - vel; q1 = q1 - vel;
			repaint();		
		}
		
		if (direction == Direction.West) {
			//if line goes out of frame, reset to the left
			if (j11 < 0 || j11 > 640) {j11 = 0; b11 = 20;}
			if (x11 < 0 || x11 > 640) {x11 = 0; y11 = 20;}
			if (m11 < 0 || m11 > 640) {m11 = 0; s11 = 20;}
			if (p11 < 0 || q11 > 640) {p11 = 0; q11 = 20;}
			if (a11 < 0 || a11 > 640) {a11 = 0; c11 = 20;}
			if (k11 < 0 || k11 > 640) {k11 = 0; f11 = 20;}
			if (d11 < 0 || d11 > 640) {d11 = 0; h11 = 20;}
			if (j1 < 0 || j1 > 640) {j1 = 0; b1 = 20;}
			if (x1 < 0 || x1 > 640) {x1 = 0; y1 = 20;}
			if (m1 < 0 || m1 > 640) {m1 = 0; s1 = 20;}
			if (p1 < 0 || q1 > 640) {p1 = 0; q1 = 20;}
			//increase velocity of each coordinate so lines move right
			x11 = x11 + vel; y11 = y11 + vel;
			m11 = m11 + vel; s11 = s11 + vel;
			j11 = j11 + vel; b11 = b11 + vel;
			p11 = p11 + vel; q11 = q11 + vel;
			a11 = a11 + vel; c11 = c11 + vel;
			k11 = k11 + vel; f11 = f11 + vel;
			d11 = d11 + vel; h11 = h11 + vel;
			x1 = x1 + vel; y1 = y1 + vel;
			m1 = m1 + vel; s1 = s1 + vel;
			j1 = j1 + vel; b1 = b1 + vel;
			p1 = p1 + vel; q1 = q1 + vel;
			repaint();		
		}
		
	}

}
