package baekjoon;

import java.util.Scanner;
 
/**
 * 첫째줄에는 정수의 개수 N이 입력된다.
 * 둘째줄에는 정수가 공백으로 구분된다.
 * 셋째줄에는 찾는 정수가 주어진다.
 *
 */
public class _10807 {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		int s = 0;
		int[] num = new int[n];
		
		for ( int i = 0; i < n ; i++ )
		{
			num[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		
		for ( int i = 0; i < n ; i ++)
		{
			if (num[i] == v)
			{
				++s;
			}
		}
		
		System.out.println(s);
		
		sc.close();
	}
}