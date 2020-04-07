package edu.abstractclass;

public class Sedan extends Car {

	
	public Sedan() {
		horsePower = 250;
		name="Sedan";
	}

	public Sedan(int horsePwr) {
		horsePower = horsePwr;
		name="Sedan";
	}
	@Override
	void ShowHP() {
		System.out.println(name+" Car has "+horsePower+" horsepower");
		
	}

}
