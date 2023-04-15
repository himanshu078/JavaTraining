package abstractionInterfaceConcepts;

public interface ShoppingProcessforAllWebsites {
	
	public void register();
	public void login();
	public String searchProduct(String product);
	public void addToCart();
	public void checkout();
	public void confirmOrder();

}
