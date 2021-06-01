package oopIntro;

public class Category {
	int id;
	String name;
	
	public Category() {
		
	}

	public Category(int id, String name) {
		//super();
		this.id = id;
		this.name = name;	
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int Id) {
		this.id = id;
	}

	public String getName() {
		return this.name + "!";
	}
	public void setName(String name) {
		this.name = name;
		
	}
	
}//class sonu
