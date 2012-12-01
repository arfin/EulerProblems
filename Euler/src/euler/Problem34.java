package euler;

public class Problem34 {

	public static long compute(long n){
		String str = ""+n;
		long sum = 0;
		for(int i = 0; i < str.length(); i++){
			int dig = str.charAt(i)-'0';
			sum+=factorial(dig);
		}
		return sum;
	}
	public static long factorial(int n){
		int product = 1;
		for (int i = 1; i<=n; i++){
			product*=i;
		}
		return product;
	}
	
	public static void main(String[] args){
		long sum = 0;
		for(int i = 3; i < 100000;i++){
			if(compute(i)==i){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
