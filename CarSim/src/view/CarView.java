package view;

import javax.swing.*;

import model.CarObject.Direction;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CarView extends JPanel /*implements ActionListener*/{
	//Timer t = new Timer(300, this);
	public enum Direction {
	    North, South, East, West 
	}
	private Direction direction = Direction.North;
	private int loops = 0, start = 0, end = 20; 
	private boolean engineOn = false;
	private boolean hasFuel = false;
	
	public void paint(Graphics g) {
		g.setColor(Color.green.darker());
		g.drawRect(0,0,651,383);
		g.fillRect(0,0,651,383);
		
		if(direction == Direction.North ||direction == Direction.South) {
			drawVerticalRoad(g);
		}
		else if(direction == Direction.East ||direction == Direction.West) {
			drawHorizontalRoad(g);
		}
		
		//begin moving car if engine is on and fuel is greater than 0
//		if(engineOn == true && hasFuel == true) {
//			if(direction == Direction.North) {
//				velX = velY = 2;
//			}
//			t.start();
//		}
		
	}
	
	public void drawVerticalRoad(Graphics g) {

		//Vertical road
		g.setColor(Color.gray);
		g.drawRect(285, 0, 90, 400);
		g.fillRect(285, 0, 90, 400);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(Color.white);
		
		int i;

		// creates a solid stroke with line width is 4
		Stroke stroke = new BasicStroke(4);
		for(i = 0; i < 16; i++) {
			g2d.setStroke(stroke);
			g2d.drawLine(330, start, 330, end);
			start = end + 10;
			end = start + 20;
		}
//		if(engineOn == false) {
			start = 0;
			end = 20;
//		}
	      
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
		g.drawRect(0, 140, 654, 90);
		g.fillRect(0, 140, 654, 90);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(Color.white);
		
		int i;
		
		// creates a solid stroke with line width is 4
		Stroke stroke = new BasicStroke(4);
		for(i = 0; i < 25; i++) {
			g2d.setStroke(stroke);
			g2d.drawLine(start, 185, end, 185);
			start = end + 10;
			end = start + 20;
		}
//		if(engineOn == false) {
			start = 0;
			end = 20;
//		}
		
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
	
//	public void setTimerParameters(int velocityX, int velocityY) {
//		velX = velocityX;
//		velY = velocityY;
//	}
	
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

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		if(loops == 20) {
//			System.out.println("herhgbntjgdrtngjkdrtgfjbklbjn");
//			start = 0;
//			end = 20;
//			loops = 0;
//		}
//		start++;
//		end++;
//		repaint();
//	}
}

