package euler;

import java.util.ArrayList;
import java.util.HashSet;

public class Problem46 {
	public static void main(String[] args) {
		ArrayList<Integer> primes = Problem3.primesUpToN(10000);
		HashSet<Integer> primeset = new HashSet<Integer>(primes);
		boolean[] sums = new boolean[1000000];
		for (int i = 0; i < sums.length; i++) {
			sums[i] = false;
		}

		for (Integer p : primes) {
			for (int i = 0; i < 10000; i++) {
				if (p + 2 * i * i < sums.length)
					sums[p + 2 * i * i] = true;
			}
		}

		for (int i = 3; i < sums.length; i+=2) {
			if (sums[i] == false && !primes.contains(i)) {
				System.out.println(i);
				break;
			}
		}
	}
}
