import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BackEnd {
	
	public static void main(String[] args) throws IOException{
		//System.out.println("Hello World");
		User test = new User("AA","MyUserName",10.00);
		System.out.println(test.getName());

		// 01 Create, 02 Delete 06 Add Credit 00 End Session 05 Refund 
		// 03 Sell 04 Buy
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

		while(j < linesArray.length){
			// Loads the next transaction line into currentTrans so we can work on it
			currentTrans = linesArray[j];
			// Variable to determine which transaction to complete buy sell, etc
			String choice = currentTrans.substring(0,2);
			
			// System.outs there temporarily to let us know which option does what
			if (choice.equals("01") == true){
				System.out.println("Create a user");
			} else if (choice.equals("02") == true) {
				System.out.println("Delete a user");
			} else if (choice.equals("03") == true) {
				System.out.println("Sell Ticket");
			} else if (choice.equals("04") == true) {
				System.out.println("Buy Ticket");
			} else if (choice.equals("05") == true) {
				System.out.println("Refund");
			} else if (choice.equals("06") == true) {
				System.out.println("Add Credit");
			} else {
				System.out.println("Session Ended");
			}
			j++; // incrementing j to continue moving through the list of transactions
		} // end of while loop
	}
}
