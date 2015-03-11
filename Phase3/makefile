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

testAndCheck : testAll testCheck

testAll : login logout create delete buy refund addcredit

testCheck : loginCheck logoutCheck createCheck deleteCheck buyCheck refundCheck addcreditCheck

# ================================================
#                ALL TESTS
# ================================================

login : login0 login1 login2 login3 login4 login5 login6 login7 login8

loginCheck : login0Check login1Check login2Check login3Check login4Check login5Check login6Check login7Check login8Check

logout : logout0 logout1 logout2

logoutCheck : logout0Check logout1Check logout2Check

create : create0 create1 create2 create3 create4 create5 create6

createCheck : create0Check create1Check create2Check create3Check create4Check create5Check create6Check

delete : delete0 delete1 delete2 delete3 delete4

deleteCheck : delete0Check delete1Check delete2Check delete3Check delete4Check

sell : sell0 sell1 sell2 sell3 sell4 sell5

sellCheck : sell0Check sell1Check sell2Check sell3Check sell4Check sell5Check

buy : buy0 buy1 buy2 buy3

buyCheck : buy0Check buy1Check buy2Check buy3Check

refund : refund0 refund1 refund2 refund3

refundCheck : refund0Check refund1Check refund2Check refund3Check

addcredit : addcredit0 addcredit1 addcredit2 addcredit3

addcreditCheck : addcredit0Check addcredit1Check addcredit2Check addcredit3Check

# ================================================
#                LOGIN TESTS
# ================================================

# check if a current user is logged in
login0 : a.out
	echo "Running Test for login0"
	./a.out < output/Login/login0.inp > output/Login/login0.bto

login0Check : login0
	echo "Checking outputs of test login0"
	diff output/Login/login0.etf output/Login/login0.bto

# Asks user for username
login1 : a.out
	echo "Running Test for login1"
	./a.out < output/Login/login1.inp > output/Login/login1.bto

login1Check : login1
	echo "Checking outputs of test login1"
	diff output/Login/login1.etf output/Login/login1.bto

# Check if username exists
login2 : a.out
	echo "Running Test for login2"
	./a.out < output/Login/login2.inp > output/Login/login2.bto

login2Check : login2
	echo "Checking outputs of test login2"
	diff output/Login/login2.etf output/Login/login2.bto

# Reads in the users account file
login3 : a.out
	echo "Running Test for login3"
	./a.out < output/Login/login3.inp > output/Login/login3.bto

login3Check : login3
	echo "Checking outputs of test login3"
	diff output/Login/login3.etf output/Login/login3.bto

# Check if password matches the username password
login4 : a.out
	echo "Running Test for login4"
	./a.out < output/Login/login4.inp > output/Login/login4.bto

login4Check : login4
	echo "Checking outputs of test login4"
	diff output/Login/login4.etf output/Login/login4.bto

# Test if we can login as a normal user
login5 : a.out
	echo "Running Test for login5"
	./a.out < output/Login/login5.inp > output/Login/login5.bto

login5Check : login5
	echo "Checking outputs of test login5"
	diff output/Login/login5.etf output/Login/login5.bto

# Test if we can log in as an admin
login6 : a.out
	echo "Running Test for login6"
	./a.out < output/Login/login6.inp > output/Login/login6.bto

login6Check : login6
	echo "Checking outputs of test login6"
	diff output/Login/login6.etf output/Login/login6.bto

# Test that we cannot make privileged transactions as a standard user
login7 : a.out
	echo "Running Test for login7"
	./a.out < output/Login/login7.inp > output/Login/login7.bto

login7Check : login7
	echo "Checking outputs of test login7"
	diff output/Login/login7.etf output/Login/login7.bto

# Test that we can make privileged transactions as an admin user
login8 : a.out
	echo "Running Test for login8"
	./a.out < output/Login/login8.inp > output/Login/login8.bto

login8Check : login6
	echo "Checking outputs of test login8"
	diff output/Login/login8.etf output/Login/login8.bto

# ================================================
#                LOGOUT TESTS
# ================================================

# Check if a user is currently logged in.
logout0 : a.out
	echo "Running Test for logout0"
	./a.out < output/Logout/logout0.inp > output/Logout/logout0.bto

logout0Check : logout0
	echo "Checking outputs of test logout0"
	diff output/Logout/logout0.etf output/Logout/logout0.bto

# Write out the daily transaction file
logout1 : a.out
	echo "Running Test for logout1"
	./a.out < output/Logout/logout1.inp > output/Logout/logout1.bto

logout1Check : logout1
	echo "Checking outputs of test logout1"
	diff output/Logout/logout1.etf output/Logout/logout1.bto

# Test if we can make another transaction
logout2 : a.out
	echo "Running Test for logout2"
	./a.out < output/Logout/logout2.inp > output/Logout/logout2.bto

logout2Check : logout2
	echo "Checking outputs of test logout2"
	diff output/Logout/logout2.etf output/Logout/logout2.bto

# ================================================
#                CREATE TESTS
# ================================================

