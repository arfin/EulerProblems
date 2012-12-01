package euler;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;

public class Problem13 {

	public static void main(String[] args) throws IOException {
		ArrayList<BigInteger> list = new ArrayList<BigInteger>();

		try {
			FileInputStream fstream = new FileInputStream(
					"/Users/AviArfin/Documents/EulerProblem13.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null) {
				// Print the content on the console
				//System.out.println(strLine);
				list.add(new BigInteger(strLine));

			}
			in.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		
		BigInteger sum = new BigInteger("0");
		for(BigInteger i:list){
			sum = sum.add(i);
		}
		System.out.println(sum.toString());

	}
}
