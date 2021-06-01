package interfaces;
//Manager-Operasyon s�n�f�
public class CustomerManager {
	
	//loosly coupled
	//tightly coupled 
	private Logger[] loggers;
	
	
	public CustomerManager(Logger[] loggers) {
		
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("M��teri eklendi "+ customer.getFirstName());
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + " veritaban�na logland�. ");*/
		/*
		for(Logger logger: loggers) {
			logger.log(customer.getFirstName());
			
		}*/
		
		Utils.runLoggers(loggers, customer);//utils s�n�f�n� sonradan static yapt���m�z i�in new lemeden class ad�yla �a��rabildik
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi "+ customer.getFirstName());
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + " veritaban�na logland�. ");*/
		/*for(Logger logger : loggers) {
			logger.log(customer.getFirstName());
			
		}*/
		Utils.runLoggers(loggers, customer);//utils s�n�f�n� sonradan static yapt���m�z i�in new lemeden class ad�yla �a��rabildik
	}
	

}
