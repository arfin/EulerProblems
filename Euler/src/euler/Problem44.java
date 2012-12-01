package euler;

import java.util.ArrayList;
import java.util.HashSet;

public class Problem44 {
	public static void main(String[] args){
		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10000; i++){
			int pent = i*(3*i-1)/2;
			set.add(pent);
			list.add(pent);
		}
		
		for(Integer i:list){
			for(Integer j:list){
				if (set.contains(i+j) && set.contains(i+2*j)){
					System.out.println(i);
					return;
				}
			}
		}
	}
}
