package baekjoon;

import java.util.Scanner;
 
/**
 * 숫자의 합
 * n개의 숫자가 공백 없이 쓰였다. 수의 모든 합을 출력해라.
 * 1. 첫째 줄 : 숫자의 개수가 주어진다. 
 * 2. 둘째 줄 : 숫자 n개가 공백없이 주어진다. 
 */
public class _11720 {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String num = sc.next();
		int sum = 0;
		
		for ( int i = 0; i < n ; i++ )
		{
			sum += num.charAt(i) - '0';
			
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}