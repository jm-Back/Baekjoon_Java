package baekjoon;

import java.util.Scanner;
 
/**
 * 정수 N개로 이뤄진 수열 A와 정수 X가 주어진다.
 * 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 만드시오
 * 첫째줄에 N과 X가 주어진다.
 *
 */
public class _10871 {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int[] num = new int[n];
		
		for ( int i = 0; i < n; i++ )
		{
			num[i] = sc.nextInt();
		
			if ( num[i] < x )
			{
				System.out.print(num[i] + " ");
			}
		
		}
		sc.close();
	}
}