package edu.monmouth.se207.s1313642.CarOptionDecorator;

public class CompactSUV extends Car {

	public CompactSUV(){
		description.delete(0, description.length());
		description.append("CompactSUV");
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 21545;
	}

}
