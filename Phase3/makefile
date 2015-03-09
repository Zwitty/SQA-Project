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

login : login0 login1 login2 login3 login4 login5 login6 login7 login8

# ================================================
#                LOGIN TESTS
# ================================================

#check if a current user is logged in
login0 : a.out
	echo "Running Test for Login"
	./a.out < login0.inp > output/Login/login0.bto


#Asks user for username
login1 : a.out

#Check if username exists
login2 : a.out

#reads in the users account file
login3 : a.out

#Check if password matches the username password
login4 : a.out

#Test if we can login as a normal user
login5 : a.out

#Test if we can log in as an admin
login6 : a.out

#Test that we cannot make privileged transactions as a standard user
login7 : a.out

#Test that we can make privileged transactions as an admin user
login8 : a.out

# ================================================
#                LOGOUT TESTS
# ================================================

#check if a user is currently logged in.
logout0 : a.out

#Write out the daily transaction file
logout1 : a.out

#Test if we can make another transaction
logout2 : a.out


