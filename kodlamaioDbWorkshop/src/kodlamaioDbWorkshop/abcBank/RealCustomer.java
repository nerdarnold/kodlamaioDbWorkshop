package kodlamaioDbWorkshop.abcBank;

public class RealCustomer extends Customer {
	private String firstName;
	private String lastName;
	private String nationalId;

	public RealCustomer(String firstName, String lastName, String nationalId, String customerNo, String address,
			int channelId, int customerForHowManyMonths) {
		super(customerNo, address, channelId, customerForHowManyMonths);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
	}

	public RealCustomer(String firstName, String lastName, String nationalId, String customerNo, String address,
			int channelId) {
		super(customerNo, address, channelId);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

}
