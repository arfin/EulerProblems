package euler;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem67 {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		try {
			FileInputStream fstream = new FileInputStream(
					"/Users/AviArfin/Documents/EulerProblem67.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while ((strLine = br.readLine()) != null) {
				// Print the content on the console
				// System.out.println(strLine);
				list.add(Integer.parseInt(strLine));
			}
			in.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}

		int[][] pyramid = new int[100][];
		int[][] maxPath = new int[100][];
		int count = 0;
		for (int i = 0; i < pyramid.length; i++) {
			pyramid[i] = new int[i + 1];
			maxPath[i] = new int[i+1];
			for (int j = 0; j < pyramid[i].length; j++) {
				pyramid[i][j] = list.get(count++);
				maxPath[i][j] = pyramid[i][j];
			}
		}
		/*
		for (int i = 0; i < maxPath[maxPath.length-1].length;i++){
			maxPath[maxPath.length-1][i] = pyramid[maxPath.length-1][i];
		}*/
		
		for(int i = maxPath.length-2; i >= 0; i--){
			for (int j = 0; j < maxPath[i].length;j++){
				maxPath[i][j] += Math.max(maxPath[i+1][j],maxPath[i+1][j+1]);
			}
		}
		
		System.out.println(maxPath[0][0]);
	}
}
