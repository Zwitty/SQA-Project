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
	./a.out < login0.inp > output/Login/login0.bto

# Asks user for username
login1 : a.out
	echo "Running Test for login1"
	./a.out < login1.inp > output/Login/login1.bto

# Check if username exists
login2 : a.out
	echo "Running Test for login2"
	./a.out < login2.inp > output/Login/login2.bto

# Reads in the users account file
login3 : a.out
	echo "Running Test for login3"
	./a.out < login3.inp > output/Login/login3.bto


# Check if password matches the username password
login4 : a.out
	echo "Running Test for login4"
	./a.out < login4.inp > output/Login/login4.bto

# Test if we can login as a normal user
login5 : a.out
	echo "Running Test for login5"
	./a.out < login5.inp > output/Login/login5.bto

# Test if we can log in as an admin
login6 : a.out
	echo "Running Test for login6"
	./a.out < login6.inp > output/Login/login6.bto

# Test that we cannot make privileged transactions as a standard user
login7 : a.out
	echo "Running Test for login7"
	./a.out < login7.inp > output/Login/login7.bto

# Test that we can make privileged transactions as an admin user
login8 : a.out
	echo "Running Test for login8"
	./a.out < login8.inp > output/Login/login8.bto

# ================================================
#                LOGOUT TESTS
# ================================================

# Check if a user is currently logged in.
logout0 : a.out

# Write out the daily transaction file
logout1 : a.out

# Test if we can make another transaction
logout2 : a.out

# ================================================
#                CREATE TESTS
# ================================================

# Check if a user is logged in
create0 : a.out

# Ask user for username (Max 15 characters)
create1 : a.out

# Check if username is unique
create2 : a.out

# Ask user for a password (min 8 character, one must be uppercase)
create3 : a.out

# Ask user type(Full, Buy, Sell)
create4 : a.out

# Verify information has been saved to the daily transaction file
create5 : a.out

# Verify that there is a limit of $999,999 that can be credited to the account.
create6 : a.out

# ================================================
#                DELETE TESTS
# ================================================

# Check that no further transactions can be conducted by deleted user
delete0 : a.out

# Ask user for user account to be deleted
delete1 : a.out

# Verify that the user account to be deleted exists
delete2 : a.out

# Remove tickets for sale and pending purchases associated with the user account
delete3 : a.out

# Delete the user account and check that it no longer exists
delete4 : a.out

# ================================================
#                SELL TESTS
# ================================================

# Verify that the user has proper privileges
sell0 : a.out

# Verify that the event title given is valid (Max 25 characters)
sell1 : a.out

# Verify that the given sales price is valid (Max 999.99)
sell2 : a.out

# Check that number of tickets for sale is valid (Max 100)
sell3 : a.out

# Check that all information is stored into the daily transaction file
sell4 : a.out

# Check that no other transactions can occur until a new sell session is started
sell5 : a.out

# ================================================
#                BUY TESTS
# ================================================

# Verify that the user has proper privileges
buy0 : a.out

# Verify that no more than four tickets can be buy each transaction
buy1 : a.out

# Check the current title and enough ticket available
buy2 : a.out

# Verify the confirmation form of yes or no for purchasing the ticket
buy3 : a.out

## ================================================
#                REFUND TESTS
# ================================================

# Check for buyer’s and seller’s username and the amount of credit to transfer
refund0 : a.out

# Verify both buyer and seller as current users
refund1 : a.out

# Check if the information saved for the daily transaction file
refund2 : a.out

# Check the transfer amount of credit from seller’s credit balance to the buyer’s credit balance
refund3 : a.out

# ================================================
#                ADDCREDIT TESTS
# ================================================

# Check that the user is in admin mode
addcredit0 : a.out

# Verify the username and the amount of credit is added to that username.
addcredit1 : a.out

# Check if the information saved in daily transaction file
addcredit2 : a.out

# Verify that maximum $1000.00 can be added to an account
addcredit3 : a.out
