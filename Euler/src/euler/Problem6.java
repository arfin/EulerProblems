package euler;

public class Problem6 {
	public static void main(String[] args){
		final int n = 100;
		
		int firstSum = 0;
		for (int i = 0; i<=n; i++){
			firstSum+=i*i;
		}
		
		int secondSum=0;
		for (int i=0; i<=n; i++){
			secondSum+=i;
		}
		secondSum*=secondSum;
		
		System.out.println(secondSum-firstSum);
	}
}
