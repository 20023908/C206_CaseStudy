import java.util.ArrayList;

public class COAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 0;
		while (option!=4) {
			viewMenu();
			option = Helper.readInt("Enter option > ");
			
			if (option == 1) {
				
			} else if (option == 2){
				
			} else if (option == 3) {
				
			} else if (option == 4) {
				System.out.println("Thank for using the application!");
			} else {
				System.out.println("Invalid Option!");
			}
		}
		
		
		//1-dan-useraccount
		ArrayList<account> accountlist = new ArrayList<account>();
		
		
		
		
		
		
		
		//2-jh-category
		
		
		
		
		
		
		//3-nelly-item
		
		
		
		
		
		//hello i was here
		
		
		
		
		
		//4-qid-bid
		
		
		
		
		
		
		//5-gy-deal
	}
	
	public static void viewMenu() {
		Helper.line(35, "-");
		System.out.println("CAMPUS Online Auction Shop (COAS)");
		Helper.line(35, "-");
		System.out.println("1. ADD");
		System.out.println("2. VIEW");
		System.out.println("3. DELETE");
		System.out.println("4. QUIT");
		Helper.line(35, "-");
	}
	
	public static void viewMenu1() {
		Helper.line(35, "-");
		System.out.println("ADD");
		Helper.line(35, "-");
		System.out.println("1. Add user account");
		System.out.println("2. Add category");
		System.out.println("3. Add item");
		System.out.println("4. Add bid");
		System.out.println("5. Add deal");
	}
	public static void viewMenu2() {
		Helper.line(35, "-");
		System.out.println("VIEW ALL");
		Helper.line(35, "-");
		System.out.println("1. View all users");
		System.out.println("2. Add all categories");
		System.out.println("3. Add all items");
		System.out.println("4. Show all bids");
		System.out.println("5. Show all deals");
	}
	public static void viewMenu3() {
		Helper.line(35, "-");
		System.out.println("ADD");
		Helper.line(35, "-");
		System.out.println("1. Add user account");
		System.out.println("2. Add category");
		System.out.println("3. Add item");
		System.out.println("4. Add bid");
		System.out.println("5. Add deal");
		// more menus
	}

}
