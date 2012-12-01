package euler;

import java.math.BigInteger;

public class Problem20 {
	public static void main(String[] args){
		BigInteger product = new BigInteger("1");
		for(int i = 1; i <=100;i++){
			product = product.multiply(new BigInteger(""+i));
		}
		
		String str = product.toString();
		int sum = 0;
		for (int i = 0; i < str.length();i++){
			sum+=str.charAt(i)-'0';
		}
		System.out.println(sum);
		
	}

}
