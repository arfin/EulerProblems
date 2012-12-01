package euler;

public class Problem28 {
	
	public static void main(String[] args){
		int sum = 0;
		sum+=1;
		for(int i = 3; i <=1001; i+=2){
			sum+=(i*i);
			sum+=(i*i-i+1);
			sum+=(i*i-2*i+2);
			sum+=(i*i-3*i+3);
		}
		System.out.println(sum);
	}

}
