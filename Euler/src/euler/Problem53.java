package euler;

import java.math.BigInteger;
import java.util.HashSet;

public class Problem53 {
	public static BigInteger choose(int n, int k) {
		if (k > n / 2) {
			return choose(n, n - k);
		}
		BigInteger result = new BigInteger("1");
		for (int i = 1; i <= k; i++, n--) {
			result = result.multiply(new BigInteger(""+n));
			result = result.divide(new BigInteger(""+i));
		}
		return result;
	}

	public static void main(String[] args) {
		int count = 0;
		HashSet<Long> set = new HashSet<Long>();
		for (int i = 1; i <= 100; i++) {
			for (int j = 0; j <= i; j++){
				//System.out.println(j);
				if (choose(i,j).toString().length()>6){
					System.out.println("i: "+i+", j: "+j);
					//set.add(choose(i,j));
					count++;
				}
			}
		}
		System.out.println(count);
		System.out.println(set.size());
	}
}
