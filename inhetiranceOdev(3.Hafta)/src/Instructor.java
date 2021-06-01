
public class Instructor {
	String instructorName ;
	int id;
	String[] instructor;
	String lectureName;
	public void add(Load load) {
		System.out.println(instructorName+" adlý eðitmen ,");
		//load.type;
		load.load();
	}
	
	public void delete(String name)
	{
		this.lectureName=name;
		System.out.println(name+" adlý ders kaydý baþarýyla silindi!");
		
	}
}
