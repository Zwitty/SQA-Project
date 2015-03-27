all : BackEnd.class

BackEnd.class : BackEnd.java
	javac User.java
	javac Ticket.java
	javac -cp . BackEnd.java

clean : 
	rm -f *.class
				
test :
	java -cp . BackEnd
