package kalitimVeMaksimumArray;

public class MakArray {
	int makDegerbul(int[][][] array) {
		int maxDeger = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					if (maxDeger < array[i][j][k]) {
						maxDeger = array[i][j][k];
					}
				}
			}
		}
		return maxDeger;
	}
}
