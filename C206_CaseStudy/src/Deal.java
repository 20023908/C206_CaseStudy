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
	
}
