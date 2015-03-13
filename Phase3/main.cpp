/*  
 * main front end file for the Software Quality Assurance Project
 * Team name while(true)
 * 
 * @authors Matthew Clark, James Gelinas, Henry Onggo
 */
#include <iostream>
#include <fstream>
#include <string>

using namespace std;

class Users
{
  string userName;
  string userType;
  string credit;

public:
  void setUserName(string name) {userName = name;}
  string getUserName() {return userName;}
  
  void setUserType(string type) {userType = type;}
  string getUserType() {return userName;}
  
  void setCredit(string cred) {credit = cred;}
  string getCredit() {return credit;}
};

/* Variables */
string userName;
Users users[10];

/* Menu Functions */
void displayMainMenu();
void displayLogin();
void displayAdminMenu();
int getChoice();

/* Tranaction file writing functions */
void createTransaction(string code, string userName, string userType, string credit);
void createRefundTransaction(string code, string buyUserName, string sellUserName, string credit);
void createSellBuyTransaction(string code, string event, string sellUserName,string numTickets, string price);

/* Transaction building functions */
void addCredit();
void create();
void deleteTicket();
void endSession();
void sellTicket();
void buyTicket();

int main()
{
  
  displayLogin();
  return 0; 
}

/**
 * Creates transaction with the following form
 * XX_UUUUUUUUUUUUUU_TT_CCCCCCCCC
 *
 * @param code is XX and will contain a two digit code: 01-create, 02-delete etc
 * @param userName is UUUUUUUUUUUUUUU the username of the buyer in the
 * transaction
 * @param userType is TT and is the type of user making the transaction,
 *  AA=Admin, FS=full-standard, BS=buy-standard, SS=sell standard
 * @param credit is the available credit for the buyer
 */
void createTransaction(string code, string userName, string userType, string credit)
{
  ofstream transactionFile;
  transactionFile.open ("transaction.etf", ofstream::out | ofstream::app);
  transactionFile << code << "_" << userName << "_" << userType << "_" << credit << '\n';
  transactionFile.close();
  return;  
}

/**
 * Creates a transaction with the following form
 * XX_UUUUUUUUUUUUU_SSSSSSSSSSSSSS_CCCCCCCCC
 *
 * @param code is XX and will contain a two digit code: 01-create, 02-delete etc
 * @param buyUserName is UUUUUUUUUUUUUUU the username of the buyer in the
 * transaction
 * @param sellUserName is SSSSSSSSSSSSSSS is the seller's username
 * @param credit is CCCCCCCCCC is the refund credit.
 */  
void createRefundTransaction(string code, string buyUserName, string sellUserName, string credit)
{
  ofstream transactionFile;
  transactionFile.open ("transaction.etf", ofstream::out | ofstream::app);
  transactionFile << code << "_" << buyUserName << "_" << sellUserName << "_" << credit << '\n';
  transactionFile.close();
  return;  
}

/**
 * Creates transaction with the following form
 * XX_EEEEEEEEEEEEEEEEEEEE_SSSSSSSSSSSSSS_TTT_PPPPPP
 *
 * @param code is XX and will contain a two digit code:01-create, 02-delete etc
 * @param event is EEEEEEEEEEEEEEEEEEE is the event name
 * @param sellUserName is SSSSSSSSSSSSSS is the seller's username
 * @param numTickets is TTT and the number of tickets for sale
 * @param price is PPPPP is the price of the tickets
 */
void createSellBuyTransaction(string code, string event, string sellUserName,string numTickets, string price)
{
  ofstream transactionFile;
  transactionFile.open ("transaction.etf", ofstream::out | ofstream::app);
  transactionFile << code << "_" << event << "_" << sellUserName << "_" << numTickets << "_" << price << '\n';
  transactionFile.close();
  return;  


}

/*
 * Gathers the information to complete a session end transaction
 */
void endSession()
{
  string code = "00"; // end sessions code is 00
  string userType = "AA"; //For testing we will use ADMIN
  string credit = "123456789"; // for testing we are adding a large amount
  createTransaction(code, userName, userType, credit);
}

