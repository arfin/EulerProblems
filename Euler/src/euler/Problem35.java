package euler;

import java.util.ArrayList;
import java.util.HashSet;

public class Problem35 {
	public static boolean isCircular(int i, HashSet<Integer> primes) {
		return isCircular("" + i, "" + i, primes);
	}

	public static boolean isCircular(String str, String orig,
			HashSet<Integer> primes) {
		Integer i = Integer.parseInt(str);
		if (!primes.contains(i))
			return false;
		String rot = rotate(str);
		if (rot.equals(orig))
			return true;
		return isCircular(rot, orig, primes);
	}

	public static String rotate(String str) {
		char c = str.charAt(0);
		str = str.substring(1);
		str = str + c;
		return str;
	}

	public static void main(String[] args) {
		ArrayList<Integer> primeList = Problem3.primesUpToN(1000000);
		HashSet<Integer> primeSet = new HashSet<Integer>(primeList);
		// System.out.println(isCircular(307, primeSet));

		int count = 0;
		for (Integer i : primeSet) {
//			System.out.println(i);
			if (isCircular(i, primeSet))
				count++;
		}
		System.out.println(count);

	}
}
