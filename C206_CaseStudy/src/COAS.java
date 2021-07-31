import java.util.ArrayList;
import java.util.Arrays;


public class COAS {
	
	 ArrayList<account> accountList = new ArrayList<account>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
					
				} else if (type == 2) {
					//jh add method
					
				} else if (type == 3) {
					//nelly add method
					
				} else if (type == 4) {
					//qid add method
					
				} else if (type == 5) {
					//gy add method
					
				} else {
					System.out.println("Invalid type");
				}
				
			} else if (option == 2){
				
				COAS.setHeader("VIEW");
				COAS.menuType();
				
				int type = Helper.readInt("Enter option to select menu type > ");
				
				if (type == 1) {
					//dan view method
					
					
				} else if (type == 2) {
					//jh view method
					
				} else if (type == 3) {
					//nelly view method
					
				} else if (type == 4) {
					//qid view method
					
				} else if (type == 5) {
					//gy view method
					
				} else {
					System.out.println("Invalid type");
				}
				
			} else if (option == 3) {
				
				COAS.setHeader("DELETE");
				COAS.menuType();
				
				int type = Helper.readInt("Enter option to select menu type > ");
				
				if (type == 1) {
					//dan delete method
					
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
		
		
		
		//1-dan-useraccount
		
		
		
		
		
		
		
		//2-jh-category
		
		
		
		
		
		
		//3-nelly-item
		
		
		
		
		
		//hello i was here
		
		
		
		
		
		//4-qid-bid
		
		
		// testing123
		
		
		
		//5-gy-deal
	}
	
	public static void viewMenu() {
		COAS.setHeader("CAMPUS Online Auction Shop (COAS)");
		System.out.println("1. ADD");
		System.out.println("2. VIEW");
		System.out.println("3. DELETE");
		System.out.println("4. QUIT");
		Helper.line(80, "-");
	}
	
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	public static void menuType() {
		System.out.println("1. User");
		System.out.println("2. Category");
		System.out.println("3. Item");
		System.out.println("4. Bid");
		System.out.println("5. Deal");
	}
	
	public static void addUser(ArrayList<account> accountList) {
		Helper.line(35, "-");
		System.out.println("Add user account");
		Helper.line(35, "-");
		
		String user = Helper.readString("Enter name > ");
		String role = Helper.readString("Enter role (Buyer/Seller) > ");
		String email = Helper.readString("Enter email > ");
		String password = Helper.readString("Enter password > ");
		
		accountList.add(new account(user,role,email,password));
		
	}
	
}

