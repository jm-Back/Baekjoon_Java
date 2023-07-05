package baekjoon;

import java.util.Scanner;

/**
 * 약수 구하기
 * 2501번
 * 자연수 p와 q가 있을 때, p를 q로 나누었을 때 나머지가 0이면 q는 p의 약수이다.  
 * 두 개의 자연수 n과 k 가 있을 때, n의 약수 중에 k번째로 작은 수를 출력하시오.
 * 
 * 1. 첫 줄에 n과 k가 주어진다.
 * 2. 만약 약수가 k개 보다 적다면, 0을 출력하시오. 
 */
public class _2501 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int num = 0;
		for ( int i = 1; i <= n; i++ )
		{
			if ( n % i == 0 )
			{
				num++;
				
				if( num == k )
				{
					System.out.println(i);
					break;
				}
			}
		}
		
		if ( num < k )
		{
			System.out.println(0);
		}
		
		
		sc.close();
	}
}