package HackerRank.Algorithms.Warmup;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[]input = sc.nextLine().split(":");
		String hh = input[0];
		String mm = input[1];
		String ss = input[2].substring(0, 2);
		sc.close();
		if(input[2].charAt(input[2].length()-2) == 'P' && Integer.parseInt(hh) != 12) 
			hh = Integer.toString(12 + Integer.parseInt(hh));
		
		else if (Integer.parseInt(hh) == 12 && input[2].charAt(input[2].length()-2) == 'A')
			hh = "00";
			
		System.out.println(hh + ":" + mm + ":"+ ss);
	}
}