package euler;

public class Problem17 {
	public static void main(String[] args) {
		int sum = 0;

		// Calculate sum from 1 to 99
		// Calculate sum from 1 to 9
		sum += 3;
		sum += 3;
		sum += 5;
		sum += 4;
		sum += 4;
		sum += 3;
		sum += 5;
		sum += 5;
		sum += 4;
		int basesum=sum;
		// Multiply by 9
		sum*=9;
		// Add the "fifty"
		sum+=10*6;
		sum+=10*6;
		sum+=10*5;
		sum+=10*5;
		sum+=10*5;
		sum+=10*7;
		sum+=10*6;
		sum+=10*6;
		// Add the sum from 10 to 19
		sum+=3;
		sum+=6;
		sum+=6;
		sum+=8;
		sum+=8;
		sum+=7;
		sum+=7;
		sum+=9;
		sum+=8;
		sum+=8;

		// Multiply by 10
		sum*=10;

		// Add the "four hundred and"
		sum+=(99*9*3);
		sum+=900*7;
		sum+=100*basesum;

		// Add 1000
		sum+=11;

		// Print
		System.out.println(sum);
	}
}
