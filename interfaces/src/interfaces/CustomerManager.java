package interfaces;
//Manager-Operasyon sýnýfý
public class CustomerManager {
	
	//loosly coupled
	//tightly coupled 
	private Logger[] loggers;
	
	
	public CustomerManager(Logger[] loggers) {
		
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi "+ customer.getFirstName());
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + " veritabanýna loglandý. ");*/
		/*
		for(Logger logger: loggers) {
			logger.log(customer.getFirstName());
			
		}*/
		
		Utils.runLoggers(loggers, customer);//utils sýnýfýný sonradan static yaptýðýmýz için new lemeden class adýyla çaðýrabildik
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi "+ customer.getFirstName());
		/*DatabaseLogger logger = new DatabaseLogger();
		logger.log(customer.getFirstName() + " veritabanýna loglandý. ");*/
		/*for(Logger logger : loggers) {
			logger.log(customer.getFirstName());
			
		}*/
		Utils.runLoggers(loggers, customer);//utils sýnýfýný sonradan static yaptýðýmýz için new lemeden class adýyla çaðýrabildik
	}
	

}
