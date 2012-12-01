package euler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Problem27 {
	
	public static int numConsPrimes(int a, int b, Set<Integer> primes){
		int n = 0;
		while(primes.contains(n*n+a*n+b)){
			n++;
		}
		return n;
	}
	public static void main(String[] args) {
		ArrayList<Integer> primes = Problem3.primesUpToN(1000000);
		HashSet<Integer> primeset = new HashSet<Integer>(primes);
		//System.out.println(numConsPrimes(-79, 1601, primeset));
		int max = 0;
		int maxa = 0;
		int maxb = 0;
		for (int a = -999; a < 1000; a++) {
			for (int b = -999; b < 1000; b++) {
				int n = numConsPrimes(a,b,primeset);
				if (n > max){
					max = n;
					maxa = a;
					maxb = b;
				}
			}
		}
		System.out.println(maxa*maxb);
		System.out.println(maxa);
		System.out.println(maxb);
		System.out.println(numConsPrimes(maxa, maxb, primeset));
	}
}
