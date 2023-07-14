package baekjoon;

import java.util.Scanner;

/**
 *  세 막대
 *  a,b,c 막대를 조합해서 만들 수 있는 가장 큰 삼각형의 둘레를 출력한다.
 *  각 막대는 양의 정수이며, 각 막대의 길이를 마음대로 줄일 수 있다. 
 *  넓이는 양수여야 한다. 
 * 
 */
public class _14215 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// 삼각형 = 두 변의 합이 다른 한 변보다 커야 한다.
		// 삼각형 = a+b > c, b+c > a, a+c > b 
		while ( (a + b) <= c )
		{
			--c;
			
		}
		
		while ( (b + c) <= a )
		{
			--a;
			
		}
		
		while ( (a + c) <= b )
		{
			--b;
			
		}
		
		System.out.println(a+b+c);
		
		
		sc.close();

	}

}
