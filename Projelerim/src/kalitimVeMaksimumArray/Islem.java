package kalitimVeMaksimumArray;

public class Islem {
	public static void main(String[] args) {
		int array[][][] = new int[3][3][3];
		array[1][1][1] = 2;
		array[2][2][2] = 3;
		array[1][1][2] = 4;
		array[1][2][2] = 5;
		array[2][1][2] = 1;
		array[2][1][1] = 5;

		AltSinif altsinif = new AltSinif();
		System.out.println(altsinif.makDegerbul(array));
	}
}
