
public class Instructor {
	String instructorName ;
	int id;
	String[] instructor;
	String lectureName;
	public void add(Load load) {
		System.out.println(instructorName+" adl� e�itmen ,");
		//load.type;
		load.load();
	}
	
	public void delete(String name)
	{
		this.lectureName=name;
		System.out.println(name+" adl� ders kayd� ba�ar�yla silindi!");
		
	}
}
