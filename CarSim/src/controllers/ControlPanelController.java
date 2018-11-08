package controllers;

import model.CarObject;
import model.CarObject.Direction;
import view.ControlPanelView;
import view.ControlPanelView.ChangeType;
import view.DriveView;

public class ControlPanelController {

	private CarObject carObject;
	private ControlPanelView control_panel;
	private DriveView sim_view;
	
	public ControlPanelController () {
		this.carObject = new CarObject();
		carObject.printObject();
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
		sim_view = new DriveView(carObject);
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
			System.out.println(carObject.getTemperature());
			
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
			System.out.println(carObject.getDirection());
			
			//update car view
			//here
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
				} else {
					carObject.setEngineOn(true);
				}
			System.out.println(carObject.isEngineOn());
			System.out.println("----------");
			carObject.printObject();
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
				if (fuel < 100) {
					carObject.setFuel((fuel+1f));	
				}
			} else if (type == ChangeType.DOWN) {
				if (fuel > 0) {
					carObject.setFuel((fuel-1f));
				}
			}
			System.out.println(carObject.getFuel());
			
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
				if (speed < 120) {
					carObject.setSpeed((speed+1));	
				}
			} else if (type == ChangeType.DOWN) {
				if (speed > 0) {
					carObject.setSpeed((speed-1));
				}
			}
			System.out.println(carObject.getSpeed());
			
			//update car view
			//here
			sim_view.updateView();
		} catch (Exception e) {
			System.out.println("Error in changespeed()");
			System.out.println(e);
		}
	}
}
