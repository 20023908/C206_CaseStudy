public class Bid {
	private int bidID;
	private String itemName;
	private double bidAmt;
	private String buyerEmail;
	private String sellerEmail;
	
	public Bid(int bidID, String itemName, double bidAmt, String buyerEmail, String sellerEmail) {
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