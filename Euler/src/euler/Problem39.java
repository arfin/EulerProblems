package euler;

public class Problem39 {
	public static void main(String[] args) {
		int[] sums = new int[1001];
		for (int i = 1; i < 999; i++) {
			for (int j = i; i + j < 1000; j++) {
				for (int k = j; i + j + k < 1001; k++) {
					if (i * i + j * j == k * k) {
						sums[i + j + k]++;
					}
				}
			}
		}

		int max = 0;
		int maxval = 0;
		for (int i = 0; i < sums.length; i++){
			if (sums[i] > max){
				max = sums[i];
				maxval = i;
			}
		}
		System.out.println(maxval);
	}
}
