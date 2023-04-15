package abstractionInterfaceConcepts;

public interface BillingInfo {
	
	public String PaymentOption(String option);
	
	public void enterCardNumber(String cardNumber);
	
	public void enterCVV(String CVV);
	
	public void enterexpiryDate(int month, int Year);
	
	public void enterCardHolderName(String name);
	
	
	

}
