package euler;

import java.util.ArrayList;

public class Problem47 {

	public static void main(String[] args) {
		ArrayList<Integer> primes = Problem3.primesUpToN(1000000);
		// System.out.println(Problem12.factorize(646,primes).size());
		int[] numPrimes = new int[300000];
		for (int i = 2; i < 300000; i++) {

			numPrimes[i] = Problem12.factorize(i, primes).size();
		}

		for (int i = 0; i < 500000; i++) {
			if (numPrimes[i] == 4 && numPrimes[i + 1] == 4
					&& numPrimes[i + 2] == 4 && numPrimes[i + 3] == 4) {
				System.out.println(i);
				break;
			}
		}
	}
}
