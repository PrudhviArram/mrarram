package edu.inheritence;

public class Snake extends Reptile {

	private String name;
	private String dangerLevel;
	
	
	
	public Snake(String name) {
		super();
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Snake [name=" + name + ", color=" + color + "]";
	}
	
	
	
}
