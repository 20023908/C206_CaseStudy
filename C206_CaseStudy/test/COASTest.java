import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class COASTest {
	
	
	// Dan
	private account user1;
	private account user2;
	
	private ArrayList<account> accountList = new ArrayList<account>();
	
	// JH
	
	
	// Nelly
			
			
	// Qid
			
			
	// GY
	private ArrayList<Deal> dealList = new ArrayList<Deal>();
	
	public COASTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		// Dan
		user1 = new account("Justin", "Buyer", "Justin@yahoo.com", "testing123");
		user2 = new account("Jasmine", "Seller", "Jasmine@yahoo.com", "testing321");

		accountList= new ArrayList<account>();
		
		// JH
		
		
		// Nelly
		
		
		// Qid
		
		
		// GY
		
	}

	// Dan
	@Test
	public void addUserTest() {
		
		assertNotNull("Check if there is valid account arraylist to add to", accountList);
		
		COAS.addUser(accountList, user1);
		
		assertEquals("Check that account arraylist size is 1", 1, accountList.size());
		assertSame("Check that user1 is added", user1, accountList.get(0));
		
		COAS.addUser(accountList, user2);
		assertEquals("Check that account arraylist size is 2", 2, accountList.size());
		assertSame("Check that user2 is added", user2, accountList.get(1));
	}
	
	@Test
	public void viewAllUserTest() {
		assertNotNull("Test if there is valid account arraylist to retrieve item", accountList);
		
		String user = COAS.retrieveUser(accountList);
		String testOutput = "";
		assertEquals("Check that viewAllUsers", testOutput, user);
		
		COAS.addUser(accountList, user1);
		COAS.addUser(accountList, user2);
		assertEquals("Test that account arraylist size is 2", 2, accountList.size());
		
		user = COAS.retrieveUser(accountList);
		testOutput = String.format("%-15s %-10s %s\n","Justin", "Buyer", "Justin@yahoo.com", "testing123");
		testOutput += String.format("%-15s %-10s %s\n","Jasmine", "Seller", "Jasmine@yahoo.com", "testing321" );
	
		assertEquals("Test that viewAllUsers", testOutput, user);
		
	}
	
	@Test
	public void doDeleteUserTest() {
		assertNotNull("test if there is valid account arraylist to loan from", accountList);
		
		COAS.addUser(accountList, user1);

		Boolean ok = COAS.doDeleteUser(accountList, "Justin@yahoo.com");
		assertTrue("Test if an account is ok to delete?", ok);

		ok = COAS.doDeleteUser(accountList, "Justin@yahoo.com");
		assertFalse("Test if an same account is NOT ok to delete again?", ok);	

		COAS.addUser(accountList, user2);	
		ok = COAS.doDeleteUser(accountList, "Jasmine@yahoo.com");
		assertTrue("Test that second account ok to delete?", ok);
		//error condition
		ok = COAS.doDeleteUser(accountList, "Jasmine@yahoo.co");
		assertFalse("Test that same account is NOT ok to delete again?", ok);
	}
	
	// JH
	
	
	// Nelly
			
			
	// Qid
			
			
	// GY
	
	@After
	public void tearDown() throws Exception {
		// Dan
		user1 = null;
		user2 = null;
		
		accountList = null;
		
		// JH
		
		
		// Nelly
				
				
		// Qid
				
				
		// GY
	}

}
