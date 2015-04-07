import junit.framework.TestCase;
import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
public class BackEndTest extends TestCase {

    public void testloadUsers() throws IOException {
        BackEnd.loadUsers();
        assertNotNull(BackEnd.userList);
    }

    public void testloadTickets() throws IOException {
        BackEnd.loadTickets();  
        assertNotNull(BackEnd.ticketList);
    }

    public void testfindTicket() throws IOException {
        User a = new User("FS", "userA", 100.00);
        User b = new User("SS", "userB", 100.00);
        Ticket tick = new Ticket(a, b, 10.00, 2, "TheWho");
        
        BackEnd.loadUsers();
        BackEnd.loadTickets();
        BackEnd.userList.add(a);
        BackEnd.userList.add(b);
        BackEnd.ticketList.add(tick);

        
        assertEquals("TheWho", BackEnd.findTicket("TheWho").getEventName());
    }

    public void testfindTicketPosition() {
        // setEvent("Nine Inch Nails");
        // assertEquals("Nine Inch Nails", event);
    }

    
    public void testfindUser() {
        // setSeller("James");
        // assertEquals("James", getSeller());
    }

    public void testfindUserPosition() {
        // setBuyer("Matt");
        // assertEquals("Matt", getBuyer());
    }

    public void testbuy() {
    }

    public void testsell() {
    }

    public void testaddCredit() {
    }

    public void testdeleteUser(){

    }

    public void testcreateUser(){

    }

    public void testrefund(){

    }

    public void writeTo(){

    }

    public void writeUsers(){

    }

    public void writeTickets(){

    }
}
