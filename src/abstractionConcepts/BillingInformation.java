package abstractionConcepts;

public class BillingInformation {
	
	public String PaymentOption(String option) {

		System.out.println("User clicked on " + option);
		return option;

	}

	
	public void enterCardNumber(String cardNumber) {

		if (cardNumber.length() != 16) {
			System.out.println("Please enter a valid card number");
		}
		else
			System.out.println("User entered card number as " + cardNumber);

	}

	public void enterCVV(String CVV) {
		int length = CVV.length();

		switch (length) {
		case 1 : System.out.println("Please enter a valid CVV");
		break;
		case 2 : System.out.println("Please enter a valid CVV");
		break;
		case 3 : System.out.println("User entered CVV as " + CVV);
		break;
		default : System.out.println("CVV cannot be more than 3 digits");
		}	

	}

	public void enterexpiryDate(int month, int Year) {

		if (month >0 && month <13) {
			System.out.println("User entered expiry date as " + month + " " + Year);
		} else System.out.println("Please enter a valid month");


	}

	public void enterCardHolderName(String name) {

		System.out.println("User entered name as " + name);

	}
	
	

}
