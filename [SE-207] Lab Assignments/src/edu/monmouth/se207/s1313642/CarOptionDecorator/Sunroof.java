package edu.monmouth.se207.s1313642.CarOptionDecorator;

public class Sunroof extends CarOptions {

	public Sunroof(Car car) {
		orderedCar = car;
	}

	@Override
	public StringBuilder getDescription() {
		// TODO Auto-generated method stub
		return orderedCar.getDescription().append(", Sunroof");
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost = orderedCar.cost() + 259.99;
		return cost;
	}

}
