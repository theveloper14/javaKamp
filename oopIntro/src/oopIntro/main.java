package oopIntro;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Products product =new Products(0,"Lenovo Air",12000,"16GB Ram");//Arka tarafta ilgili yap�c� metod �al��acak.
		
		Products product1 = new Products(); //referans olu�turma 
		product1.id=1;
		product1.name="Lenovo V14";
		product1.unitPrice=10000;
		product1.detail="16GB Ram";
		
		Products product2 = new Products();
		product2.id=2;
		product2.name="Lenovo V15";
		product2.unitPrice=11000;
		product2.detail="32GB Ram";
		
		Products product3 = new Products();
		product3.id=3;
		product3.name="Hp 5";
		product3.unitPrice=10000;
		product3.detail="8GB Ram";
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
		category2.name="Ev/Bah�e";
		
		Category[] categories = {category1,category2};
		
		for(Category category : categories) {
			System.out.println(category.name);
			
		}
		
		//method olan class�n referans�n� olu�turma
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);//classtaki metod �al��t�
		productManager.addToCart(product2);
		productManager.addToCart(product3);

	}

}