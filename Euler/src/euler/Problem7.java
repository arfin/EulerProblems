package euler;

import java.util.ArrayList;

public class Problem7 {
	public static ArrayList<Integer> firstNPrimes(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (n < 2) {
			return list;
		}
		list.add(2);
		boolean foundmatch;
		for (int i = 3; list.size() < n; i += 2) {
			foundmatch = false;
			for (Integer j : list) {
				if (i % j == 0) {
					foundmatch = true;
					break;
				}
			}
			if (!foundmatch) {
				list.add(i);
			}
		}
		return list;
	}
	
	public static void main(String[] args){
		ArrayList<Integer> primes = firstNPrimes(10001);
		System.out.println(primes.get(primes.size()-1));
	}
}
