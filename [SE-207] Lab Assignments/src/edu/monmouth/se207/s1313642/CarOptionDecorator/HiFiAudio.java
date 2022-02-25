package edu.monmouth.se207.s1313642.CarOptionDecorator;

public class HiFiAudio extends CarOptions {
	
	public HiFiAudio(Car car) {
		orderedCar = car;
	}
	
	@Override
	public StringBuilder getDescription() {
		// TODO Auto-generated method stub
		return orderedCar.getDescription().append(", HiFiAudio");
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost = orderedCar.cost() + 449.99;
		return cost;
	}

}
