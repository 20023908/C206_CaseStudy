/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20006832, 17 Jul 2021 8:25:31 pm
 */


/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20006832, 17 Jul 2021 8:25:31 pm
 */
public class bidLibrary {
	private int bidID;
	private String itemName;
	private double bidAmt;
	private String buyerEmail;
	private String sellerEmail;
	
	public bidLibrary(int bidID, String itemName, double bidAmt, String buyerEmail, String sellerEmail) {
		this.bidID = bidID;
		this.itemName = itemName;
		this.bidAmt = bidAmt;
		this.buyerEmail = buyerEmail;
		this.sellerEmail = sellerEmail;
	}

	public int getBidID() {
		return bidID;
	}

	public String getItemName() {
		return itemName;
	}

	public double getBidAmt() {
		return bidAmt;
	}

	public String getBuyerEmail() {
		return buyerEmail;
	}

	public String getSellerEmail() {
		return sellerEmail;
	} 
}