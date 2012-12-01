package euler;

import java.math.BigInteger;
import java.util.HashSet;

public class Problem29 {
	public static void main(String[] args){
		HashSet<BigInteger> set = new HashSet<BigInteger>();
		for (int i = 2;i <=100; i++){
			BigInteger bigi = new BigInteger(""+i);
			for(int j = 2; j<=100; j++){
				set.add(bigi.pow(j));
			}
		}
		System.out.println(set.size());
	}
}
