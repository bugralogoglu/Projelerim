package matOdevler;

public class ucuncu extends ikincisi {
	void uc() {
		int a = 2;
		int b = 1;
		int c = 0;
		int sonuc = 0;
		for (int i = 0; i <= 3; i++) {
			int abc = 0;
			abc = (a * 100) + (b * 10) + c;
			sonuc = abc + sonuc;
			a = a + 2;
			b = b + 2;
			c = c + 1;
		}
		System.out.println("ABC Sayýlarýnýn toplamý: " + sonuc);
	}
}
