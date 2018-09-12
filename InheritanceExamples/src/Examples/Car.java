package Examples;

public class Car {

	private int numOfWheels = 4;
	private String color = null;
	private String make = null;
	private String model = null;
	public Car (String make, String model, String color) {
		this.make = make;
		this.model = model;
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String toString() {
		return this.make + " " + this.model + " " + this.color;
	}
}
