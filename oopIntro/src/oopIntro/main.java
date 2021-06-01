package oopIntro;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Products product =new Products(0,"Lenovo Air",12000,"16GB Ram",10);//Arka tarafta ilgili yapýcý metod çalýþacak.
		
		Products product1 = new Products(); //referans oluþturma 
		product1.setId(1);
		product1.setName("Lenovo 15");
		product1.setDetail("16 GB Ram");
		product1.setDiscount(10);
		product1.setUnitPrice(16000);
		
		System.out.println(product1.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Ýçecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		/*
		Products product2 = new Products();
		
		
		Products product3 = new Products();
		
		
		
		Products[] products = {product1,product2,product3};
		
		for(Products producti : products) {
			System.out.println(producti.name );
		}
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2 = new Category();
		category2.id=2;
		category2.name="Ev/Bahçe";
		
		Category[] categories = {category1,category2};
		
		for(Category category : categories) {
			System.out.println(category.name);
			
		}
		
		//method olan classýn referansýný oluþturma
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);//classtaki metod çalýþtý
		productManager.addToCart(product2);
		productManager.addToCart(product3);*/

	}//main sonu

}//class sonu
