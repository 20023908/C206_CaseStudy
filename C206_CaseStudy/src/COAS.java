import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class COAS {

	private ArrayList<account> accountList = new ArrayList<account>();
	private ArrayList<Deal> dealList = new ArrayList<Deal>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		COAS application = new COAS();
		application.start();
	}

	private void start() {

		account buyer1 = new account("Justin", "Buyer", "Justin@yahoo.com", "testing123");
		account seller1 = new account("Jasmine", "Seller", "Jasmine@yahoo.com", "testing321");
		
		accountList.addAll(Arrays.asList(buyer1,seller1));
		
		dealList.add(new Deal(12, "Spaceship Computer", "Jasmine@yahoo.com", "Justin@yahoo.com",
				1020.50, "08/12/2019"));
		dealList.add(new Deal(69, "Love Service 999", "balmond@gmail.com", "johnson@gmail.com",
				69.69, "20/05/2019"));


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
					String email = user.getEmail();
					COAS.addUser(accountList, user, email);

				} else if (type == 2) {
					// jh add method

				} else if (type == 3) {
					// nelly add method

				} else if (type == 4) {
					// qid add method

				} else if (type == 5) {

					//gy add method
					Deal deal1 = inputDeal();
					COAS.addDeal(dealList, deal1);


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

				} else if (type == 5) {
					// gy view method
					COAS.setHeader("Show All Deals");
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

				} else if (type == 5) {

					//gy delete method
					deleteDeal(dealList);

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

	public static void addUser(ArrayList<account> accountList, account user1, String email) {
		
		for (account a : accountList) {
			email = a.getEmail();
		}
		if (!user1.getEmail().equalsIgnoreCase(email) && user1.getPassword().length() > 8) {
			accountList.add(user1);
			System.out.println(user1.getRole() + " account added");

		}
		if (user1.getEmail().equalsIgnoreCase(email)) {
			System.out.println(user1.getRole() + " account with email: " + user1.getEmail() + " already exist!");
		}
		if (user1.getPassword().length() < 8) {
			System.out.println("Password must be more than 8 characters long!");
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

	
	// (5) gy deal

	public static Deal inputDeal() {
		COAS.setHeader("Add New Deal");
		
		int dealID = Helper.readInt("Enter deal ID > ");
		String itemName = Helper.readString("Enter item name > ");
		String sellerEmail = Helper.readString("Enter seller's email > ");
		String buyerEmail = Helper.readString("Enter buyer's email > ");
		double price = Helper.readDouble("Enter transaction price > ");
		String closeDate = Helper.readString("Enter close deal (DD/MM/YYYY) > ");
		
		Deal deal1 = new Deal(dealID, itemName, sellerEmail, buyerEmail, price, closeDate);
		return deal1;
		
	}

	public static void addDeal(ArrayList<Deal> dealList, Deal deal1) {
		
		if (deal1.getItemName().isEmpty() || deal1.getSellerEmail().isEmpty() 
				|| deal1.getBuyerEmail().isEmpty() || deal1.getCloseDate().isEmpty()) {
			System.out.println("Please fill in all the required fields!");
		}
		else {
			dealList.add(deal1);
			System.out.println("Successfully added a new deal!");
		}
		
	}
	
	public static String retrieveAllDeals(ArrayList<Deal> dealList) {
		String output = "";

		for (Deal d : dealList) {

			output += String.format("\n%-10d %-25s %-30s %-30s %-9.2f %11s", 
					d.getDealID(), d.getItemName(), d.getSellerEmail(), d.getBuyerEmail(),
					d.getPrice(), d.getCloseDate());
		}
		return output;
	}
	
	public static void showAllDeals(ArrayList<Deal> dealList) {
		
		String output = String.format("%-10s %-25s %-30s %-30s %-9s %11s", "DEAL ID", "ITEM NAME", "SELLER EMAIL",
				"BUYER EMAIL", "PRICE", "CLOSE DATE");
		output += retrieveAllDeals(dealList);
		System.out.println(output);
	
	}
	
	public static boolean doDeleteDeal(ArrayList<Deal> dealList, int dealID, char cfm) {

		boolean isDeleted = false;

		for (Deal d : dealList) {
			if (dealID == d.getDealID() && (cfm == 'Y' || cfm == 'y')) {
				dealList.remove(d);
				isDeleted = true;
				break;
			}
		}
	
		return isDeleted;
	}

	public static void deleteDeal(ArrayList<Deal> dealList) {
		COAS.setHeader("Delete Deal");
		COAS.showAllDeals(dealList);
		int dealID = Helper.readInt("Enter deal ID you want to delete > ");
		char cfm = Helper.readChar("Are you sure you want to delete this deal? (Y/N) > ");	
		boolean isDeleted = doDeleteDeal(dealList, dealID, cfm);
		
		if (isDeleted == false) {
			System.out.println("Delete was unsuccessful. Please enter a valid deal ID.");
		}
		else {
			System.out.println("Deal ID "+ dealID + " successfully deleted!");
		}
	}
}
