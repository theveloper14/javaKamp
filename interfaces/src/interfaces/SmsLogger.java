package interfaces;

public class SmsLogger implements Logger{
	//public void log() {}

	@Override
	public void log(String message) {
		System.out.println("Sms g�nderildi : "+ message);
		// TODO Auto-generated method stub
		
	}

}
