import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import skeletonvibes.Bid;
import skeletonvibes.Helper;

public class COAS {

	private ArrayList<account> accountList = new ArrayList<account>();
	private ArrayList<Deal> dealList = new ArrayList<Deal>();
	private ArrayList<Bid> bidList = new ArrayList<Bid>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		COAS application = new COAS();
		application.start();
	}

	private void start() {

		account buyer1 = new account("Justin", "Buyer", "Justin@yahoo.com", "testing123");
		account seller1 = new account("Jasmine", "Seller", "Jasmine@yahoo.com", "testing321");

		accountList.addAll(Arrays.asList(buyer1, seller1));

		int option = 0;
		while (option != 4) {

			viewMenu();
			option = Helper.readInt("Enter option > ");

			if (option == 1) {

				COAS.setHeader("ADD");
				COAS.menuType();

				int type = Helper.readInt("Enter option to select menu type > ");

				if (type == 1) {
					// dan add method
					account user = inputUser();
					COAS.addUser(accountList, user);

				} else if (type == 2) {
					// jh add method

				} else if (type == 3) {
					// nelly add method

				} else if (type == 4) {
					// qid add method
					addBid(bidList);

				} else if (type == 5) {
					// gy add method
					addDeals(dealList);

				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 2) {

				COAS.setHeader("VIEW ALL");
				COAS.menuType();

				int type = Helper.readInt("Enter option to select menu type > ");

				if (type == 1) {
					// dan view method
					COAS.setHeader("VIEW ALL USERS");
					COAS.viewAllUsers(accountList);

				} else if (type == 2) {
					// jh view method

				} else if (type == 3) {
					// nelly view method

				} else if (type == 4) {
					// qid view method
					viewBid(bidList);

				} else if (type == 5) {
					// gy view method
					showAllDeals(dealList);

				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 3) {

				COAS.setHeader("DELETE");
				COAS.menuType();

				int type = Helper.readInt("Enter option to select menu type > ");

				if (type == 1) {
					// dan delete method
					COAS.DeleteUser(accountList);

				} else if (type == 2) {
					// jh delete method

				} else if (type == 3) {
					// nelly delete method

				} else if (type == 4) {
					// qid delete method
					deleteID(bidList);

				} else if (type == 5) {
					// gy delete method

				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 4) {
				System.out.println("Thank for using the application!");
			} else {
				System.out.println("Invalid Option!");
			}
		}

	}

	public static void viewMenu() {
		COAS.setHeader("CAMPUS Online Auction Shop (COAS)");
		System.out.println("1. ADD");
		System.out.println("2. VIEW");
		System.out.println("3. DELETE");
		System.out.println("4. QUIT");
		Helper.line(120, "-");
	}

	public static void setHeader(String header) {
		Helper.line(120, "-");
		System.out.println(header);
		Helper.line(120, "-");
	}

	public static void menuType() {
		System.out.println("1. User");
		System.out.println("2. Category");
		System.out.println("3. Item");
		System.out.println("4. Bid");
		System.out.println("5. Deal");
	}

	// (1) dan user

	public static account inputUser() {
		COAS.setHeader("Add User Account");
		
		String user = Helper.readString("Enter name > ");
		String role = Helper.readString("Enter role (Buyer/Seller) > ");
		String email = Helper.readString("Enter email > ");
		String password = Helper.readString("Enter password > ");

		account user1 = new account(user, role, email, password);
		return user1;
	}

	public static void addUser(ArrayList<account> accountList, account user1) {

		for (account i : accountList) {
			if (i.getEmail().equalsIgnoreCase(user1.getEmail())) {
				System.out.println(user1.getRole() + "account with email: " + user1.getEmail() + " already exist!");
				break;
			} else {
				if (user1.getPassword().length() < 8) {
					System.out.println("Password must be more than 8 characters long!");
					break;
				} else {
					accountList.add(user1);
					System.out.println(user1.getRole() + " account added");
					break;
				}
			}
		}
	}

	public static String retrieveUser(ArrayList<account> accountList) {
		String outputUser = "";

		for (account p : accountList) {

			if (p.getRole().equalsIgnoreCase("buyer"))
				outputUser += String.format("%-15s %-10s %s\n", p.getName(), p.getRole(), p.getEmail());
			else if (p.getRole().equalsIgnoreCase("seller"))
				outputUser += String.format("%-15s %-10s %s\n", p.getName(), p.getRole(), p.getEmail());

		}

		return outputUser;
	}

	public static void viewAllUsers(ArrayList<account> accountList) {
		String outputUser = String.format("%-15s %-10s %s\n", "Name", "Role", "Email");
		outputUser += retrieveUser(accountList);
		System.out.println(outputUser);
	}
	
	public static boolean doDeleteUser(ArrayList<account> accountList, String inputEmail) {
		
		boolean isDeleted = false;
		
		for (account i : accountList) {
			
			String email = i.getEmail();
			
			if (inputEmail.equalsIgnoreCase(email)) {
				accountList.remove(i);
				isDeleted = true;
				break;
			}
		}

		return isDeleted;
	}

	public static void DeleteUser(ArrayList<account> accountList) {
		COAS.setHeader("DELETE USER ACCOUNT");
		COAS.viewAllUsers(accountList);
		String email = Helper.readString("Enter email to delete > ");
		Boolean isDeleted = doDeleteUser(accountList, email);
		if (isDeleted == false) {
			System.out.println("Account with email: " + email + " does not exist!");
		} else {
			System.out.println("Account with email: " + email + " deleted successfully!");
		}
	}

	// (2) jh category

	// (3) nelly item

	// (4) qid bid
	private static int bidCount = 0;
	
	public static void addBid(ArrayList<Bid> bidList) {
		Helper.line(35, "-");
		System.out.println("Add bid");
		Helper.line(35, "-");
		bidCount++;
		String itemName = Helper.readString("Item to Bid > ");
		double bidPrice = Helper.readDouble("Amount to Bid > ");
		String buyerEmail = Helper.readString("Enter Buyer's Email > ");
		String sellerEmail = Helper.readString("Enter Seller's Email > ");
		
		bidList.add(new Bid(bidCount, itemName,bidPrice,buyerEmail,sellerEmail));	
	}
	
	public static void viewBid(ArrayList<Bid> bidList) {
		Helper.line(35, "-");
		System.out.println("View bid");
		Helper.line(35, "-");
		String output = String.format("%-10s %-10s %-18s %-18s %-18s\n", "BID ID", "ITEM NAME", "BID AMOUNT", "BUYER'S EMAIL", "SELLER'S EMAIL");
		for (Bid B : bidList) {
			output += String.format("%-10d %-10s $%-18.2f %-18s %-18s\n", B.getBidID(), B.getItemName(), B.getBidAmt(), B.getBuyerEmail(), B.getSellerEmail());
		}
		System.out.println(output);
	}
	
	public static boolean searchBid(ArrayList<Bid> bidList, int deleteID) {
		boolean available = false;
		for (int i = 0; i < bidList.size(); i++) {
			if (deleteID == bidList.get(i).getBidID()) {
				bidList.remove(i);
				available = true;
			}
		}
		return available;
	}
	
	public static void deleteID(ArrayList<Bid> bidList) {
		Helper.line(35, "-");
		System.out.println("Delete bid");
		Helper.line(35, "-");
		int deleteID = Helper.readInt("Enter Bid ID to delete > ");
		boolean available = searchBid(bidList, deleteID);
		
		if (available == false) {
			System.out.println("Invalid Bid ID");
		}
		else {
			System.out.println("Bid ID " + deleteID + " deleted!");
		}
	}

	// (5) gy deal

	private void addDeals(ArrayList<Deal> dealList) {
		Helper.line(120, "-");
		System.out.println("Add new deal");
		Helper.line(120, "-");

		int dealID = Helper.readInt("Enter deal ID > ");
		String itemName = Helper.readString("Enter item name > ");
		String sellerEmail = Helper.readString("Enter seller's email > ");
		String buyerEmail = Helper.readString("Enter buyer's email > ");
		double price = Helper.readDouble("Enter transaction price > ");
		String closeDate = Helper.readString("Enter close deal (DD/MM/YYYY) > ");

		if (itemName.isEmpty() || sellerEmail.isEmpty() || buyerEmail.isEmpty() || closeDate.isEmpty()) {
			System.out.println("Please fill in all the required fields!");
		} else {
			Deal deal1 = new Deal(dealID, itemName, sellerEmail, buyerEmail, price, closeDate);
			dealList.add(deal1);
			System.out.println("Successfully added a new deal!");
		}
	}

	private void showAllDeals(ArrayList<Deal> dealList) {
		Helper.line(120, "-");
		System.out.println("Show All Deals");
		Helper.line(120, "-");

		System.out.println(String.format("%-10s %-15s %-25s %-25s %-9s %11s", "DEAL ID", "ITEM NAME", "SELLER EMAIL",
				"BUYER EMAIL", "PRICE", "CLOSE DATE"));

		for (Deal d : dealList) {
			d.displayInfo();
		}
	}

}
