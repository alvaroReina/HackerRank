package HackerRank.Algorithms.Warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int d1 = 0, d2 = 0;
		for(int i = 0; i < n; ++i){
			String[]line = sc.nextLine().split(" ");
			d1 += Integer.parseInt(line[i]);
			d2 += Integer.parseInt(line[n-1-i]);
		}
		sc.close();
		System.out.println(Math.abs(d1-d2));
		
	}

}
