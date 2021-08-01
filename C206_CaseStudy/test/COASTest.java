import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

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
	
	
	// JH
	
	
	// Nelly
			
			
	// Qid
			
			
	// GY
	@Test
	public void addDealTest() {
		
		//Test that the deal list is not null, so that a new deal can be added.
		assertNotNull("Check if there is valid deal arraylist to add to", dealList);
		
		//Test that given an empty list, after adding 1 deal, the size of the list is 1.
		//The deal just added is as same as the first deal of the list
		COAS.addDeal(dealList, deal1);
		assertEquals("Check that Deal arraylist size is 1", 1, dealList.size());
		assertSame("Check that deal1 added is the same as 1st deal of the list", deal1, dealList.get(0));
		
		//Test that admin is able to add another deal, the size of the list is 2.
		//The deal just added is as same as the second deal of the list
		COAS.addDeal(dealList, deal2);
		assertEquals("Check that Deal arraylist size is 2", 2, dealList.size());
		assertSame("Check that deal2 added is the same as 2nd deal of the list", deal2, dealList.get(1));
		
	}
	
	public void retrieveAllDealsTest() {
		
		// Test that deal list is not null but empty.
		assertNotNull("Test if there is valid deal arraylist to retrieve deal", dealList);
		
		// Test if the list of deals retrieved from the main class is empty.
		String allDeals = COAS.retrieveAllDeals(dealList);
		String testOutput = "";
		assertEquals("Check that showAllDeals", testOutput, allDeals);
		
		// Given an empty list, after adding 2 items, test if the size of the list is 2
		COAS.addDeal(dealList, deal1);
		COAS.addDeal(dealList, deal2);
		assertEquals("Check that Deal arraylist size is 2", 2, dealList.size());
		
		assertNotNull("Test if deal list is not null after adding a deal", dealList);
		
		// test if the expected output string same as the list of camcorders retrieved
		// from the SourceCentre
		allDeals = COAS.retrieveAllDeals(dealList);
		testOutput = String.format("\n%-10s %-25s %-30s %-30s %-9s %11s", "12", "Spaceship Computer", 
				"Jasmine@yahoo.com", "Justin@yahoo.com", "1020.50", "08/12/2019");
		testOutput += String.format("\\n%-10s %-25s %-30s %-30s %-9s %11s", "69", "Love Service 999", 
				"balmond@gmail.com", "johnson@gmail.com", "69.69", "20/05/2019");

		assertEquals("Test that showAllDeals", testOutput, allDeals);
		
	}
	
	@Test
	public void doDeleteDealTest() {
		
		// Test that deal list cannot be null before deleting.
		assertNotNull("Test if there is valid deal arraylist to delete a deal", dealList);
		
		COAS.addDeal(dealList, deal1);
		
		// normal condition
		Boolean ok = COAS.doDeleteDeal(dealList, 12, 'y');
		assertTrue("Test that deal1's deal id entered must be the same as the deal id in the list", ok);
		
		// normal condition
		COAS.addDeal(dealList, deal1);
		ok = COAS.doDeleteDeal(dealList, 12, 'Y');
		assertTrue("Test that deal1's deal id entered must be the same as the deal id in the list", ok);
				
		//error condition
		ok = COAS.doDeleteDeal(dealList, 124, 'y');
		assertFalse("Test that deal1's deal id entered is NOT the same as the deal id in the list", ok);	
		
		// error condition
		ok = COAS.doDeleteDeal(dealList, 124, 'Y');
		assertFalse("Test that deal1's deal id entered is NOT the same as the deal id in the list", ok);
		
		// error condition
		ok = COAS.doDeleteDeal(dealList, 12, 'n');
		assertFalse("Test that deal1's deal id entered is NOT the same as the deal id in the list", ok);
		
		// error condition
		ok = COAS.doDeleteDeal(dealList, 124, 'N');
		assertFalse("Test that deal1's deal id entered is NOT the same as the deal id in the list", ok);
		
		// Test that size of deal list is reduced by 1 if deletion is successful.
		assertEquals("Check that Deal arraylist size is 0", 0, dealList.size());
		
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
		deal1 = null;
		deal2 = null;
		dealList = null;
	}

}
