# Make and test file
# 
# Authors: Matthew Clark, James Gelinas, Henry Onggo

all : a.out

a.out : main.cpp
	g++ main.cpp
	
cleanAll : clean cleanTrans

clean : 
	rm -f *.out

cleanTrans :
	rm -f *.etf
	
test : a.out
	./a.out

# ================================================
#                ALL TESTS
# ================================================

login : login0 login1 login2 login3 login4 login5 login6 login7 login8

logout : logout0 logout1 logout2

create : create0 create1 create2 create3 create4 create5 create6

delete : delete0 delete1 delete2 delete3 delete4

sell : sell0 sell1 sell2 sell3 sell4 sell5

buy : buy0 buy1 buy2 buy3

refund : refund0 refund1 refund2 refund3

addcredit : addcredit0 addcredit1 addcredit2 addcredit3

# ================================================
#                LOGIN TESTS
# ================================================

# check if a current user is logged in
login0 : a.out
	echo "Running Test for login0"
	./a.out < output/Login/login0.inp > output/Login/login0.bto

# Asks user for username
login1 : a.out
	echo "Running Test for login1"
	./a.out < output/Login/login1.inp > output/Login/login1.bto

# Check if username exists
login2 : a.out
	echo "Running Test for login2"
	./a.out < output/Login/login2.inp > output/Login/login2.bto

# Reads in the users account file
login3 : a.out
	echo "Running Test for login3"
	./a.out < output/Login/login3.inp > output/Login/login3.bto


# Check if password matches the username password
login4 : a.out
	echo "Running Test for login4"
	./a.out < output/Login/login4.inp > output/Login/login4.bto

# Test if we can login as a normal user
login5 : a.out
	echo "Running Test for login5"
	./a.out < output/Login/login5.inp > output/Login/login5.bto

# Test if we can log in as an admin
login6 : a.out
	echo "Running Test for login6"
	./a.out < output/Login/login6.inp > output/Login/login6.bto

# Test that we cannot make privileged transactions as a standard user
login7 : a.out
	echo "Running Test for login7"
	./a.out < output/Login/login7.inp > output/Login/login7.bto

# Test that we can make privileged transactions as an admin user
login8 : a.out
	echo "Running Test for login8"
	./a.out < output/Login/login8.inp > output/Login/login8.bto

# ================================================
#                LOGOUT TESTS
# ================================================

# Check if a user is currently logged in.
logout0 : a.out
	echo "Running Test for logout0"
	./a.out < output/Logout/logout0.inp > output/Logout/logout0.bto

# Write out the daily transaction file
logout1 : a.out
	echo "Running Test for logout1"
	./a.out < output/Logout/logout1.inp > output/Logout/logout1.bto

# Test if we can make another transaction
logout2 : a.out
	echo "Running Test for logout2"
	./a.out < output/Logout/logout2.inp > output/Logout/logout2.bto

# ================================================
#                CREATE TESTS
# ================================================

# Check if a user is logged in
create0 : a.out
	echo "Running Test for create0"
	./a.out < output/Create/create0.inp > output/Create/create0.bto

# Ask user for username (Max 15 characters)
create1 : a.out
	echo "Running Test for create1"
	./a.out < output/Create/create1.inp > output/Create/create1.bto

# Check if username is unique
create2 : a.out
	echo "Running Test for create2"
	./a.out < output/Create/create2.inp > output/Create/create2.bto

# Ask user for a password (min 8 character, one must be uppercase)
create3 : a.out
	echo "Running Test for create3"
	./a.out < output/Create/create3.inp > output/Create/create3.bto

# Ask user type(Full, Buy, Sell)
create4 : a.out
	echo "Running Test for create4"
	./a.out < output/Create/create4.inp > output/Create/create4.bto

# Verify information has been saved to the daily transaction file
create5 : a.out
	echo "Running Test for create5"
	./a.out < output/Create/create5.inp > output/Create/create5.bto

# Verify that there is a limit of $999,999 that can be credited to the account.
create6 : a.out
	echo "Running Test for create6"
	./a.out < output/Create/create6.inp > output/Create/create6.bto

# ================================================
#                DELETE TESTS
# ================================================

# Check that no further transactions can be conducted by deleted user
delete0 : a.out
	echo "Running Test for delete0"
	./a.out < output/Delete/delete0.inp > output/Delete/delete0.bto

