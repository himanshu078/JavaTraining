package abstractionConceptsInitial;

public class CheckoutProcess implements AddProductToCart, BillingInfo {

	static int quantityNeeded;
	static double Price;

	public static void main(String[] args) {

		CheckoutProcess checkout = new CheckoutProcess();

		checkout.productName("Eggs");
		checkout.productCategory();
		checkout.productUnit();
		Price= checkout.productPrice(5.17);
		quantityNeeded = checkout.quantityRequested(34);
	//	checkout.quantityInStock();
	//	checkout.totalPrice();
		
		if (quantityNeeded > 0) {
		checkout.PaymentOption( "Credit Card");
		checkout.enterCardHolderName("Himanshu Agarwal");
		checkout.enterCardNumber("1234567890123455");
		checkout.enterCVV("123");
		checkout.enterexpiryDate(11, 2025);
		} else {
			System.out.println("Cannot enter billing details as the cart is empty");
			
		}



	}


	public void productName(String name) {

		System.out.println("User searched for Product " + name);

	}

	public void productCategory() {

		System.out.println("Product Category is assigned ");

	}

	public void productUnit() {

		System.out.println("Product unit is assigned ");

	}

	public double productPrice(double price) {
		System.out.println("Product price per unit is " + price);
		return price;
	}



	public int quantityRequested(int quantityNeeded) {
		
		if (quantityNeeded <1) {
			System.out.println("Enter a valid quantity. Entered value is " + quantityNeeded);
		}else {
			System.out.println("Customer requested for " + quantityNeeded+ " units");
			quantityInStock();
		}
		
		return quantityNeeded;

	}

	public void quantityInStock() {
		int quantity = 100;

		if (quantityNeeded >quantity) {
			System.out.println("This much quanity is not available. Maximum available is " + quantity+ " units");
		}else {
			System.out.println("In stock quanity is " + quantity+ " units");
			System.out.println("Remaining quanity is " + (quantity - quantityNeeded) + " units");
			totalPrice();
		}

	}

	public void totalPrice() {

		System.out.println("Total value of cart is " + (Price * quantityNeeded));
	}

	// Billing
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
