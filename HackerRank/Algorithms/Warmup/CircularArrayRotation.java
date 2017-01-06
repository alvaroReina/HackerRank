package HackerRank.Algorithms.Warmup;

import java.util.Arrays;
import java.util.Scanner;

public class CircularArrayRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int gap = k % n;
		int[] a = new int[n];
		int[] m = new int[q];
		for(int a_i=0; a_i < n; a_i++){
			a[a_i] = sc.nextInt();
		}
		
		for(int m_i=0; m_i < q; m_i++){
			m[m_i] = sc.nextInt();
		}
		
		for(int i = 0; i < q; i++){
			System.out.println(a[m[i]]);
		}
		sc.close();
	}

}

