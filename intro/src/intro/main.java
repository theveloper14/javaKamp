package intro;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//camelCase
		/* don't repeat yourself:Birka� yerde kullanaca��n de�i�ken
		kullan�rken dikkatli ol.Yani ayn� �eyleri tek tek yazma.
		Bir de�i�kene at,onu kullan */
		
		String internetSubeButonu = "�nternet �ubesi";
		System.out.println(internetSubeButonu);
		double dolarDun = 8.15;
		double dolarBugun = 8.15;
		int vade = 36;
		boolean mant�ksalIfade = false;
		
		if (dolarBugun < dolarDun){
		System.out.println("Dolar d��t� resmi");
		}
		else if(dolarBugun > dolarDun){
		System.out.println("Dolar y�kseldi resmi");
		}
		else{
		System.out.println("Dolar d�ne e�it resmi");
		}
			
		String[] krediler = {
				"H�zl� kredi",
				"�ift�i kredisi",
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