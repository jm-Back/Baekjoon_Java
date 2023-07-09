package baekjoon;

import java.util.Scanner;

/**
 * 직사각형
 * 27323번
 * 세로 a, 가로 b인 직사각형의 넓이를 구하라
 *
 */
public class _27323 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a*b);
		
		sc.close();

	}

}
