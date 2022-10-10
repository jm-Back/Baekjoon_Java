package baekjoon;

import java.util.Scanner;

public class _3003 {

	public static void main(String[] args) {
		// 킹1, 퀸1, 룩2, 비숍2, 나이트2, 폰8
		
		Scanner sc = new Scanner(System.in);
		
		int k1 = sc.nextInt();
		int q1 = sc.nextInt();
		int l1 = sc.nextInt();
		int b1 = sc.nextInt();
		int n1 = sc.nextInt();
		int p1 = sc.nextInt();
		
		int k = 1 - k1;
		int q = 1 - q1;
		int l = 2 - l1;
		int b = 2 - b1;
		int n = 2 - n1;
		int p = 8 - p1;
		
		System.out.print(k+" "+q+" "+l+" "+b+" "+n+" "+p);
		
		sc.close();

	}

}
