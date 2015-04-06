public class Ticket{

	public User seller;
	public User buyer;
	public double price;
	public int quantity;
    public String eventName;

	public Ticket(User newSeller, User newBuyer, double newPrice, int newQuantity, String newEventName){
		seller = newSeller;
		buyer = newBuyer;
		price = newPrice;
		quantity = newQuantity;
        eventName = newEventName;
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

    public void setEventName(String newEventName){
        eventName = newEventName;
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

    public String getEventName(){
        return eventName;
    }

	public String toString(){
		return seller.getName() + "," + buyer.getName() + "," + String.valueOf(price) + "," + String.valueOf(quantity) + "," + eventName;
	}
}
