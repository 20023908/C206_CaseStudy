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
	private item item1;
	private item item2;
	
	private ArrayList<item> itemList = new ArrayList<item>();
	
			
			
	// Qid
	private Bid bid1;
	private Bid bid2;
	
	private ArrayList<Bid> bidList;
			
			
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
		item1 = new item("mobile phone","Iphone6",600,"12/12/2020","12/12/2022",50);
		item2 = new item("laptop","ASUS",700,"10/12/2020","25/12/2022",20);
		
		// Qid
		bid1 = new Bid(1, "Spaceship Computer", 1000, "Jasmine@yahoo.com", "Justin@yahoo.com");
		bid2 = new Bid(2, "Love Service 999", 60, "balmond@gmail.com", "johnson@gmail.com");
		bidList = new ArrayList<Bid>();
		
		
		
		// GY
		deal1 = new Deal(12, "Spaceship Computer", "Jasmine@yahoo.com", "Justin@yahoo.com",
				1020.50, "08/12/2019");
		deal2 = new Deal(69, "Love Service 999", "balmond@gmail.com", "johnson@gmail.com",
				69.69, "20/05/2019");
		
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
	@Test
	public void viewAllItems() {
		//retrieve and display item list
		String item = COAS.retrieveAllItem(itemList);
		String testOutput = "";
		assertSame("test that able to viewAllItems", testOutput, item);
		  
		COAS.additem(itemList, item1);
		COAS.additem(itemList, item2);
		assertEquals("Test that item arraylist size is 2", 2, itemList.size());
	}
	@Test
	public void additem() {
		//retrieve and display item list
				String item = COAS.retrieveAllItem(itemList);
				String testOutput = "";
				assertSame("test that able to viewAllItems", testOutput, item);
				
				COAS.additem(itemList, item1);
				COAS.additem(itemList, item2);
				
				//normal
				assertNotNull("test if it is a valid item name", itemList);
				//error
				assertNotNull("test if it is an invalid item name", itemList);
				
				//normal
				assertSame("Test that item1 is added", item1, itemList.get(1));
				assertSame("Test that item2 is added", item2, itemList.get(1));

	}
	@Test
	public void doDeleteItem() {
		COAS.retrieveAllItem(itemList);
		COAS.additem(itemList, item1);
		COAS.additem(itemList, item2);
		
		assertNotNull("test that there is valid item arraylist to retrieve item", itemList);
		
		//normal
		boolean delete = COAS.doDeleteItem(itemList, "mobile phone",'y');
		assertTrue("test that item name matches with itemlist and cam be deleted",delete);
		
		//normal
		delete = COAS.doDeleteItem(itemList, "mobile phone",'Y');
		assertTrue("test that item name matches with itemlist and cam be deleted",delete);
	
		//error
		 delete = COAS.doDeleteItem(itemList, "mobile pphonee",'y');
		assertTrue("test that item name does not match with item name in itemlist and cannot be deleted",delete);
	
		//error
		 delete = COAS.doDeleteItem(itemList, "mobile pphonee",'Y');
		assertTrue("test that item name does not match with item name in itemlist and cannot be deleted",delete);
	
		
		
	}
			
			
	// Qid
	@Test
	public void addBidTest() {
		//BidList is not null so can add new item - boundary
		assertNotNull("Check if there is a valid Bid arraylist to add to", bidList);
		
		//Given an empty bidList, upon adding 1 item, size of list is 1 - normal
		COAS.addBid(bidList, bid1);
		assertEquals("Check that Bid arraylist size is 1", 1, bidList.size());
		//Check that item added matches first item in the list
		assertSame("Check that Bid is added", bid1, bidList.get(0));
		
		//Add another item, size of list is 2 - normal
		COAS.addBid(bidList, bid2);
		assertEquals("Check that Bid arraylist size is 2", 2, bidList.size());
		//Check that item added matches 2nd item in the list
		assertSame("Check that Bid is added", bid2, bidList.get(1));
	}
	@Test
	public void retrieveAllBidTest() {
		//test if bidList is not null but empty - boundary
		assertNotNull("Test if there is a valid Bid arraylist to retrieve bidding", bidList);
		
		//test if bidlist retrieved for COAS is empty - boundary
		String allBids = COAS.retrieveAllBids(bidList);
		String testOutput = "";
		assertEquals("Check that showAllBids", testOutput, allBids);
		
		//with an empty list, add 2 items, size of list = 2 (normal)
		COAS.addBid(bidList, bid1);
		COAS.addBid(bidList, bid2);
		assertEquals("Test that Bid arraylist size is 2", 2, bidList.size());
		
		//test if expected output matches the list for COAS 
		allBids = COAS.retrieveAllBids(bidList);
		testOutput = String.format("\n%-10s %-25s %-25s %-25s %s", "1", "Spaceship Computer", 
				"1000.00", "Jasmine@yahoo.com", "Justin@yahoo.com");
		testOutput += String.format("\n%-10s %-25s %-25s %-25s %s", "2", "Love Service 999", "60.00", 
				"balmond@gmail.com", "johnson@gmail.com");
		
		assertEquals("Test that showAllBids", testOutput, allBids);
	}
	@Test
	public void doDeleteBidTest() {
		//boundary
		assertNotNull("Test if there is a valid Bid arraylist to delete from", bidList);
		COAS.addBid(bidList, bid1);
		
		//test that id will be deleted when it matches item in bidlist(normal)
		Boolean ok = COAS.doDeleteBid(bidList, 1);
		assertTrue("Test if bid id will be deleted", ok);
		
		//test that id will not be deleted when it does not match item in bidlist(error)
		COAS.addBid(bidList, bid2);
		ok = COAS.doDeleteBid(bidList, 1);
		assertFalse("Test if bid id will NOT be deleted", ok);
		
	}	
			
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
		
		item1 = null;
		item2 = null;
		
		itemList = null;
				
				
		// Qid
		bid1 = null;
		bid2 = null;
		bidList = null;
				
				
		// GY
		deal1 = null;
		deal2 = null;
		dealList = null;
	}

}
