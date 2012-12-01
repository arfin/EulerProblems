package euler;

public class Problem4 {
	public static boolean isPalindrome(int n) {
		String str = new Integer(n).toString();
		return isPalindrome(str);
	}

	public static boolean isPalindrome(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int max = 0;
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j < 1000; j++) {
				if (isPalindrome(i * j)) {
					max = Math.max(max, i * j);
				}
			}
		}
		System.out.println(max);
	}

}
