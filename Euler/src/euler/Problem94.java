package euler;

public class Problem94 {

	public static double areasquared(int twosides, int oneside) {
		double area = twosides * twosides;
		area -= oneside * oneside / 4.;
		area *= oneside * oneside;
		area /= 4;
		return area;
	}

	public final static boolean isPerfectSquare(double n) {
		if (n < 0)
			return false;

		long tst = (long) (Math.sqrt(n) + 0.5);
		return tst * tst == n;
	}

	public static void main(String[] args) {

		double sum = 0.;
		for (int i = 1; i <= 1000000000 / 3 + 2; i++) {
			if (isPerfectSquare(areasquared(i, i + 1))
					&& Math.sqrt(areasquared(i, i + 1)) <= 1000000000) {
				sum += 3 * i + 1;
				//System.out.println(i);
				//System.out.println(i + 1);
				//System.out.println();
			}
			if (isPerfectSquare(areasquared(i + 1, i))
					&& Math.sqrt(areasquared(i + 1, i)) <= 1000000000) {
				sum += 3 * i + 2;
				//System.out.println(i + 1);
				//System.out.println(i);
				//System.out.println();
			}
		}

		System.out.println(sum);
	}

}
