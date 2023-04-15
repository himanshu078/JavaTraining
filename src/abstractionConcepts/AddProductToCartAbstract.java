package abstractionConcepts;

public abstract class AddProductToCartAbstract extends BillingInformation {


	// non abstract methods
	public void productName(String name) {
		System.out.println("User searched for Product " + name);

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

	// abstract methods
	public abstract void quantityInStock();
	public abstract void productCategory();
	public abstract void productUnit();

}
