package edu.monmouth.se207.s1313642.CarOptionDecorator;

public class Economy extends Car {

	public Economy() {
		description.delete(0, description.length());
		description.append("Economy Car");
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 19530;
	}

}
