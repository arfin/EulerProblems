package euler;

import java.math.BigInteger;

public class Problem97 {
	public static void main(String[] args){
		/*BigInteger base = new BigInteger(""+2);
		base = base.pow(7830457);
		base = base.multiply(new BigInteger(""+28433));
		base = base.add(BigInteger.ONE);
		String result = base.toString();
		System.out.println(result.substring(result.length()-10));*/
		
		long base = 2;
		for (int i = 1; i < 7830457; i++){
			base*=2;
			base%=10000000000L;
		}
		base*=28433;
		base%=10000000000L;
		base+=1;
		System.out.println(base);
	}
}
