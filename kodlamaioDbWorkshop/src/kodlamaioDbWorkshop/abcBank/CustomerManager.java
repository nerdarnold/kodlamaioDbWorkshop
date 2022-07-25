package kodlamaioDbWorkshop.abcBank;

public class CustomerManager implements CustomerAddressService {

	@Override
	public void address(Customer customer) {
		if (customer.getAddress() == null) {
			System.out.println("Please confirm an address");
		}
	}

	void balanceSheetEntry(Customer customer) {
		int sheetEntry = 0;
		sheetEntry = customer.getCustomerForHowManyMonths() / 6;
		System.out.println(sheetEntry);
	}
}