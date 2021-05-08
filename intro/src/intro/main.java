package intro;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//camelCase
		/* don't repeat yourself:Birkaç yerde kullanacaðýn deðiþken
		kullanýrken dikkatli ol.Yani ayný þeyleri tek tek yazma.
		Bir deðiþkene at,onu kullan */
		
		String internetSubeButonu = "Ýnternet Þubesi";
		System.out.println(internetSubeButonu);
		double dolarDun = 8.15;
		double dolarBugun = 8.15;
		int vade = 36;
		boolean mantýksalIfade = false;
		
		if (dolarBugun < dolarDun){
		System.out.println("Dolar düþtü resmi");
		}
		else if(dolarBugun > dolarDun){
		System.out.println("Dolar yükseldi resmi");
		}
		else{
		System.out.println("Dolar düne eþit resmi");
		}
			
		String[] krediler = {
				"Hýzlý kredi",
				"Çiftçi kredisi",
				"Mutlu emekli kredisi",
				"Msb kredisi",
				"Meb kredisi",
				"Konut kredisi"
		};
		//foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
			
		}
	}
}