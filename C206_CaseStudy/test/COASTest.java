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
	private Deal deal1;
	private Deal deal2;
	
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
		deal1 = new Deal(12, "Spaceship Computer", "Jasmine@yahoo.com", "Justin@yahoo.com",
				1020.50, "08/12/2019");
		deal2 = new Deal(69, "Love Service 999", "balmond@gmail.com", "johnson@gmail.com",
				69.69, "20/05/2019");
		
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
	@Test
	public void addDeal() {
		
		//Test that the deal list is not null, so that a new deal can be added.
		assertNotNull("Check if there is valid deal arraylist to add to", dealList);
		
		//Test that given an empty list, after adding 1 deal, the size of the list is 1.
		//The deal just added is as same as the first deal of the list
		COAS.addDeal(dealList);
	}
	
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
