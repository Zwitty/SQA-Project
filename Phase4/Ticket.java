public class Ticket
{
	public User seller;
	public User buyer;
	public double price;
	public int quantity;

	public Ticket(User newSeller, User newBuyer, double newPrice, int newQuantity){
		seller = newSeller;
		buyer = newBuyer;
		price = newPrice;
		quantity = newQuantity;
	}

	public void setSeller(User newSeller){
		seller = newSeller;
	}

	public void setBuyer(User newBuyer){
		buyer = newBuyer;
	}

	public void setPrice(double newPrice){
		price = newPrice;
	}

	public void setQuantity(int newQuantity){
		quantity = newQuantity;
	}

	public User getSeller(){
		return seller;
	}

	public User getBuyer(){
		return buyer;
	}

	public double getPrice(){
		return price;
	}

	public int getQuantity(){
		return quantity;
	}
}