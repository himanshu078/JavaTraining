package abstractionInterfaceConcepts;

public interface AddProductToCart extends BillingInfo {
	
	
	public void productName(String name);
	
	public void productCategory();
	
	public void productUnit();
	
	public double productPrice(double price);
	
	public int quantityRequested(int quantity);
	
	public void quantityInStock();

}
