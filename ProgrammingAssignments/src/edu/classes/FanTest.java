package edu.classes;

public class FanTest {
	public static void main(String[] args) {
		
		Fan fan1 = new Fan();
		fan1.setSpeed(Fan.fast);
		fan1.setRadius(9);
		fan1.setColor("Yellow");
		fan1.setOn(true);
		
		System.out.println(fan1.toString());
		
		Fan fan2 = new Fan();
		fan2.setSpeed(Fan.medium);
		fan2.setRadius(4);;
		fan2.setColor("Blue");
		fan2.setOn(false);
		
		System.out.println(fan2.toString());
	}

}

