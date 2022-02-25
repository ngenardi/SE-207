package edu.monmouth.se207.s1313642.CarOptionDecorator;

public abstract class Car {

	StringBuilder description = new StringBuilder("Not Selected");
	
	public StringBuilder getDescription() {
		return description;
	}
	
	public abstract double cost();
}
