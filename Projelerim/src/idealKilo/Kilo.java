package idealKilo;

public class Kilo {
public static String iCinsiyet;
public static int iBoy;
public static int iKilo;


public static void idealKiloHesapla(){
	
	System.out.println("Boy: " + iBoy);
	System.out.println("Kilo: " + iKilo);
	iBoy= iBoy - 100;
	
	if(iCinsiyet.equals("erkek")){
		System.out.println("Ideal kilonuz " + (iBoy - 10) + "-" + (iBoy+10) + "kg arasý.");
		if (iKilo - iBoy <= 10 && iKilo - iBoy >= -10){
			System.out.println("Ideal kilodasýnýz.");
		}
		else 
			System.out.println("Ideal kiloda deðilsiniz.");}
		
	
	
		else if(iCinsiyet.equals("kadýn")){
			System.out.println("Ideal kilonuz " + (iBoy - 5) + "-" + (iBoy + 5) + "kg arasý.");
			if (iKilo - iBoy <= 5 && iKilo - iBoy >= -5){
				System.out.println("Ideal kilodasýnýz.");
			}
			else 
				System.out.println("Ideal kiloda deðilsiniz.");
			
	}
	
		else 
			System.out.println("Yanlýþ cinsiyet :D");
 

}
}