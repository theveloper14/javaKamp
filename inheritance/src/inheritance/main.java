package inheritance;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IndividualCustomer engin = new IndividualCustomer()	;
		engin.customerNumber = "12345";
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "67890";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {engin,hepsiBurada,abc};
		
		customerManager.addMultiple(customers);
		
		/*customerManager.add(hepsiBurada);
		customerManager.add(engin);*/
	
	
	}//main ends

}//class ends
