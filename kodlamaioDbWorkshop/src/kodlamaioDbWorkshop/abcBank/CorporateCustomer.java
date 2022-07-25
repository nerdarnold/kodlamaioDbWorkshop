package kodlamaioDbWorkshop.abcBank;

public class CorporateCustomer extends Customer {
	private String title;
	private int taxNo;

	public CorporateCustomer(String title, int taxNo, String customerNo, String address, int channelId,
			int customerForHowManyMonths) {
		super(customerNo, address, channelId, customerForHowManyMonths);
		this.title = title;
		this.taxNo = taxNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTaxNo() {
		return taxNo;
	}

	public void setTaxNo(int taxNo) {
		this.taxNo = taxNo;
	}
}
