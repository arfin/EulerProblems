package euler;

public class Problem9 {

	public static void main(String[] args) {
		for (int i = 1; i < 1000; i++) {
			for (int j = i; j < 1000; j++) {
				int k = 1000 - j - i;
				if (k * k == i * i + j * j || j * j == i * i + k * k) {
					System.out.println(i * j * k);
				}
			}
		}
	}
}
