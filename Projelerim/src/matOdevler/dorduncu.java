package matOdevler;

public class dorduncu extends ucuncu{
	void dort() {

		String a, b, c;// String tanýmlama nedenim soutlarda + ile yazýnca sorun çýkabileceði için
		a = "0";
		b = "1";
		c = "6";
		System.out.println(b + a + c + "," + b + c + a + "," + c + a + b + "," + c + b + a);
		a = "0";
		b = "2";
		c = "5";
		System.out.println(b + a + c + "," + b + c + a + "," + c + a + b + "," + c + b + a);
		a = "0";
		b = "3";
		c = "4";
		System.out.println(b + a + c + "," + b + c + a + "," + c + a + b + "," + c + b + a);
		a = "1";
		b = "2";
		c = "4";
		System.out.println(a + b + c + "," + a + c + b + "," + b + a + c + "," + b + c + a + "," + c + a + b + "," + c + b + a);
	}
}
