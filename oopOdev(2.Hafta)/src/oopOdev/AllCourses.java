package oopOdev;

public class AllCourses {

	String name;
	int id;
	String info;
	
	public AllCourses()
	{
		System.out.println("Varsayýlan yapýcý metod çalýþtý.");
	}
	
	public AllCourses(String name,int id,String info)
	{
		this(name);
		this.id = id;
		this.name = name;
		this.info = info;
		System.out.println("Egitmenin adi : "+info);
		
	}
	
	public AllCourses(String name)
	{
		System.out.println(name+" : Kursu oluþturuldu.");
	}
}
