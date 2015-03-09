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

testLogin : testLogin0 testLogin1 testLogin2 testLogin3 testLogin4 testLogin5 testLogin6 testLogin7 testLogin8
testLogin0 : a.out
	echo "Running Test for Login"
	./a.out < login0.inp

testLogin1 : a.out

testLogin2 : a.out

testLogin3 : a.out

testLogin4 : a.out

testLogin5 : a.out

testLogin6 : a.out

testLogin7 : a.out

testLogin8 : a.out