package euler;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Problem22 {
	public static int scorify(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum+=str.charAt(i)-'A'+1;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(scorify("COLIN"));
		ArrayList<String> names = new ArrayList<String>();
		try {
			FileInputStream fstream = new FileInputStream(
					"/Users/AviArfin/Documents/EulerProblem22.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null) {
				names.add(strLine);
			}
			in.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}

		Collections.sort(names);
		int sum = 0;
		for (int i = 0; i < names.size(); i++) {
			sum += (i + 1) * scorify(names.get(i));
		}
		System.out.println(sum);
	}

}
