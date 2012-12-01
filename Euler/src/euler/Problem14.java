package euler;

import java.util.HashMap;

public class Problem14 {
	static HashMap<Long, Long> map = new HashMap<Long, Long>();

	public static long collatz(long n) {
		long origN = n;
		int count = 0;
		while (!map.containsKey(n)) {
			count++;
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
		}
		map.put(origN, count+map.get(n));
		return count+map.get(n);
	}

	public static void main(String[] args) {
		map.put(1L, 1L);
		long max = 0;
		long maxNum = 0;
		for (long i = 1; i < 1000000; i++) {
			long collatz = collatz(i);
			if (collatz > max) {
				max = collatz;
				maxNum = i;
			}
		}
		System.out.println(maxNum);
	}
}
