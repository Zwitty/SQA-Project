all : BackEnd.class

BackEnd.class : BackEnd.java
	javac User.java
	javac Ticket.java
	javac -cp . BackEnd.java
	javac -cp .:/usr/share/java/junit.jar TicketTest.java
	javac -cp .:/usr/share/java/junit.jar BackEndTest.java

clean : 
	rm -f *.class
				
test :
	java -cp . BackEnd

compileTest :
	java -cp .:/usr/share/java/junit.jar org.junit.runner.JUnitCore TicketTest
	java -cp .:/usr/share/java/junit.jar org.junit.runner.JUnitCore BackEndTest
