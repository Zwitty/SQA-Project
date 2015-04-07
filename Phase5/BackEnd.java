import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class BackEnd {	
    //  variables
    public static List<User> userList = new ArrayList<User>();
    public static List<Ticket> ticketList = new ArrayList<Ticket>();

    public static void main(String[] args) throws IOException{
        loadUsers();
        loadTickets();
        runTransactions();
        writeUsers();
        writeTickets();
    }

    /* Loads the previous users from the user file
    *
    */
    public static void loadUsers() throws IOException{
        BufferedReader in;
            in = new BufferedReader(new FileReader("users.txt"));

        String str = null;
        ArrayList<String> lines = new ArrayList<String>();
        while((str = in.readLine()) != null){
            lines.add(str);
        }
        // closes the transaction log file
        in.close();

        // linesArray is our list of transactions to process
        String[] linesArray = lines.toArray(new String[lines.size()]);

        for(int i = 0; i < linesArray.length; i++){
            String[] tmp = linesArray[i].split(",");
            String type = tmp[0];
            String name = tmp[1];
            double credit = Double.parseDouble(tmp[2]);

            User newUser = new User(type, name, credit);
            userList.add(newUser);
        }

    }

    /* Loads the previous tickts from the ticket file
    *
    */
    public static void loadTickets() throws IOException{
        BufferedReader in;
            in = new BufferedReader(new FileReader("tickets.txt"));

        String str = null;
        ArrayList<String> lines = new ArrayList<String>();
        while((str = in.readLine()) != null){
            lines.add(str);
        }
        // closes the transaction log file
        in.close(); 

        // linesArray is our list of transactions to process
        String[] linesArray = lines.toArray(new String[lines.size()]);

        for(int i = 0; i < linesArray.length; i++){
            String[] tmp = linesArray[i].split(",");
            String seller = tmp[0];
            String buyer = tmp[1];
            double price = Double.parseDouble(tmp[2]);
            int quantity = Integer.parseInt(tmp[3]);
            String eventName = tmp[4];

            User newBuyer = findUser(buyer);
            User newSeller = findUser(seller);

            Ticket newTicket = new Ticket(newSeller, newBuyer, price, quantity, eventName);
            ticketList.add(newTicket);
        }
    }
    
    /* runs all the transactions
     *
     */
    public static void runTransactions() throws IOException{
// VariablesString currentTrans; // Current Transaction that is being worked on
        String currentTrans; // Current Transaction that is being worked on
        int j = 0; // Variable to parse through array of transactions 1 by 1
        // Reads in the transaction log file for processing
        BufferedReader in;
            in = new BufferedReader(new FileReader("transactionlog.txt"));

        String str=null;
        ArrayList<String> lines = new ArrayList<String>();
        while((str = in.readLine()) != null){
            lines.add(str);
        }
        // closes the transaction log file
        in.close();

        // linesArray is our list of transactions to process
        String[] linesArray = lines.toArray(new String[lines.size()]);

        // While loop to keep the backend running until all transactions 
        // have been completed
        while(j < linesArray.length){
        // Loads the next transaction line into currentTrans so we can work on it
            currentTrans = linesArray[j];
            // Variable to determine which transaction to complete buy sell, etc
            String choice = currentTrans.substring(0,2);

            // If statement that processes which method to call to carry out
            // separate functions of the backend. 
            if (choice.equals("01") == true){
                createUser(currentTrans);
            } else if (choice.equals("02") == true) {
                deleteUser(currentTrans);
            } else if (choice.equals("03") == true) {
                sell(currentTrans);
            } else if (choice.equals("04") == true) {
                buy(currentTrans);
            } else if (choice.equals("05") == true) {
                refund(currentTrans);
            } else if (choice.equals("06") == true) {
                addCredit(currentTrans);
            } else {
                System.out.println("Session Ended");
            }
            writeTo(currentTrans); // Writes the transaction into the daily merged transactions
            j++; // incrementing j to continue moving through the list of transactions
        } // end of while loop
    }

    /* returns the User object of a given username
     *
     */
    public static Ticket findTicket(String eventName){
   
        for(Ticket i : ticketList){
            if(i.getEventName().equals(eventName)){
                return i;
            }
        }
        return null;
    }
    
    /* returns the position in the list of a given username
     *
     */
    public static int findTicketPosition(String ticketName){
        int count = 0;
        for(Ticket i : ticketList){
            if(i.getEventName().equals(ticketName)){
                return count;
            }else{
                count ++;
            }
        }
        return -1;

    }

    /* returns the User object of a given username
     *
     */
    public static User findUser(String userName){
   
        for(User i : userList){
            if(i.getName().equals(userName)){
                return i;
            }
        }
        return null;
    }
    
    /* returns the position in the list of a given username
     *
     */
    public static int findUserPosition(String userName){
        int count = 0;
        for(User i : userList){
            if(i.getName().equals(userName)){
                return count;
            }else{
                count ++;
            }
        }
        return -1;

    }

	/* This method carries out the buy function.
	 * @param: currentTrans is the transaction that is being worked on
	 */
	public static void buy(String currentTrans){
        String seller = currentTrans.substring(24,37);
        String event = currentTrans.substring(4,23);
        int ticketsAvail = ticketList.get(findTicketPosition(event)).getQuantity();
        int numTickets = Integer.parseInt(currentTrans.substring(38,41));
        Double price = Double.parseDouble(currentTrans.substring(43,48));
        Double userCredit = userList.get(findUserPosition(seller)).getCredit();
        Double creditToAdd =  (numTickets*price) + userCredit; // calculates credit to add to seller
        int newTicketNum = ticketsAvail - numTickets; // calculates new number of available tickets

        // sets new quantity of available tickets in ticket list
        ticketList.get(findTicketPosition(event)).setQuantity(newTicketNum);
        // sets new credit of the seller
        userList.get(findUserPosition(seller)).setCredit(creditToAdd);
	}
	
	/* This method carries out the sell function.
	 * @param: currentTrans is the transaction that is being worked on
	 */
	public static void sell(String currentTrans){
	    String[] trans = currentTrans.split(" ");
        
        String seller = currentTrans.substring(24,37);
        String event = currentTrans.substring(3,23);
        String numTickets = currentTrans.substring(38,41);
        double price = Double.parseDouble(currentTrans.substring(42,48));
        System.out.println(userList);
        userList.get(findUserPosition(seller)).sellTicket(price);

        //ticketList.add(event, seller, numTickets, price);
 
	}
	
	/* This method carries out the add credit function.
	 * @param: currentTrans is the transaction that is being worked on
	 */
	public static void addCredit(String currentTrans){
    	String[] splited = currentTrans.split(" ");
    	String userName = splited[1];
    	String userType = currentTrans.substring(19,21);
    	double creditToAdd = Double.parseDouble(currentTrans.substring(22,31));
    	double userCredit = userList.get(findUserPosition(userName)).getCredit();
    	Double newUserCredit = creditToAdd + userCredit;
    	userList.get(findUserPosition(userName)).setCredit(newUserCredit);
    		
	}
	
	/* This method carries out the delete a user function
	 * @param: currentTrans is the transaction that is being worked on
	 */
	public static void deleteUser(String currentTrans) {
	    String[] trans = currentTrans.split(" ");

        String deletedUser = trans[1];

        userList.remove(findUserPosition(deletedUser));
    }
    
    /* This method creates new users and adds them to the user file
     * @param: currentTrans is the transaction that is being worked on
     */
    public static void createUser(String currentTrans) throws IOException{
        
        String[] splited = currentTrans.split(" ");
    	String userName = splited[1];
    	String userType = currentTrans.substring(18,20);
    	double credit = Double.parseDouble(currentTrans.substring(21,30));
    	
        
        User newUser = new User(userType, userName, credit);

        userList.add(newUser);

    }
    
    /* This method carries out the refund function
     * @param: currentTrans is the transaction that is being worked on
     */
    public static void refund(String currentTrans){
        String[] trans = currentTrans.split(" ");
        
        String buyer = trans[1];
        String seller = currentTrans.substring(19,34);
        double credit = Double.parseDouble(currentTrans.substring(35,44));

        //adding buyer's credit
        double buyerCredit = userList.get(findUserPosition(buyer)).getCredit();
        double newBuyerCredit = buyerCredit + credit;
        userList.get(findUserPosition(buyer)).setCredit(newBuyerCredit);

        //reducing seller's credit
        double sellerCredit = userList.get(findUserPosition(seller)).getCredit();
        double newSellerCredit = sellerCredit - credit;
        userList.get(findUserPosition(seller)).setCredit(newSellerCredit);
	}

	/* This method writes the transaction to the daily log file
	 * @param: currentTrans is the transaction that will be added to the daily log file
	 */
	public static void writeTo(String currentTrans) throws IOException{
	
		String content = currentTrans;
		 
		File file = new File("mergedDailyTransactions.txt");
        // if file doesn't exists, then create it
        if (!file.exists()) {
        	file.createNewFile();
        }

        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close();
    }

    public static void writeUsers() throws IOException{
        File file = new File("users.txt");
        // if file doesn't exists, then create it
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        
        String write = "";

        for(User i : userList){
            write += '\n' + i.toString();
        }

        bw.write(write);
        bw.close();
    }

    public static void writeTickets() throws IOException{
        File file = new File("tickets.txt");
        // if file doesn't exists, then create it
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        
        String write = "";

        for(Ticket i : ticketList){
            write += '\n' + i.toString();
        }

        bw.write(write);
        bw.close();
    }

}
