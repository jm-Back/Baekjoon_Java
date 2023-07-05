package baekjoon;

import java.util.Scanner;

/**
 * 소수 찾기
 * 1978번 풀이
 * 1. 주어진 n 개 중에서 소수가 몇 개인지 찾아서 출력하시오.
 * 첫 줄에 수의 개수 n이 주어진다. (n은 100이하) 다음으로 n개의 수가 주어진다.
 * n개의 수는 1000이하의 자연수이다.
 * 
 */
public class _1978 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int sosu = 0;
		
		for ( int i = 0; i < n; i++ )
		{
			int n_1 = sc.nextInt();
			int count = 0;
			
			for ( int j = 1; j <= n_1; j++ )
			{
				if ( n_1 % j == 0 )
				{
					count++;
				}
				
			}
			
			if ( count == 2 ) //1과 자기자신
			{
				sosu++;
			}
			
		}
		
		System.out.println(sosu);
		
 
		sc.close();
	}
}