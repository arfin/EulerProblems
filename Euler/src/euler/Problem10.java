package euler;

import java.util.ArrayList;

public class Problem10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = Problem3.primesUpToN(2000000);
		long sum = 0;
		for(Integer i:list){
			sum+=i;
		}
		System.out.println(sum);
	}

}
