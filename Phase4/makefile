all : BackEnd.class

BackEnd.class : BackEnd.java
	javac BackEnd.java
	javac User.java
	javac Ticket.java

clean : 
	rm -f *.class
				
test :
	java BackEnd
