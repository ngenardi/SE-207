package edu.monmouth.se207.s1313642.AdapterPattern;

public class PayDImpl implements PayD {
	
	private String custCardNo;
	private String cardOwnerName;
	private String cardExpMonthDate;
	private Integer cVVNo;
	private Double totalAmount;
	
	public PayDImpl () {
		
	}
	
	public String getCustCardNo() {
		return this.custCardNo;
	}
	
	public String getCardOwnerName() {
		return this.cardOwnerName;
	}
	
	public String getCardExpMonthDate() {
		return this.cardExpMonthDate;
		
	}
	
	public Integer getCVVNo() {
		return this.cVVNo;
	}
	
	public Double getTotalAmount() {
		return this.totalAmount;
	}
	
	public void setCustCardNo(String custCardNo) {
		this.custCardNo = custCardNo;
	}
	
	public void setCardOwnerName(String cardOwnerName) {
		this.cardOwnerName = cardOwnerName;
	}
	
	public void setCardExpMonthDate(String cardExpMonthDate) {
		this.cardExpMonthDate = cardExpMonthDate;
	}
	
	public void setCVVNo(Integer cVVNo) {
		this.cVVNo = cVVNo;
	}
	
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	

}
