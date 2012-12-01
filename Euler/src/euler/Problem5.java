package euler;

import java.util.ArrayList;

public class Problem5 {

	public static void main(String[] args) {
		int product = 1;
		final int n = 20;
		ArrayList<Integer> list = Problem3.primesUpToN(n);
		//System.out.println(list.toString());
		for (int i = 1; i <= n; i++) {
			for (Integer p : list) {
				while (product % i != 0 && i % p == 0 && i != 1) {
			//		System.out.println("" + i + ", " + p + ", " + product);
					i /= p;
					product *= p;
				}
			}
		}
		System.out.println(product);
	}
}
