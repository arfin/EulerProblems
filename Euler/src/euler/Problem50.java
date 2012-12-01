package euler;

import java.util.ArrayList;
import java.util.HashSet;

public class Problem50 {
	public static void main(String[] args) {
		int param = 1000000;
		ArrayList<Integer> primelist = Problem3.primesUpToN(param);
		HashSet<Integer> primeset = new HashSet<Integer>(primelist);

		int max = 0;
		int maxval = 0;
		for (int i = 0; i < primelist.size(); i++) {
			int sum = primelist.get(i);
			for(int j = i+1; j < primelist.size() && sum < param; j++){
				sum+=primelist.get(j);
				//System.out.println("i: "+primelist.get(i)+", j: "+primelist.get(j)+", sum: "+sum);
				if (primeset.contains(sum) && j-i+1 > max){
					//System.out.println("YAY");
					max = j-i+1;
					maxval = sum;
				}
			}
		}
		System.out.println(maxval);
	}
}
