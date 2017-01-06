package HackerRank.Algorithms.Warmup;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		for(int i = 1; i <= n; ++i){
			for(int j = 0; j < n-i; j++){
				System.out.print(" ");
			}
			for(int k = 0; k < n-(n-i) ; k++){
				System.out.print("#");
			}
			System.out.println();
		}
		sc.close();
	}

}
