import static org.junit.Assert.*;

import org.junit.Test;


public class UserTest {

	@Test
	public void testUser() {
		User james = new User("AA", "James", 1000.00);
		assertEquals("AA", james.userType);
		assertEquals("James", james.name);
	}

	@Test
	public void testSetUserType() {
		User james = new User("AA", "James", 1000.00);
		assertEquals("AA", james.userType);
	}

	@Test
	public void testSetName() {
		User james = new User("AA", "James", 1000.00);
		assertEquals("James", james.name);
	}

	@Test
	public void testSetCredit() {
		User james = new User("AA", "James", 1000.00);
		assertEquals("set",1000.0, james.credit,0);
	}

	@Test
	public void testBuyTicket() {
		User james = new User("AA", "James", 1000.00);
		james.buyTicket(100.00);
		assertEquals("buy",900.00, james.credit, 0);
	}

	@Test
	public void testSellTicket() {
		User james = new User("AA", "James", 1000.00);
		james.sellTicket(100.00);
		assertEquals("sell",1100.00, james.getCredit(),0);
	}

	@Test
	public void testGetUserType() {
		User james = new User("AA", "James", 1000.00);
		assertEquals("AA", james.getUserType());
	}

	@Test
	public void testGetName() {
		User james = new User("AA", "James", 1000.00);
		assertEquals("James", james.getName());
	}

	@Test
	public void testGetCredit() {
		User james = new User("AA", "James", 1000.00);
		assertEquals("getCredit",1000.00, james.getCredit(),0);
	}

}
