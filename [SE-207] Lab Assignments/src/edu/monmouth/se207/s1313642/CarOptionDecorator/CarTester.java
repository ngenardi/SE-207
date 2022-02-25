package edu.monmouth.se207.s1313642.CarOptionDecorator;

public class CarTester {
	public static void main(String[] args) {
		
		Car suv = new SUV();
		suv = new HiFiAudio(suv);
		suv = new Sunroof(suv);
		System.out.printf("Cost: $%.2f%n", suv.cost());
		System.out.println("Description: " + suv.getDescription());
		System.out.println();
		
		Car econ = new Economy();
		econ = new SportWheels(econ);
		System.out.printf("Cost: $%.2f%n", econ.cost());
		System.out.println("Description: " + econ.getDescription());
		System.out.println();
		
		Car compactSUV = new CompactSUV();
		compactSUV = new SportWheels(compactSUV);
		compactSUV = new HiFiAudio(compactSUV);
		compactSUV = new Sunroof(compactSUV);
		System.out.printf("Cost: $%.2f%n", compactSUV.cost());
		System.out.println("Description: " + compactSUV.getDescription());
	}
}
