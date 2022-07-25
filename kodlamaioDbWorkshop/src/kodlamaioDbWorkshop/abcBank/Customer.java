package kodlamaioDbWorkshop.abcBank;

public class Customer {
	private String customerNo;
	private String address;
	private int channelId;
	private int customerForHowManyMonths;

	public Customer(String customerNo, String address, int channelId, int customerForHowManyMonths) {
		super();
		this.customerNo = customerNo;
		this.address = address;
		this.channelId = channelId;
		this.customerForHowManyMonths = customerForHowManyMonths;
	}
	public Customer(String customerNo, String address, int channelId) {
		super();
		this.customerNo = customerNo;
		this.address = address;
		this.channelId = channelId;
	}

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public int getCustomerForHowManyMonths() {
		return customerForHowManyMonths;
	}

	public void setCustomerForHowManyMonths(int customerForHowManyMonths) {
		this.customerForHowManyMonths = customerForHowManyMonths;
	}

}