# Ask user for user account to be deleted
delete1 : a.out
	echo "Running Test for delete1"
	./a.out < output/Delete/delete1.inp > output/Delete/delete1.bto

# Verify that the user account to be deleted exists
delete2 : a.out
	echo "Running Test for delete2"
	./a.out < output/Delete/delete2.inp > output/Delete/delete2.bto

# Remove tickets for sale and pending purchases associated with the user account
delete3 : a.out
	echo "Running Test for delete3"
	./a.out < output/Delete/delete3.inp > output/Delete/delete3.bto

# Delete the user account and check that it no longer exists
delete4 : a.out
	echo "Running Test for delete4"
	./a.out < output/Delete/delete4.inp > output/Delete/delete4.bto

# ================================================
#                SELL TESTS
# ================================================

# Verify that the user has proper privileges
sell0 : a.out
	echo "Running Test for sell0"
	./a.out < output/Sell/sell0.inp > output/Sell/sell0.bto

# Verify that the event title given is valid (Max 25 characters)
sell1 : a.out
	echo "Running Test for sell1"
	./a.out < output/Sell/sell1.inp > output/Sell/sell1.bto

# Verify that the given sales price is valid (Max 999.99)
sell2 : a.out
	echo "Running Test for sell2"
	./a.out < output/Sell/sell2.inp > output/Sell/sell2.bto

# Check that number of tickets for sale is valid (Max 100)
sell3 : a.out
	echo "Running Test for sell3"
	./a.out < output/Sell/sell3.inp > output/Sell/sell3.bto

# Check that all information is stored into the daily transaction file
sell4 : a.out
	echo "Running Test for sell4"
	./a.out < output/Sell/sell4.inp > output/Sell/sell4.bto

# Check that no other transactions can occur until a new sell session is started
sell5 : a.out
	echo "Running Test for sell5"
	./a.out < output/Sell/sell5.inp > output/Sell/sell5.bto

# ================================================
#                BUY TESTS
# ================================================

# Verify that the user has proper privileges
buy0 : a.out
	echo "Running Test for buy0"
	./a.out < output/Buy/buy0.inp > output/Buy/buy0.bto

# Verify that no more than four tickets can be buy each transaction
buy1 : a.out
	echo "Running Test for buy1"
	./a.out < output/Buy/buy1.inp > output/Buy/buy1.bto

# Check the current title and enough ticket available
buy2 : a.out
	echo "Running Test for buy2"
	./a.out < output/Buy/buy2.inp > output/Buy/buy2.bto

# Verify the confirmation form of yes or no for purchasing the ticket
buy3 : a.out
	echo "Running Test for buy3"
	./a.out < output/Buy/buy3.inp > output/Buy/buy3.bto

## ================================================
#                REFUND TESTS
# ================================================

# Check for buyer’s and seller’s username and the amount of credit to transfer
refund0 : a.out
	echo "Running Test for refund0"
	./a.out < output/Refund/refund0.inp > output/Refund/refund0.bto

# Verify both buyer and seller as current users
refund1 : a.out
	echo "Running Test for refund1"
	./a.out < output/Refund/refund1.inp > output/Refund/refund1.bto

# Check if the information saved for the daily transaction file
refund2 : a.out
	echo "Running Test for refund2"
	./a.out < output/Refund/refund2.inp > output/Refund/refund2.bto

# Check the transfer amount of credit from seller’s credit balance to the buyer’s credit balance
refund3 : a.out
	echo "Running Test for refund3"
	./a.out < output/Refund/refund3.inp > output/Refund/refund3.bto

# ================================================
#                ADDCREDIT TESTS
# ================================================

# Check that the user is in admin mode
addcredit0 : a.out
	echo "Running Test for addcredit0"
	./a.out < output/AddCredit/addcredit0.inp > output/AddCredit/addcredit0.bto

# Verify the username and the amount of credit is added to that username.
addcredit1 : a.out
	echo "Running Test for addcredit1"
	./a.out < output/AddCredit/addcredit1.inp > output/AddCredit/addcredit1.bto

# Check if the information saved in daily transaction file
addcredit2 : a.out
	echo "Running Test for addcredit2"
	./a.out < output/AddCredit/addcredit2.inp > output/AddCredit/addcredit2.bto

# Verify that maximum $1000.00 can be added to an account
addcredit3 : a.out
	echo "Running Test for addcredit3"
	./a.out < output/AddCredit/addcredit3.inp > output/AddCredit/addcredit3.bto

