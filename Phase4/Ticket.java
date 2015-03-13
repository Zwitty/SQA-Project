public class Ticket
{
	public User seller;
	public User buyer;
	public double price;
	public int quantity;

	public Ticket(String newSeller, String newBuyer, double newPrice, int newQuantity)
	{
		seller = newSeller;
		buyer = newBuyer;
		price = newPrice;
		quantity = newQuantity;
	}

	public void setNewSeller(String newSeller)
	{
		seller = newSeller;
	}

	public void setNewBuyer(String newBuyer)
	{
		buyer = newBuyer;
	}

	public void setNewPrice(double newPrice)
	{
		price = newPrice;
	}

	public void setNewQuantity(int newQuantity)
	{
		quantity = newQuantity;
	}

}