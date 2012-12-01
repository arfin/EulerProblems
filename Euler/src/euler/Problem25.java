package euler;

import java.math.BigInteger;

public class Problem25 {
	public static void main(String[] args) {
		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("1");
		int count = 3;
		while (true) {
			BigInteger temp = new BigInteger(b.toString());
			b = b.add(a);
			a = temp.add(BigInteger.ZERO);
			if (b.toString().length() ==1000){
				System.out.println(count);
				break;
			}
			count++;
		}
	}
}
