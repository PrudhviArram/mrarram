package edu.abstractclass;

public class Test {

	public static void main(String[] args) {
		Car car1=new Sedan();
		Car car2=new Truck(400);
		car1.ShowHP();
		car2.ShowHP();
	}

}
