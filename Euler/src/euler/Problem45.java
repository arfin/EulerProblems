package euler;

import java.util.ArrayList;
import java.util.HashSet;

public class Problem45 {
	public static void main(String[] args){
		ArrayList<Long> hex = new ArrayList<Long>();
		HashSet<Long> pent = new HashSet<Long>();
		HashSet<Long> tri = new HashSet<Long>();
		
		for(long i = 0; i < 100000; i++){
			hex.add(i*(2*i-1));
			pent.add(i*(3*i-1)/2);
			tri.add(i*(i+1)/2);
		}
		
		for(Long i:hex){
			if (pent.contains(i) && tri.contains(i)){
				System.out.println(i);
			}
		}
	}
}
