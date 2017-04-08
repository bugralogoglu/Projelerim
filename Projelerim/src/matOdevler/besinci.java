package matOdevler;

public class besinci extends dorduncu {
	void bes() {
		int sonuc = 0;
		int a = 9;
		System.out.println("1-9 Arasý : " + a + " Rakam");
		a = (99 - 9) * 2;
		sonuc = sonuc + a;
		System.out.println("10-99 Arasý: " + a + " Rakam");
		a = (234 - 99) * 3;
		System.out.println("100-234 Arasý: " + a + " Rakam");
		sonuc = sonuc + a;
		System.out.println("Toplam: " + sonuc + " Rakam");
	}
}
