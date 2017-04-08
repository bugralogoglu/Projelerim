package matOdevler;

public class yedinci extends altinci{
	void yedi() {
		int abc = 100;
		int x = 20 * abc;
		abc = abc + (100 - 20 + 5);
		int k = 20 * abc;
		x = k - x;
		System.out.println(x + " artar.");
	}
}
