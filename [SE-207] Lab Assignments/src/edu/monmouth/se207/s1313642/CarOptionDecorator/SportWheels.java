package edu.monmouth.se207.s1313642.CarOptionDecorator;

public class SportWheels extends CarOptions {
	
	public SportWheels(Car car) {
		orderedCar = car;
	}
	
	@Override
	public StringBuilder getDescription() {
		// TODO Auto-generated method stub
		return orderedCar.getDescription().append(", Sport Wheels");
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost = orderedCar.cost() + 599.99;
		return cost;
	}

}
