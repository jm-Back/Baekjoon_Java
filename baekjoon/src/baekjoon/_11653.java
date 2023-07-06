package baekjoon;

import java.util.Scanner;

/**
 * 소인수분해
 * 11653
 * n이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
 * 
 */
public class _11653 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
 
		
		for ( int i = 2; i <= n; i++ )
		{
			if ( n % i == 0 )
			{
				n = ( n / i );
				System.out.println(i);
				
				i = 1;
			}
			
		}
 
		sc.close();
	}
}