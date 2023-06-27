package baekjoon;

import java.util.Scanner;
 
/**
 * 진법 변환
 * B진법 수 n이 주어진다. 이 수를 10진법으로 바꿔서 출력하는 프로그램을 작성하시오.
 * 10진법을 넘어가는 진법은 알파벳 대문자를 사용한다.
 * 
 */
public class _2745 {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		
		int b = sc.nextInt();
		
		int ans = 0;
		
		/**
		 * 진법 변환시, B진법 수는 대문자이거나 숫자로 이뤄져있다.
		 * 대문자라면 55를 빼고, 숫자라면 0을 빼서 숫자로 만들어준다.
		 * 빼준 숫자에 B의 제곱수를 곱하면 된다.
		 * 
		 */
		
		for ( int i = 0; i < n.length(); i ++ )
		{
			char c = n.charAt(i);
			if ( '0' <= c && c <= '9' )
			{
				ans = ans*b + (n.charAt(i)-'0'); //숫자일 땐 숫자로,
			}
			else
			{
				ans = ans*b + (n.charAt(i)-'A'+10); //대문자일때는 -55로 숫자로!
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}