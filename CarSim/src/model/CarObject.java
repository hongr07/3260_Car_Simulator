package model;


public class CarObject {
	
	public enum Direction {
	    North, South, East, West 
	}
	private float temperature;
	private Direction direction;
	private boolean engineOn;
	private float fuel;
	private int speed;
	
	public CarObject() {
		this.temperature = 0;
		this.direction = Direction.North;
		this.engineOn = false;
		this.fuel = 0;
		this.speed = 0;
	}
	
	public CarObject(float temp, Direction dir, boolean engine, float fuel, int speed) {
		// TODO Auto-generated constructor stub
		this.temperature = temp;
		this.direction = dir;
		this.engineOn = engine;
		this.fuel = fuel;
		this.speed = speed;
	}
	
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	public boolean isEngineOn() {
		return engineOn;
	}
	public void setEngineOn(boolean engineOn) {
		this.engineOn = engineOn;
	}
	public float getFuel() {
		return fuel;
	}
	public void setFuel(float fuel) {
		this.fuel = fuel;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void printObject() {
		System.out.printf("Temperature: %.2f\n"
				+ "Direction: %s\n"
				+ "Engine: %b\n"
				+ "Fuel: %.2f\n"
				+ "Speed: %d\n", 
				this.temperature, this.direction.toString(), this.engineOn, this.fuel, this.speed);
	}
	
}
