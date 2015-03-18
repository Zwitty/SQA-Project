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
		// Reads in the transaction log file for processing
		BufferedReader in;
			in = new BufferedReader(new FileReader("transactionlog.txt"));
	
		String str=null;
		ArrayList<String> lines = new ArrayList<String>();
		while((str = in.readLine()) != null){
		    lines.add(str);
		}
		// linesArray is our list of transactions to process
		String[] linesArray = lines.toArray(new String[lines.size()]);

	}
}
