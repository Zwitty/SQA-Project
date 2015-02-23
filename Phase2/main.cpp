#include <iostream>

using namespace std;

void DisplayMainMenu();
int getChoice();
void createTransactionFile(string code, string userName, string userType, string credit);
void createTransactionFile(string code, string buyUserName, string sellUserName, string credit);
void createTransactionFile(string code, string event, string sellUserName, string numTickets, string price);

int main()
{
  DisplayMainMenu();
  getChoice();
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
void createTransactionFile(string code, string userName, string userType, string credit)
{
  
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
void createTransactionFile(string code, string buyUserName, string sellUserName, string credit)
{

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
void createTransactionFile(string code, string event, string sellUserName, string numTickets, string price)
{

}
int getChoice()
{
  int choice;
  cin >> choice;
  return choice;
}

void DisplayLogin()
{
  cout << "Username: ";
  cout << "Password: ";
}
 
void DisplayMainMenu()
{
  cout << "Welcome to the Ticket Booking System please select and option below\n";
  cout << "1 - Sell a ticket or tickets to an event\n";
  cout << "2 - Buy a ticket or tickets to and event\n";
  cout << "3 - Add credit into the system\n";
  cout << "4 - Admin Options\n";
  cout << "5 - Logout\n";
}
