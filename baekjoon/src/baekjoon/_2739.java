package baekjoon;

import java.util.Scanner;

public class _2739 {

	public static void main(String[] args) {
		// 구구단
		
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		
		
		sc.close();

	}

}
