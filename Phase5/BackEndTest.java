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

    public void testfindTicketPosition() throws IOException{
        
        User a = new User("FS", "userA", 100.00);
        User b = new User("SS", "userB", 100.00);
        Ticket tick = new Ticket(a, b, 10.00, 2, "TheWho");
        
        BackEnd.userList.add(a);
        BackEnd.userList.add(b);
        BackEnd.ticketList.add(tick);
        
        assertEquals("Ticket Position", 0, BackEnd.findTicketPosition("TheWho"), 0);
    }

    
    public void testfindUser() throws IOException {
        User a = new User("FS", "userA", 100.00);
        
        BackEnd.userList.add(a);
        
        assertEquals("userA", BackEnd.findUser("userA").getName());
    
    }

    public void testfindUserPosition() throws IOException{
        User a = new User("FS", "userA", 100.00);
        
        BackEnd.userList.add(a);
        
        assertEquals("User Position",0, BackEnd.findUserPosition("userA"), 0);
    }

}
