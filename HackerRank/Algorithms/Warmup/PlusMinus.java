package HackerRank.Algorithms.Warmup;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double positive = 0, negative = 0, zero = 0;
		int n = Integer.parseInt(sc.nextLine());
		String[] input = sc.nextLine().split(" ");

		for (int i = 0; i < n; ++i) {
			if (Integer.parseInt(input[i]) > 0)
				positive++;
			else if (Integer.parseInt(input[i]) < 0)
				negative++;
			else
				zero++;
		}

		System.out.printf("%.4f\n%.4f\n%.4f", positive / n, negative / n, zero / n);
		sc.close();
	}

}
