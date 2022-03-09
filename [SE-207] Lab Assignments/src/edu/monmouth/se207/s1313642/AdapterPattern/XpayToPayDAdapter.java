package edu.monmouth.se207.s1313642.AdapterPattern;

public class XpayToPayDAdapter implements Xpay {
	
	private final PayD payD;
	private String month, year, monthYear;
	
	public XpayToPayDAdapter(){
		this.payD = new PayDImpl();
	}

	@Override
	public String getCreditCardNo() {
		// TODO Auto-generated method stub
		return payD.getCustCardNo();
	}

	@Override
	public String getCustomerName() {
		// TODO Auto-generated method stub
		return payD.getCardOwnerName();
	}

	@Override
	public String getCardExpMonth() {
		// TODO Auto-generated method stub
		return month;
	}

	@Override
	public String getCardExpYear() {
		// TODO Auto-generated method stub
		return year;
	}

	@Override
	public Short getCardCVVNo() {
		// TODO Auto-generated method stub
		return payD.getCVVNo().shortValue();
	}

	@Override
	public Double getAmount() {
		// TODO Auto-generated method stub
		return payD.getTotalAmount();
	}

	@Override
	public void setCreditCardNo(String creditCardNo) {
		// TODO Auto-generated method stub
		payD.setCustCardNo(creditCardNo);
	}

	@Override
	public void setCustomerName(String customerName) {
		// TODO Auto-generated method stub
		payD.setCardOwnerName(customerName);
	}

	@Override
	public void setCardExpMonth(String cardExpMonth) {
		// TODO Auto-generated method stub
		month = cardExpMonth;
		monthYear = month + year;
		payD.setCardExpMonthDate(monthYear);
	}

	@Override
	public void setCardExpYear(String cardExpYear) {
		// TODO Auto-generated method stub
		year = cardExpYear;
		monthYear = month+year;
		payD.setCardExpMonthDate(monthYear);
	}

	@Override
	public void setCardCVVNo(Short cardCVVNo) {
		// TODO Auto-generated method stub
		payD.setCVVNo((int) cardCVVNo);
	}

	@Override
	public void setAmount(Double amount) {
		// TODO Auto-generated method stub
		payD.setTotalAmount(amount);
	}

}
