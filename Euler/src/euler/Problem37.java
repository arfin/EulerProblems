package euler;

import java.util.ArrayList;
import java.util.HashSet;

public class Problem37 {
	public static boolean isTrunctable(int n, HashSet<Integer> primes){
		return isRightTrunctable(n, primes) && isLeftTrunctable(n, primes);
	}
	
	public static boolean isLeftTrunctable(int n, HashSet<Integer> primes){
		if (n < 10){
			return primes.contains(n);
		}
		String str = ""+n;
		String substr = str.substring(1);
		return primes.contains(n) && isLeftTrunctable(Integer.parseInt(substr), primes);
	}
	
	public static boolean isRightTrunctable(int n, HashSet<Integer> primes){
		if (n < 10){
			return primes.contains(n);
		}
		String str = ""+n;
		String substr = str.substring(0,str.length()-1);
		return primes.contains(n) && isRightTrunctable(Integer.parseInt(substr), primes);
	}
	
	public static void main(String[] args){
		ArrayList<Integer> primelist = Problem3.primesUpToN(1000000);
		HashSet<Integer> primes = new HashSet<Integer>(primelist);
		System.out.println(isLeftTrunctable(137,primes));
		
		int sum = 0;
		for(Integer p:primes){
			if (isTrunctable(p,primes) && p > 10){
				sum+=p;
			}
		}
		System.out.println(sum);
	}
}
