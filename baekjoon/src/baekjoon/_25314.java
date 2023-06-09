package baekjoon;

import java.util.Scanner;

public class _25314 {

	/**
	 * 코딩은 체육 과목
	 * 첫 번째 줄에는 문제의 정수 n이 주어진다.
	 * long int = 4바이트 저장
	 * long long int = 8바이트 저장 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = n / 4;
		
		for (int i = 0; i < m; i ++)
		{
			System.out.print("long ");
		}
		
		System.out.print("int");
		sc.close();

	}

}
