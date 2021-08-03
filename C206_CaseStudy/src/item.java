/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20006832, 17 Jul 2021 7:29:52 pm
 */

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20006832, 17 Jul 2021 7:29:52 pm
 */
public class item {
	//create parent class
	private String itemName;
	private String itemDesc;
	private double minBidPrice;
	private String auctionStart;
	private String auctionEnd;
	private double bidinc;

	public item(String itemName, String itemDesc, double minBidPrice, String auctionStart,
			String auctionEnd, double bidinc) {
		super();
		this.itemName = itemName;
		this.itemDesc = itemDesc;
		this.minBidPrice = minBidPrice;
		this.auctionStart = auctionStart;
		this.auctionEnd = auctionEnd;
		this.bidinc = bidinc;
	}

	public String getItemName() {
		return itemName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public double getMinBidPrice() {
		return minBidPrice;
	}


	public String getAuctionStart() {
		return auctionStart;
	}


	public String getAuctionEnd() {
		return auctionEnd;
	}

	public double getBidinc() {
		return bidinc;
	}

	public void setMinBidPrice(double minBidPrice) {
		this.minBidPrice = minBidPrice;
	}

}
