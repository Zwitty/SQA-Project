#include <iostream>

using namespace std;

/* Variables */
char userName[15];


/* Functions */
void displayMainMenu();
void displayLogin();
void displayAdminMenu();
int getChoice();
void createTransaction(char code[2], char userName[15], char userType[2], char credit[9]);
void createRefundTransaction(char code[2], char buyUserName[15], char sellUserName[15], char credit[9]);
void createSellBuyTransaction(char code[2], char event[19], char sellUserName[15],char numTickets[3], char price[6]);

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
void createTransaction(char code[2], char userName[15], char userType[2], char credit[9])
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
void createRefundTransaction(char code[2], char buyUserName[15], char sellUserName[15], char credit[9])
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
void createSellBuyTransaction(char code[2], char event[19], char sellUserName[15],char numTickets[3], char price[6])
{

}
int getChoice()
{
  int choice;
  cin >> choice;  
  return choice;
}

void displayLogin()
{
  cout << "Username: ";
  cin >> userName;
  displayMainMenu();
}
 
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
    //sell tickets
  }else if(choice == 2)
  {
    //Buy tickets
  }else if (choice == 3)
  {
    //Add Credit
  }else if (choice == 4)
  {
    displayAdminMenu();
  }else if (choice == 5)
  {
    //Logout
  }else
  {
   // displayMainMenu();
  }
}

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
    //Create new user
  }else if(choice == 2)
  {
    //Delete User
  }else if(choice == 3)
  {
    //Refund
  }else if(choice == 4)
  {
    displayMainMenu();
  }else
  {
     //Other
  }
}
