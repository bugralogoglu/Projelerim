package insaatOdev;

public class Insaat {
public void Calisin(){
	
	Isci isci = new Isci();
	isci.setIsim("Emre");
	isci.setTc(1234);
	isci.setYas(21);

	BasIsci bisci = new BasIsci();
	bisci.setIsim("Arda");
	bisci.setTc(1234566);
	bisci.setYas(20);
	System.out.println("Ben i��iyim.");
	System.out.println("Benim ad�m: "  + isci.getIsim());
	System.out.println("Tc kimlik numaram: " + isci.getTc());
	System.out.println("Ya��mda: " + isci.getYas());
	System.out.println("Gorev bas�nday�m." );
	
	System.out.println();
	
	System.out.println("Ben ba�i��iyim.");
	System.out.println("Ad�mda: " + bisci.getIsim());
	System.out.println("Tc kimli�im: " + bisci.getTc());
	System.out.println("Ya��mda: " + bisci.getYas()); 
	System.out.println("Bende gorev bas�nday�m. Hadi kolay gelsin.");
	
	
}
}
