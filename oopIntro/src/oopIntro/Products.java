package oopIntro;

public class Products {
	
	public Products()
	{
		System.out.println("Ben �al��t�m");
	}	
	
	public Products (int id,String name,double unitPrice,String detail)
	{
		this();
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
		
		System.out.println("2. yap�c� metod 'Ben �al��t�m'");
	}
	
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
	

}