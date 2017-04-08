package matOdevler;

public class birincisi {
	void bir() {

		int a, b, sonuc, sayac = 0;
		a = 1000;
		b = 100;
		sonuc = (a * b);
		for (int i = 0; i <= 10; i++) {
			if (sonuc >= 1) {
				sonuc = sonuc / 10;
				sayac++;
			} else
				break;
		}
		System.out.println(sayac);
	}

}
