package kodlamaioDbWorkshop.abcBank;

public class Main {

	public static void main(String[] args) {
		Customer ata = new CorporateCustomer("Father", 55, "106********",null, 1, 12);
		Customer zafer = new RealCustomer("Zafer", "Altay", "12345678900", "55555", null, 2,18);
		Customer zaferRealWithoutBalance = new RealCustomer("Zafer", "Altay", "12345678900", "55555", null, 2);
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.address(ata);
		customerManager.balanceSheetEntry(ata);
		customerManager.balanceSheetEntry(zafer);
		customerManager.balanceSheetEntry(zaferRealWithoutBalance);
	}

}
