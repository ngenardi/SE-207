package edu.monmouth.se207.s1313642.Singleton;

public class OrderIDGenerator {

	
	static OrderIDGenerator singleton = new OrderIDGenerator();
	int id = 0;
	String prefix = "XY-";
	
	private OrderIDGenerator(){}
	
	public static OrderIDGenerator getOrderIDGenerator() {
		return(singleton);
	}
	
	public String getNextOrderID() {
		id++;
		return(prefix + id);
	}
}
