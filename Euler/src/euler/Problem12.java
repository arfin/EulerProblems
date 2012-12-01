package euler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Problem12 {

	public static HashMap<Integer, Integer> factorize(int n,
			ArrayList<Integer> primes) {
		int workingN = n;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer p : primes) {
			while (workingN % p == 0) {
				if (!map.containsKey(p))
					map.put(p, new Integer(1));
				else {
					map.put(p, map.get(p) + 1);
				}
				workingN /= p;
			}
			if (workingN == 1) {
				return map;
			}
		}
		return map;
	}

	public static int numFactors(int n, ArrayList<Integer> primes) {
		if (n == 1) {
			return 1;
		}
		Map<Integer, Integer> factorization = factorize(n, primes);
		int product = 1;
		for (Integer base : factorization.keySet()) {
			product *= (factorization.get(base) + 1);
		}
		return product;
	}

	public static void main(String[] args) {
		ArrayList<Integer> primes = Problem3.primesUpToN(10000);
		int sum = 0;
		for (int i = 1; i < 100000; i++) {
			sum += i;
			if (numFactors(sum, primes) > 500) {
				System.out.println(sum);
				break;
			}
		}
	}
}
