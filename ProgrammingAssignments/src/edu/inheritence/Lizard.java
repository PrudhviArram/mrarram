package edu.inheritence;

public class Lizard extends Reptile{

	private String name;
	private String status;
	
	
	
	public Lizard(String name) {
		super();
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Lizard [name=" + name + ", color=" + color + "]";
	}
	
	
	
	
	
}
