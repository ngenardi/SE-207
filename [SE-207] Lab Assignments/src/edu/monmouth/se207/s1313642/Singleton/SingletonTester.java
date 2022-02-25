package edu.monmouth.se207.s1313642.Singleton;

import java.util.Arrays;

public class SingletonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OrderIDGenerator order1 = OrderIDGenerator.getOrderIDGenerator();
		
		String[] orderSet1 = new String[] {order1.getNextOrderID(),order1.getNextOrderID(),order1.getNextOrderID(),order1.getNextOrderID()};
		System.out.println("Order set 1:\n" + Arrays.toString(orderSet1));
		
		OrderIDGenerator order2 = OrderIDGenerator.getOrderIDGenerator();
		String[] orderSet2 = new String[] {order2.getNextOrderID(),order2.getNextOrderID(),order2.getNextOrderID()};
		System.out.println("Order set 2:\n" + Arrays.toString(orderSet2));
		
		OrderIDGenerator order3 = OrderIDGenerator.getOrderIDGenerator();
		String[] orderSet3 = new String[] {order3.getNextOrderID(),order3.getNextOrderID(),order3.getNextOrderID(),order3.getNextOrderID(),order3.getNextOrderID(),order3.getNextOrderID(),order3.getNextOrderID()};
		System.out.println("Order set 3:\n" + Arrays.toString(orderSet3));
	}

}
