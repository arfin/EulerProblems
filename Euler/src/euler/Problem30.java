package euler;

public class Problem30 {

	public static int compute(int n){
		String str = ""+n;
		int sum = 0;
		for(int i = 0; i < str.length();i++){
			int k = str.charAt(i)-'0';
			sum+=k*k*k*k*k;
		}
		return sum;
	}
	
	public static void main(String[] args){
		int sum = 0;
		for (int i = 2; i < 1000000;i++){
			if (compute(i) == i){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	
	
}
