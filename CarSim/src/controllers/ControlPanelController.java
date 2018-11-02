package controllers;

import model.CarObject;
import model.CarObject.Direction;

public class ControlPanelController {

	private CarObject carObject;
	private ControlPanelView control_panel;
	
	public ControlPanelController () {
		this.carObject = new CarObject();
		carObject.printObject();
		initialize();
	}

	public void initialize() {
		renderControlPanel();
//		renderSimulation();
	}
	
	public void renderControlPanel() {
		control_panel = new ControlPanelView();
	}
	
	public void changeTemperature() {
		
	}
	public void changeDirection() {
		
	}
	public void changeEngineStatus() {
		
	}
	public void changeFuel() {
		
	}
	public void changeSpeed() {
		
	}
}