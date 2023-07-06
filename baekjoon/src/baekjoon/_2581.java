package baekjoon;

import java.util.Scanner;

/**
 * 소수
 * 2581번
 * : m과 n이 주어질 때, m이상 n 이하 자연수 중에 소수를 모두 골라 이들의 합과 최솟값을 찾으시오. 
 * 1. 첫 줄에 m, 둘째줄에 n이 주어진다. 
 * 1. 첫 줄에 합, 둘째줄에 최솟값을 적으시오. 만약, 소수가 없으면 -1을 출력
 * 
 */
public class _2581 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int sum = 0;
		int min = 0;
		
		for ( int i = m; i <= n; i++ )
		{
			int count = 0;
			
			for ( int j = 1; j <= i; j++ )
			{
				
				if ( i % j == 0 )
				{
					count++; 
				}
				
			}
			
			if ( count == 2 && min == 0 )
			{
				sum += i;
				min = i;
			}
			else if ( count == 2 )
			{
				sum += i;
			}
			
		}
		
		if ( sum == 0 )
		{
			System.out.println(-1);
		}
		else
		{
			System.out.println(sum);
			System.out.println(min);
		}
		
 
		sc.close();
	}
}