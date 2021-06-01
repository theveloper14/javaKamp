package oopIntro;

public class Products {

	//encapsulation
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	
	
	/*public Products()
	{
		System.out.println("Ben çalýþtým");
	}	*/
	

	public Products (int id,String name,int unitPrice,String detail,int discount)
	{
		//this();
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
		this.discount=discount;
		//this.unitPriceAfterDiscount=unitPriceAfterDiscount;
		
		System.out.println("2. yapýcý metod 'Ben çalýþtým'");
	}
	
	public Products() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		
		return this.unitPrice-(this.unitPrice * this.discount / 100);
	}

	
	

}
