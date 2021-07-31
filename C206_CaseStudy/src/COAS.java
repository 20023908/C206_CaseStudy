import java.util.ArrayList;

import refactor.Helper;

public class COAS {

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
				
				
			} else if (option == 2){
				
				COAS.setHeader("VIEW");
				COAS.menuType();
				
			} else if (option == 3) {
				
				COAS.setHeader("DELETE");
				COAS.menuType();
				
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
}
