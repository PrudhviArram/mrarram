package edu.abstractclass;

public class Truck extends Car{
	
	

	public Truck() {
		super();
		horsePower = 325;
		name="Truck";
	}

	public Truck(int horsePwr) {
		super();
		horsePower = horsePwr;
		name="Truck";
	}
	@Override
	void ShowHP() {
		System.out.println(name+" car has "+horsePower+" horsepower");
	}
	
}
