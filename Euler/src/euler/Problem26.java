package euler;

public class Problem26 {

	public static int numDigs(int n) {
		int digs = 1;
		while ((Math.pow(10, digs) - 1) % n != 0) {
			digs++;
		}
		return digs;
	}

	public static void main(String[] args) {		
		int max = 0;
		for (int i = 2; i < 1000; i++) {
			if (i % 2 != 0 && i % 5 != 0) {
				System.out.println("i: "+i +"digs: "+numDigs(i));
				max = Math.max(max, numDigs(i));
			}
		}
		System.out.println(max);
		//System.out.println(numDigs(7));
	}
}
