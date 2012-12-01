package euler;

import java.util.ArrayList;

public class Problem21 {

	public static ArrayList<Integer> factors(int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n / 2; i++) {
			if (n%i==0){
				list.add(i);
			}
		}
		return list;
	}
	public static int d(int n){
		ArrayList<Integer> factors = factors(n);
		int sum = 0;
		for(Integer i:factors){
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args){
		int sum = 0;
		for(int i =0;i<10000;i++){
			int d = d(i);
			if (d(d) == i && d!=i){
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
