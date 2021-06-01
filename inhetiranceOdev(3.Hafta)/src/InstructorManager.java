//import inheritance.Customer;

public class InstructorManager extends Instructor{
	
	//String name;
	

	public InstructorManager() {
		//super.instructorName=name;
		System.out.println("InstructorManager yapýcý fonksiyonu.");
		//super.instructorName=name;
		}

	public void ViewStatistic() {
		System.out.println(super.instructorName+"adlý eðitmen þuan istatistikleri görüntülüyorsunuz..");
		
	}
	public void addInstrctr(Instructor instructor) {
		System.out.println(instructor.instructorName + "  adlý eðitmen kaydedildi.");
	}
	
	public void add(Load load) {
		System.out.println(super.instructorName+"adlý eðitmen ,");
		//load.type;
		load.load();
		
	}
	public void addMultiple(Instructor[] instructor) {//Çoklu ekleme 
		for(Instructor insructor : instructor) {
			addInstrctr(insructor);
		}
			//addInstrctr(instructor);
		}

}
