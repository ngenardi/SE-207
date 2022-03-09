package edu.monmouth.se207.s1313642.AdapterPattern;

public class RunAdapterExample {

	public static void main(String[] args) {
		
		// Object for Xpay
		
//		Xpay xpay = new XpayImpl();

		// we replace the above with instantiation of adapter
		
		Xpay xpay = new XpayToPayDAdapter();
		
		// rest of the statements stay the same
	
		xpay.setCreditCardNo("4789565874102365");
		xpay.setCustomerName("Max Warner");
		xpay.setCardExpMonth("09");
		xpay.setCardExpYear("25");
		xpay.setCardCVVNo((short)235);
		xpay.setAmount(2565.23);
		
		testPayD(xpay);
	}
	
	private static void testPayD(Xpay xpay){
		
		System.out.println(xpay.getCustomerName());
		System.out.println(xpay.getCreditCardNo());
		System.out.println(xpay.getCardExpMonth());
		System.out.println(xpay.getCardExpYear());
		System.out.println(xpay.getCardCVVNo());
		System.out.println(xpay.getAmount());
	}

}
