
public class Student {
	int id;
	String name;
	
	public void add(Load load)
	{
		System.out.println(name+"  ,");
		load.load();
	}

}
