package euler;

import java.util.ArrayList;
import java.util.HashMap;

public class Problem69 {
	public static int phi(int n, ArrayList<Integer> primes){
		HashMap<Integer, Integer> factors = Problem12.factorize(n, primes);
		int result = n;
		for(Integer p:factors.keySet()){
			//System.out.println(p);
			double frac = 1./p;
			result*=(1-frac);
		}
		return result;
	}
	public static void main(String[] args){
		ArrayList<Integer> primes = Problem3.primesUpToN(1000000);
		//System.out.println(phi(36,primes));
		int maxn = 0;
		double max = 0;
		for(int i = 1; i <= 1000000; i++){
			double divide = (double)i/phi(i, primes);
			//System.out.println(divide);
			if (divide > max){
				max = divide;
				maxn = i;
			}
		}
		System.out.println(maxn);
	}
}
