import junit.framework.TestCase;
import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
public class TicketTest extends TestCase {

	public void testTicket() {
		User james = new User("FS", "James", 1000.00);
		User matt = new User("SS", "Matt", 1000.00);
		Ticket ticket = new Ticket(james, matt, 100.0, 4, "Nine Inch Nails");
		assertEquals("James" , ticket.seller.name);
		assertEquals("Matt", ticket.buyer.name);
		assertEquals(100.0, ticket.price);
		assertEquals(4, ticket.quantity);
	}

	@Test
	public void testSetSeller() {
		User james = new User("FS", "James", 1000.00);
		User matt = new User("SS", "Matt", 1000.00);
		Ticket ticket = new Ticket(james, matt, 100, 2, "Nine Inch Nails");
		assertEquals("James", ticket.seller.name);
	}

	@Test
	public void testSetBuyer() {
		User james = new User("FS", "James", 1000.00);
		User matt = new User("SS", "Matt", 1000.00);
		Ticket ticket = new Ticket(james, matt, 100, 2, "Nine Inch Nails");
		assertEquals("Matt", ticket.buyer.name);
	}

	@Test
	public void testSetPrice() {
		User james = new User("FS", "James", 1000.00);
		User matt = new User("SS", "Matt", 1000.00);
		Ticket ticket = new Ticket(james, matt, 100.0, 2, "Nine Inch Nails");
		assertEquals(100.0, ticket.price);
	}

	@Test
	public void testSetQuantity() {
		User james = new User("FS", "James", 1000.00);
		User matt = new User("SS", "Matt", 1000.00);
		Ticket ticket = new Ticket(james, matt, 100, 2, "Nine Inch Nails");
		assertEquals(2, ticket.quantity);
	}

	@Test
	public void testSetEventName() {
		User james = new User("FS", "James", 1000.00);
		User matt = new User("SS", "Matt", 1000.00);
		Ticket ticket = new Ticket(james, matt, 100, 2, "Nine Inch Nails");
		assertEquals("Nine Inch Nails", ticket.eventName);
	}

	@Test
	public void testGetSeller() {
		User james = new User("FS", "James", 1000.00);
		User matt = new User("SS", "Matt", 1000.00);
		Ticket ticket = new Ticket(james, matt, 100, 2, "Nine Inch Nails");
		assertEquals("James", ticket.getSeller().name);
	}

	@Test
	public void testGetBuyer() {
		User james = new User("FS", "James", 1000.00);
		User matt = new User("SS", "Matt", 1000.00);
		Ticket ticket = new Ticket(james, matt, 100, 2, "Nine Inch Nails");
		assertEquals("Matt", ticket.getBuyer().name);
	}

	@Test
	public void testGetPrice() {
		User james = new User("FS", "James", 1000.00);
		User matt = new User("SS", "Matt", 1000.00);
		Ticket ticket = new Ticket(james, matt, 100.0, 2, "Nine Inch Nails");
		assertEquals(100.0, ticket.getPrice());
	}

	@Test
	public void testGetQuantity() {
		User james = new User("FS", "James", 1000.00);
		User matt = new User("SS", "Matt", 1000.00);
		Ticket ticket = new Ticket(james, matt, 100, 2, "Nine Inch Nails");
		assertEquals(2, ticket.getQuantity());
	}

	@Test
	public void testGetEventName() {
		User james = new User("FS", "James", 1000.00);
		User matt = new User("SS", "Matt", 1000.00);
		Ticket ticket = new Ticket(james, matt, 100, 2, "Nine Inch Nails");
		assertEquals("Nine Inch Nails" , ticket.getEventName());
	}
}