# Check if a user is logged in
create0 : a.out
	echo "Running Test for create0"
	./a.out < output/Create/create0.inp > output/Create/create0.bto

create0Check : create0
	echo "Checking outputs of test create0"
	diff output/Create/create0.etf output/Create/create0.bto

# Ask user for username (Max 15 characters)
create1 : a.out
	echo "Running Test for create1"
	./a.out < output/Create/create1.inp > output/Create/create1.bto

create1Check : create1
	echo "Checking outputs of test create1"
	diff output/Create/create1.etf output/Create/create1.bto

# Check if username is unique
create2 : a.out
	echo "Running Test for create2"
	./a.out < output/Create/create2.inp > output/Create/create2.bto

create2Check : create2
	echo "Checking outputs of test create2"
	diff output/Create/create2.etf output/Create/create2.bto

# Ask user for a password (min 8 character, one must be uppercase)
create3 : a.out
	echo "Running Test for create3"
	./a.out < output/Create/create3.inp > output/Create/create3.bto

create3Check : create3
	echo "Checking outputs of test create3"
	diff output/Create/create3.etf output/Create/create3.bto

# Ask user type(Full, Buy, Sell)
create4 : a.out
	echo "Running Test for create4"
	./a.out < output/Create/create4.inp > output/Create/create4.bto

create4Check : create4
	echo "Checking outputs of test create4"
	diff output/Create/create4.etf output/Create/create4.bto

# Verify information has been saved to the daily transaction file
create5 : a.out
	echo "Running Test for create5"
	./a.out < output/Create/create5.inp > output/Create/create5.bto

create5Check : create5
	echo "Checking outputs of test create5"
	diff output/Create/create5.etf output/Create/create5.bto

# Verify that there is a limit of $999,999 that can be credited to the account.
create6 : a.out
	echo "Running Test for create6"
	./a.out < output/Create/create6.inp > output/Create/create6.bto

create6Check : create6
	echo "Checking outputs of test create6"
	diff output/Create/create6.etf output/Create/create6.bto

# ================================================
#                DELETE TESTS
# ================================================

# Check that no further transactions can be conducted by deleted user
delete0 : a.out
	echo "Running Test for delete0"
	./a.out < output/Delete/delete0.inp > output/Delete/delete0.bto

delete0Check : delete0
	echo "Checking outputs of test delete0"
	diff output/Delete/delete0.etf output/Delete/delete0.bto

# Ask user for user account to be deleted
delete1 : a.out
	echo "Running Test for delete1"
	./a.out < output/Delete/delete1.inp > output/Delete/delete1.bto

delete1Check : delete1
	echo "Checking outputs of test delete1"
	diff output/Delete/delete1.etf output/Delete/delete1.bto

# Verify that the user account to be deleted exists
delete2 : a.out
	echo "Running Test for delete2"
	./a.out < output/Delete/delete2.inp > output/Delete/delete2.bto

delete2Check : delete2
	echo "Checking outputs of test delete2"
	diff output/Delete/delete2.etf output/Delete/delete2.bto

# Remove tickets for sale and pending purchases associated with the user account
delete3 : a.out
	echo "Running Test for delete3"
	./a.out < output/Delete/delete3.inp > output/Delete/delete3.bto

delete3Check : delete3
	echo "Checking outputs of test delete3"
	diff output/Delete/delete3.etf output/Delete/delete3.bto

# Delete the user account and check that it no longer exists
delete4 : a.out
	echo "Running Test for delete4"
	./a.out < output/Delete/delete4.inp > output/Delete/delete4.bto

delete4Check : delete4
	echo "Checking outputs of test delete4"
	diff output/Delete/delete4.etf output/Delete/delete4.bto

# ================================================
#                SELL TESTS
# ================================================

# Verify that the user has proper privileges
sell0 : a.out
	echo "Running Test for sell0"
	./a.out < output/Sell/sell0.inp > output/Sell/sell0.bto

sell0Check : sell0
	echo "Checking outputs of test sell0"
	diff output/Sell/sell0.etf output/Sell/sell0.bto

# Verify that the event title given is valid (Max 25 characters)
sell1 : a.out
	echo "Running Test for sell1"
	./a.out < output/Sell/sell1.inp > output/Sell/sell1.bto

sell1Check : sell1
	echo "Checking outputs of test sell1"
	diff output/Sell/sell1.etf output/Sell/sell1.bto

# Verify that the given sales price is valid (Max 999.99)
sell2 : a.out
	echo "Running Test for sell2"
	./a.out < output/Sell/sell2.inp > output/Sell/sell2.bto

sell2Check : sell2
	echo "Checking outputs of test sell2"
	diff output/Sell/sell2.etf output/Sell/sell2.bto

# Check that number of tickets for sale is valid (Max 100)
sell3 : a.out
	echo "Running Test for sell3"
	./a.out < output/Sell/sell3.inp > output/Sell/sell3.bto

sell3Check : sell3
	echo "Checking outputs of test sell3"
	diff output/Sell/sell3.etf output/Sell/sell3.bto

