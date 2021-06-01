package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");
	}
	
	/*public void add(CorporateCustomer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");
	}*/
	
	//bulk insert
	public void addMultiple(Customer[] customers) {//�oklu ekleme 
		for(Customer customer : customers) {
			add(customer);
		}
	}
}