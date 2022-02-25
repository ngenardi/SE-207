package edu.monmouth.se207.s1313642.CarOptionDecorator;

public class SUV extends Car {

	public SUV(){
		description.delete(0, description.length());
		description.append("SUV");
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 25034;
	}

}
