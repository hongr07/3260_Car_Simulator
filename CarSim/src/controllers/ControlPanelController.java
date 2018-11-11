package controllers;

import model.CarObject;
import model.CarObject.Direction;
import sun.print.resources.serviceui;
import view.ControlPanelView;
import view.ControlPanelView.ChangeType;
import view.DriveView;

public class ControlPanelController {

	private CarObject carObject;
	private ControlPanelView control_panel;
	private DriveView sim_view;
	
	public ControlPanelController () {
		this.carObject = CarObject.getInstance();
//		carObject.printObject();
		initialize();
	}

	public void initialize() {
		renderControlPanel();
		renderSimulation();
	}
	
	public void renderControlPanel() {
		control_panel = new ControlPanelView(this);
	}
	
	public void renderSimulation() {
		sim_view = new DriveView(carObject, this);
	}
	
	//change temperature by 0.5
	public void changeTemperature(ChangeType type) {
		try {
			float temp = carObject.getTemperature();
			if (type == ChangeType.UP) {
				if (temp < 40) {
					carObject.setTemperature((temp+0.5f));	
				}
			} else if (type == ChangeType.DOWN) {
				if (temp > -20) {
					carObject.setTemperature((temp-0.5f));
				}
			}
//			System.out.println(carObject.getTemperature()); 
			
			//update car view
			//here
			sim_view.updateView();
		} catch (Exception e) {
			System.out.println("Error in changetemp()");
			System.out.println(e);
		}
	}
	
	//change direction
	public void changeDirection(Direction dir) {
		
		try {
			carObject.setDirection(dir);
//			System.out.println(carObject.getDirection());
			
			//update car view
			sim_view.carView.setDirection(carObject.getDirection());
			sim_view.carView.repaint();
			sim_view.updateView();
		} catch (Exception e) {
			System.out.println("Error in change direction()");
			System.out.println(e);
		}
	}
	
	//change engine status
	public void changeEngineStatus() {
		try {
			boolean engine = carObject.isEngineOn();
			
				if (engine) {
					carObject.setEngineOn(false);	
					sim_view.carView.setDirection(carObject.getDirection());
					//set fuel to false if engine is off
					sim_view.carView.setEngine(false);
				} else if (engine == false && carObject.getFuel() <= 0) {
					carObject.setEngineOn(false);
					sim_view.carView.setEngine(false);
				} else {
					carObject.setEngineOn(true);
					sim_view.carView.setDirection(carObject.getDirection());
					sim_view.carView.setEngine(true);
				}
				//checking speed and fuel to begin driving
				sim_view.carView.setFuel(carObject.getFuel());
				sim_view.carView.setSpeed(carObject.getSpeed());
				sim_view.carView.repaint();
//			System.out.println(carObject.isEngineOn());
//			System.out.println("----------");
//			carObject.printObject();
			//update car view
			//here
			sim_view.updateView();
		} catch (Exception e) {
			System.out.println("Error in changeEngine()");
			System.out.println(e);
		}
	}
	
	//change fuel by 1
	public void changeFuel(ChangeType type) {
		try {
			float fuel = carObject.getFuel();
			if (type == ChangeType.UP) {
				if (fuel < 100 && fuel > 0) {
					carObject.setFuel((fuel+1f));	
				} 
				else if (fuel == 0) {
					carObject.setFuel((fuel+1f));
					sim_view.carView.setFuel(carObject.getFuel());
					sim_view.carView.repaint();
				}
			} else if (type == ChangeType.DOWN) {
				if (fuel > 1) {
					carObject.setFuel((fuel-1f));
				}
				else if(fuel == 1) {
					//if fuel becomes 0 stop car simulation
					carObject.setFuel((fuel-1f));
					sim_view.carView.setFuel(carObject.getFuel());
					carObject.setEngineOn(false);
					sim_view.carView.setEngine(false);
				}
			}
//			System.out.println(carObject.getFuel());
			
			//update car view
			//here
			sim_view.updateView();
		} catch (Exception e) {
			System.out.println("Error in changefuel()");
			System.out.println(e);
		}
	}
	
	//change speed by 1
	public void changeSpeed(ChangeType type) {
		try {
			int speed = carObject.getSpeed();
			if (type == ChangeType.UP) {
				if (speed < 120 && speed > 0) {
					carObject.setSpeed((speed+1));	
					sim_view.carView.incrementVelocity(carObject.getSpeed());
				}
				else if (speed == 0) {
					carObject.setSpeed((speed+1));
					sim_view.carView.setSpeed(carObject.getSpeed());
					sim_view.carView.repaint();
				}
			} else if (type == ChangeType.DOWN) {
				if (speed > 1) {
					carObject.setSpeed((speed-1));
					sim_view.carView.decrementVelocity(carObject.getSpeed());
				}
				else if(speed == 1) {
					carObject.setSpeed((speed-1));
					sim_view.carView.setSpeed(carObject.getSpeed());
					carObject.setEngineOn(false);
					sim_view.carView.setEngine(false);
				}
			}
//			System.out.println(carObject.getSpeed());
			
			//update car view
			//here
			sim_view.updateView();
		} catch (Exception e) {
			System.out.println("Error in changespeed()");
			System.out.println(e);
		}
	}
}