/*
 * Gathers the information to compile a trasaction to create a ticket
 */
void create()
{
  string code = "01"; // create's code is 01
  string userType = "AA"; //For testing we will use ADMIN
  string credit = "123456789"; // for testing we are adding a large amount
  createTransaction(code, userName, userType, credit);
}

/*
 * Gathers the information to compile a trasaction to delete a ticket 
 */
void deleteTicket()
{
  string code = "02"; // delete's code is 02
  string userType = "AA"; //For testing we will use ADMIN
  string credit = "123456789"; // for testing we are adding a large amount
  createTransaction(code, userName, userType, credit);
}

/*
 * Gathers the information to compile a trasaaction to sell 
 */
void sellTicket()
{
  string code = "03"; // Create a sell transaction
  string event = "EEEEEEEEEEEEEEEEEE"; //For testing we will use EEEE
  string numTickets = "50"; // 50 tickets will be the test amount
  string price = "1234";
  createSellBuyTransaction(code, event, userName, numTickets, price);
}

/*
 * Gathers the information to compile a trasaaction to sell 
 */
void buyTicket()
{
  string code = "04"; // code for a buy transaction is 04
  string event = "EEEEEEEEEEEEEEEEEE"; //For testing we will use EEEE
  string numTickets = "50"; // 50 tickets will be the test amount
  string price = "1234";
  createSellBuyTransaction(code, event, userName, numTickets, price);
}

/*
 * Gathers the information to compile a refund transaction file
 */
void refund()
{
  string code = "05"; // Refunds code is 05
  string buyer = "BUYER";
  string seller = "SELLER";
  string credit = "123456789"; // for testing we are adding a large amount
  createRefundTransaction(code, buyer, seller, credit);
}

/*
 * Gathers the information to compile a trasaction to add Credit to the 
 * transaction file
 */
void addCredit()
{
  string code = "06"; // Add credit's code is 06
  string userType = "AA"; //For testing we will use only ADMIN
  string credit = "123456789"; // for testing we are adding a large amount
  createTransaction(code, userName, userType, credit);
}

/*
 * Get the choice the user has selected in a displayed menu
 */
int getChoice()
{
  int choice;
  cin >> choice;  
  return choice;
}

/*
 * Display the login screen and ask for a username for the session
 */
void displayLogin()
{
  cout << "Username: ";
  cin >> userName;
  users[0].setUserName(userName);
  displayMainMenu();
}

/*
 * Displays the main menu of the application
 */ 
void displayMainMenu()
{
  int choice = 0;
  do
  {
    cout << "Welcome to the Ticket Booking System please select and option below\n";
    cout << "1 - Sell a ticket or tickets to an event\n";
    cout << "2 - Buy a ticket or tickets to and event\n";
    cout << "3 - Add credit into the system\n";
    cout << "4 - Admin Options\n";
    cout << "5 - Logout\n";
    choice = getChoice();
  }while ((choice < 1 || choice > 5));
  if(choice == 1)
  {
    sellTicket();
  }else if(choice == 2)
  {
    buyTicket();
  }else if (choice == 3)
  {
    addCredit();
  }else if (choice == 4)
  {
    displayAdminMenu();
  }else if (choice == 5)
  {
    endSession();
    return;
  }else
  {
   displayMainMenu();
  }
  displayMainMenu();
}

/*
 * Displays the additional admin menu
 */
void displayAdminMenu()
{
  int choice = 0;
  do
  {
    cout << "Welcome to the advanced privlages, please select one of the following options\n";
    cout << "1 - Create a new user in the system\n";
    cout << "2 - Delete a user in the system\n";
    cout << "3 - Issue credit from to a buyers account from a seller (refund)\n";
    cout << "4 - Return to main menu\n";
    choice = getChoice();
  }while ((choice < 1 || choice > 4));
  if(choice == 1)
  {
    create();
  }else if(choice == 2)
  {
    deleteTicket(); 
    //Delete User
  }else if(choice == 3)
  {
    refund();
    //Refund
  }else if(choice == 4)
  {
    displayMainMenu();
  }else
  {
     //Other
     displayAdminMenu();
  }
}
