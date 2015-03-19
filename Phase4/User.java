public class User {

	public String userType;
	public String name;
	public double credit;

	public User(String newUserType, String newName, double newCredit) {
		userType = newUserType;
		name = newName;
		credit = newCredit;
	}

	public void setUserType(String newUserType){
		userType = newUserType;
	}

	public void setName(String newName){
		name = newName;
	}

	public void setCredit(double newCredit){
		credit = newCredit;
	}

	public void buyTicket(double ticketPrice){
		credit -= ticketPrice;
	}

	public void sellTicket(double ticketPrice){
		credit += ticketPrice;
	}

	public String getUserType(){
		return userType;
	}

	public String getName(){
		return name;
	}

	public double getCredit(){
		return credit;
	}

	public String toString(){
		return userType + "," + name + "," + String.valueOf(credit);
	}
}
