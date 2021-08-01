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
	public void addUser() {
		
		assertNotNull("Check if there is valid account arraylist to add to", accountList);
		
		COAS.addUser(accountList, user1);
		
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
