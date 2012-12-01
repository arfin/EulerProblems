package euler;

public class Problem15 {

	public static long choose(int n, int k){
		if (k > n/2){
			return choose(n, n-k);
		}
		long result = 1;
		for(int i = 1; i <= k; i++,n--){
			result*=n;
			result/=i;
		}
		return result;
	}
	
	public static void main(String[] args){
		System.out.println(choose(40,20));
	}
}
