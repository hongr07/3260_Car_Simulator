package model;


public class CarObject {
	
	public enum Direction {
	    North, South, East, West 
	}
	private float temperature = 0;
	private Direction direction = Direction.North;
	private boolean engineOn = false;
	private float fuel = 100;
	private int speed = 0;
	
	private static CarObject carInstance = new CarObject();
	
	private CarObject() {}
	
	public static CarObject getInstance() {
		
		if (carInstance == null) {
			carInstance = new CarObject();
		}
		
		return carInstance;
	}
	
//	public CarObject(float temp, Direction dir, boolean engine, float fuel, int speed) {
//		// TODO Auto-generated constructor stub
//		this.temperature = temp;
//		this.direction = dir;
//		this.engineOn = engine;
//		this.fuel = fuel;
//		this.speed = speed;
//	}
	
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
		//update view
	}
	public Direction getDirection() {
		return direction;
	}
	public String getDirectionString() {
		String direction = "";
		switch (this.direction) {
		case East:
			direction = "East";
			break;
		case West:
			direction = "West";
			break;
		case North:
			direction = "North";
			break;
		case South:
			direction = "South";
			break;
		default:
			break;
		}
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	public boolean isEngineOn() {
		return engineOn;
	}
	public String getEngineString() {
		if (this.engineOn) {
			return "On";
		} else {
			return "Off";
		}
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
