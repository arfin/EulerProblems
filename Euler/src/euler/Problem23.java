package euler;

import java.util.ArrayList;

public class Problem23 {

	public static void main(String[] args) {
		ArrayList<Integer> abundants = new ArrayList<Integer>();
		for (int i = 2; i < 28124; i++) {
			if (Problem21.d(i) > i) {
				abundants.add(i);
			}
		}

		boolean[] sums = new boolean[28124];
		for (int i = 0; i < sums.length; i++) {
			sums[i] = false;
		}
		for (Integer i : abundants) {
			for (Integer j : abundants) {
				if (i + j < sums.length)
					sums[i + j] = true;
			}
		}

		int sum = 0;
		for (int i = 0; i < sums.length; i++) {
			if (!sums[i]) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
