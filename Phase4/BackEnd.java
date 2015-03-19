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
		//System.out.println("Hello World");
		//User test = new User("AA","MyUserName",10.00);
		//System.out.println(test.getName());


		// Variables
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
	public static void loadTickets(){
		
	}

	/* This method carries out the buy function.
	 * @param: currentTrans is the transaction that is being worked on
	 */
	public static void buy(String currentTrans){
		
	}
	
	/* This method carries out the sell function.
	 * @param: currentTrans is the transaction that is being worked on
	 */
	public static void sell(String currentTrans){
		
	}
	
	/* This method carries out the add credit function.
	 * @param: currentTrans is the transaction that is being worked on
	 */
	public static void addCredit(String currentTrans){
		
	}
	
	/* This method carries out the delete a user function
	 * @param: currentTrans is the transaction that is being worked on
	 */
	public static void deleteUser(String currentTrans) {
		
	}
	
	/* This method creates new users and adds them to the user file
	 * @param: currentTrans is the transaction that is being worked on
	 */
	public static void createUser(String currentTrans){
		
	}
	
	/* This method carries out the refund fucntion
	 * @param: currentTrans is the transaction that is being worked on
	 */
	public static void refund(String currentTrans){
		
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

}
