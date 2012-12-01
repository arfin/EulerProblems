package euler;

public class Problem36 {
	public static boolean isPalindrome(String str){
		for (int i = 0; i< str.length()/2; i++){
			if (str.charAt(i)!=str.charAt(str.length()-1-i))
				return false;
		}
		return true;
	}
	
	public static boolean areBothPalindromes(int n){
		return isPalindrome(""+n) && isPalindrome(Integer.toBinaryString(n));
	}
	
	public static void main(String[] args){
		int sum = 0;
		for(int i = 1; i < 1000000; i++){
			if (areBothPalindromes(i)){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
