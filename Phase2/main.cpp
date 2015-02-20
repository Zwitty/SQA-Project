#include <iostream>

using namespace std;

void DisplayMainMenu();

int main()
{
  DisplayMainMenu();
  return 0; 
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
