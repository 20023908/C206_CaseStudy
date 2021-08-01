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
		
		int option = 0;
		while (option!=4) {
			
			viewMenu();
			option = Helper.readInt("Enter option > ");
			
			if (option == 1) {
				
				COAS.setHeader("ADD");
				COAS.menuType();
				
				int type = Helper.readInt("Enter option to select menu type > ");
				
				if (type == 1) {
					//dan add method
					addUser();
					
				} else if (type == 2) {
					//jh add method
					
				} else if (type == 3) {
					//nelly add method
					
				} else if (type == 4) {
					//qid add method
					
				} else if (type == 5) {
					//gy add method
					addDeals(dealList);
					
				} else {
					System.out.println("Invalid type");
				}
				
			} else if (option == 2){
				
				COAS.setHeader("VIEW ALL");
				COAS.menuType();
				
				int type = Helper.readInt("Enter option to select menu type > ");
				
				if (type == 1) {
					//dan view method
					viewAllUser();
					
				} else if (type == 2) {
					//jh view method
					
				} else if (type == 3) {
					//nelly view method
					
				} else if (type == 4) {
					//qid view method
					
				} else if (type == 5) {
					//gy view method
					showAllDeals(dealList);
					
				} else {
					System.out.println("Invalid type");
				}
				
			} else if (option == 3) {
				
				COAS.setHeader("DELETE");
				COAS.menuType();
				
				int type = Helper.readInt("Enter option to select menu type > ");
				
				if (type == 1) {
					//dan delete method
					deleteUser();
					
				} else if (type == 2) {
					//jh delete method
					
				} else if (type == 3) {
					//nelly delete method
					
				} else if (type == 4) {
					//qid delete method
					
				} else if (type == 5) {
					//gy delete method
					
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

//	public static void addUser() {
//		Helper.line(120, "-");
//		System.out.println("Add user account");
//		Helper.line(120, "-");
//
//		String user = Helper.readString("Enter name > ");
//		String role = Helper.readString("Enter role (Buyer/Seller) > ");
//		String email = Helper.readString("Enter email > ");
//		String password = Helper.readString("Enter password > ");
//		
//		for (account i : accountList) {
//			if (i.getEmail().equalsIgnoreCase(email)) {
//				System.out.println(role + "account with email: " + email + " already exist!");
//				break;
//			}
//			else {
//				if (password.length() < 8) {
//					System.out.println("Password must be more than 8 characters long!");
//					break;
//				}
//				else {
//					accountList.add(new account(user,role,email,password));
//					System.out.println(role + " account added!");
//					break;
//				}
//				
//			}
//		}
//		
//		
//	}
	
	public static account inputUser() {
		String user = Helper.readString("Enter asset tag > ");
		String role = Helper.readString("Enter description > ");
		String email = Helper.readString("Enter email > ");
		String password = Helper.readString("Enter password > ");
		
		account user1= new account(user, role, email, password);
		return user1;
	}
	
	public static void addUser(ArrayList<account> accountList, account user1) {
		
		for (account i : accountList) {
			if (i.getEmail().equalsIgnoreCase(user1.getEmail())) {
				System.out.println(user1.getRole() + "account with email: " + user1.getEmail() + " already exist!");
				break;
			}
			else {
				if (user1.getPassword().length() < 8) {
					System.out.println("Password must be more than 8 characters long!");
					break;
				}
				else {
					accountList.add(user1);
					System.out.println(user1.getRole() + " account added");
					break;
			}
		}
	}
}
	
	public void viewAllUser() {
		Helper.line(120, "-");
		System.out.println("View all users");
		Helper.line(120, "-");
		String outputUser = String.format("%-10s %-10s %s\n", "Name", "Role", "Email");
		
		for (account p : accountList) {
			
			if (p.getRole().equalsIgnoreCase("buyer"))
				outputUser += String.format("%-10s %-10s %s\n", p.getName(),p.getRole(),p.getEmail());
			else if (p.getRole().equalsIgnoreCase("seller"))
				outputUser += String.format("%-10s %-10s %s\n", p.getName(),p.getRole(),p.getEmail());

		}
		
		System.out.println(outputUser);
	}
	
	public void deleteUser() {
		Helper.line(120, "-");
		System.out.println("Delete buyer/seller account");
		Helper.line(120, "-");
		String email = Helper.readString("Enter email to delete > ");
		
		boolean isDeleted = false;
		
		for (account i : accountList) {
			if (i.getEmail().equalsIgnoreCase(email)) {
				accountList.remove(i);
				isDeleted = true;
				System.out.println(i.getRole() + " account with email: " + email + " deleted successfully!");
				break;
			}
		}
		if (isDeleted == false) {
			System.out.println("Account with email: " + email + " does not exist!");
		}
	}
	
	
	
	// (2) jh category
	
	
	
	
	
	
	
	// (3) nelly item
	
	
	
	
	
	
	
	
	// (4) qid bid
	
	
	
	
	
	
	
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
		}
		else {
			Deal deal1 = new Deal(dealID, itemName, sellerEmail, buyerEmail, price, closeDate);
			dealList.add(deal1);
			System.out.println("Successfully added a new deal!");
		}
	}
	
	private void showAllDeals(ArrayList<Deal> dealList) {
		Helper.line(120, "-");
		System.out.println("Show All Deals");
		Helper.line(120, "-");
		
		System.out.println(String.format("%-10s %-15s %-25s %-25s %-9s %11s", 
				"DEAL ID", "ITEM NAME", "SELLER EMAIL", "BUYER EMAIL", "PRICE", "CLOSE DATE"));
		
		for (Deal d : dealList) {
			d.displayInfo();
		}
	}
	
	
}
	
