//import inheritance.Customer;

public class InstructorManager extends Instructor{
	
	//String name;
	

	public InstructorManager() {
		//super.instructorName=name;
		System.out.println("InstructorManager yap�c� fonksiyonu.");
		//super.instructorName=name;
		}

	public void ViewStatistic() {
		System.out.println(super.instructorName+"adl� e�itmen �uan istatistikleri g�r�nt�l�yorsunuz..");
		
	}
	public void addInstrctr(Instructor instructor) {
		System.out.println(instructor.instructorName + "  adl� e�itmen kaydedildi.");
	}
	
	public void add(Load load) {
		System.out.println(super.instructorName+"adl� e�itmen ,");
		//load.type;
		load.load();
		
	}
	public void addMultiple(Instructor[] instructor) {//�oklu ekleme 
		for(Instructor insructor : instructor) {
			addInstrctr(insructor);
		}
			//addInstrctr(instructor);
		}

}
