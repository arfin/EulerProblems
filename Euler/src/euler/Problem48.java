package euler;

import java.math.BigInteger;

public class Problem48 {

	public static void main(String[] args){
		BigInteger sum = new BigInteger("0");
		for (int i = 1; i <= 1000; i++){
			BigInteger n = new BigInteger(""+i);
			n = n.pow(i);
			sum = sum.add(n);
		}
		String result = sum.toString();
		System.out.println(result.substring(result.length()-10));
	}
}