# Check that all information is stored into the daily transaction file
sell4 : a.out
	echo "Running Test for sell4"
	./a.out < output/Sell/sell4.inp > output/Sell/sell4.bto

sell4Check : sell4
	echo "Checking outputs of test sell4"
	diff output/Sell/sell4.etf output/Sell/sell4.bto

# Check that no other transactions can occur until a new sell session is started
sell5 : a.out
	echo "Running Test for sell5"
	./a.out < output/Sell/sell5.inp > output/Sell/sell5.bto

sell5Check : sell5
	echo "Checking outputs of test sell5"
	diff output/Sell/sell5.etf output/Sell/sell5.bto

# ================================================
#                BUY TESTS
# ================================================

# Verify that the user has proper privileges
buy0 : a.out
	echo "Running Test for buy0"
	./a.out < output/Buy/buy0.inp > output/Buy/buy0.bto

buy0Check : buy0
	echo "Checking outputs of test buy0"
	diff output/Buy/buy0.etf output/Buy/buy0.bto

# Verify that no more than four tickets can be buy each transaction
buy1 : a.out
	echo "Running Test for buy1"
	./a.out < output/Buy/buy1.inp > output/Buy/buy1.bto

buy1Check : buy1
	echo "Checking outputs of test buy1"
	diff output/Buy/buy1.etf output/Buy/buy1.bto

# Check the current title and enough ticket available
buy2 : a.out
	echo "Running Test for buy2"
	./a.out < output/Buy/buy2.inp > output/Buy/buy2.bto

buy2Check : buy2
	echo "Checking outputs of test buy2"
	diff output/Buy/buy2.etf output/Buy/buy2.bto

# Verify the confirmation form of yes or no for purchasing the ticket
buy3 : a.out
	echo "Running Test for buy3"
	./a.out < output/Buy/buy3.inp > output/Buy/buy3.bto

buy3Check : buy3
	echo "Checking outputs of test buy3"
	diff output/Buy/buy3.etf output/Buy/buy3.bto

## ================================================
#                REFUND TESTS
# ================================================

# Check for buyer’s and seller’s username and the amount of credit to transfer
refund0 : a.out
	echo "Running Test for refund0"
	./a.out < output/Refund/refund0.inp > output/Refund/refund0.bto

refund0Check : refund0
	echo "Checking outputs of test refund0"
	diff output/Refund/refund0.etf output/Refund/refund0.bto

# Verify both buyer and seller as current users
refund1 : a.out
	echo "Running Test for refund1"
	./a.out < output/Refund/refund1.inp > output/Refund/refund1.bto

refund1Check : refund1
	echo "Checking outputs of test refund1"
	diff output/Refund/refund1.etf output/Refund/refund1.bto

# Check if the information saved for the daily transaction file
refund2 : a.out
	echo "Running Test for refund2"
	./a.out < output/Refund/refund2.inp > output/Refund/refund2.bto

refund2Check : refund2
	echo "Checking outputs of test refund2"
	diff output/Refund/refund2.etf output/Refund/refund2.bto

# Check the transfer amount of credit from seller’s credit balance to the buyer’s credit balance
refund3 : a.out
	echo "Running Test for refund3"
	./a.out < output/Refund/refund3.inp > output/Refund/refund3.bto

refund3Check : refund3
	echo "Checking outputs of test refund3"
	diff output/Refund/refund3.etf output/Refund/refund3.bto

# ================================================
#                ADDCREDIT TESTS
# ================================================

# Check that the user is in admin mode
addcredit0 : a.out
	echo "Running Test for addcredit0"
	./a.out < output/AddCredit/addcredit0.inp > output/AddCredit/addcredit0.bto

addcredit0Check : addcredit0
	echo "Checking outputs of test addcredit0"
	diff output/AddCredit/addcredit0.etf output/AddCredit/addcredit0.bto

# Verify the username and the amount of credit is added to that username.
addcredit1 : a.out
	echo "Running Test for addcredit1"
	./a.out < output/AddCredit/addcredit1.inp > output/AddCredit/addcredit1.bto

addcredit1Check : addcredit1
	echo "Checking outputs of test addcredit1"
	diff output/AddCredit/addcredit1.etf output/AddCredit/addcredit1.bto

# Check if the information saved in daily transaction file
addcredit2 : a.out
	echo "Running Test for addcredit2"
	./a.out < output/AddCredit/addcredit2.inp > output/AddCredit/addcredit2.bto

addcredit2Check : addcredit2
	echo "Checking outputs of test addcredit2"
	diff output/AddCredit/addcredit2.etf output/AddCredit/addcredit2.bto

# Verify that maximum $1000.00 can be added to an account
addcredit3 : a.out
	echo "Running Test for addcredit3"
	./a.out < output/AddCredit/addcredit3.inp > output/AddCredit/addcredit3.bto

addcredit3Check : addcredit3
	echo "Checking outputs of test addcredit3"
	diff output/AddCredit/addcredit3.etf output/AddCredit/addcredit3.bto