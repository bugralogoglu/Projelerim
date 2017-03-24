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
	System.out.println("Ben iþçiyim.");
	System.out.println("Benim adým: "  + isci.getIsim());
	System.out.println("Tc kimlik numaram: " + isci.getTc());
	System.out.println("Yaþýmda: " + isci.getYas());
	System.out.println("Gorev basýndayým." );
	
	System.out.println();
	
	System.out.println("Ben baþiþçiyim.");
	System.out.println("Adýmda: " + bisci.getIsim());
	System.out.println("Tc kimliðim: " + bisci.getTc());
	System.out.println("Yaþýmda: " + bisci.getYas()); 
	System.out.println("Bende gorev basýndayým. Hadi kolay gelsin.");
	
	
}
}
