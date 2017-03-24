package idealKilo;

public class Islem {
public static void main(String[] args) {
	String cinsiyet = "kadýn";
	int kilo = 60;
	int boy = 160;
	
	  Kilo idealK = new Kilo();
	
	  
	  idealK.iBoy = boy;
	  idealK.iCinsiyet = cinsiyet;
	  idealK.iKilo = kilo;
	  
	  idealK.idealKiloHesapla();
	  
	
}
}
