package euler;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Problem42 {
	public static int compute(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum+=str.charAt(i)-'A'+1;
		}
		return sum;
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		try {
			FileInputStream fstream = new FileInputStream(
					"/Users/AviArfin/Documents/EulerProblem42.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null) {
				// Print the content on the console
				// System.out.println(strLine);
				list.add(strLine);
			}
			in.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		
		HashSet<Integer> triangular = new HashSet<Integer>();
		int sum = 0;
		for(int i = 0; i < 100; i++){
			sum+=i;
			triangular.add(sum);
		}
		
		int total = 0;
		for(String str:list){
			System.out.println(str);
			if (triangular.contains(compute(str)))
				total++;
		}
		System.out.println(total);
	}
}
