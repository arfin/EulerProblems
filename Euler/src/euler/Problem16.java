package euler;

import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args){
		BigInteger two = new BigInteger("2");
		BigInteger result = new BigInteger("1");
		for(int i=1;i <=1000;i++){
			result = result.multiply(two);
		}
		
		String str = result.toString();
		int sum = 0;
		for (int i=0;i<str.length();i++){
			sum+=str.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}
