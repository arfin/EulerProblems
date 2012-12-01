package euler;

import java.math.BigInteger;

public class Problem56 {
	public static long DigitSum(BigInteger n) {
		String str = n.toString();
		long sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
		}
		return sum;
	}

	public static void main(String[] args) {
		long max = 0;
		for (int a = 1; a < 100; a++) {
			BigInteger bigA = new BigInteger(""+a);
			for (int b = 1; b < 100; b++) {
				BigInteger exp = bigA.pow(b);
				long sumdigs = DigitSum(exp);
				max = Math.max(max, sumdigs);
			}
		}
		System.out.println(max);
	}
}
