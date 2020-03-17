package edu.classes;

public class Fan {

	/*
	 * static final means only one instance of the variable no matter how many
	 * objects are created and the value of that variable can never change
	*/
	static final int slow = 1;
	static final int medium = 2;
	static final int fast = 3;
	
	private String color = "blue";
	
	private int speed = slow;
	private boolean on = false;
	private double radius = 5;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//A no-arg constructor that creates a default fan.
	public Fan() {
		
	}
	@Override
	public String toString() {
		if(this.on) {
		return "Fan --> Speed : " + getSpeed() + ", Color : " + getColor() + ", Radius : " + getRadius();
	
		}else {
			return "Fan --> Fan is off, Color : " + getColor() + ", Radius : " + getRadius();
		}
	}
	
	
	
	
	
	
}
