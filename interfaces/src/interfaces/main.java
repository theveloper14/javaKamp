package interfaces;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger[] loggers = {new SmsLogger(),new DatabaseLogger(),new FileLogger()};

		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer merve = new Customer(1,"Merve","TAÐCI");
		
		customerManager.add(merve);
		
				
	}

}
