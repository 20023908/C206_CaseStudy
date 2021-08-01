/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20006832, 17 Jul 2021 8:25:31 pm
 */

public class Deal {

	private int dealID;
	private String itemName;
	private String sellerEmail;
	private String buyerEmail;
	private double price;
	private String closeDate;
	
	public Deal(int dealID, String itemName, String sellerEmail, String buyerEmail, double price, String closeDate) {
		this.dealID = dealID;
		this.itemName = itemName;
		this.sellerEmail = sellerEmail;
		this.buyerEmail = buyerEmail;
		this.price = price;
		this.closeDate = closeDate;
	}

	public int getDealID() {
		return dealID;
	}

	public String getItemName() {
		return itemName;
	}

	public String getSellerEmail() {
		return sellerEmail;
	}

	public String getBuyerEmail() {
		return buyerEmail;
	}

	public double getPrice() {
		return price;
	}

	public String getCloseDate() {
		return closeDate;
	}

	public void displayInfo() {
		System.out.println(String.format("%-10d %-25s %-30s %-30s %-9.2f %11s", 
				getDealID(), getItemName(), getSellerEmail(), getBuyerEmail(),
				getPrice(), getCloseDate()));
	}
}
