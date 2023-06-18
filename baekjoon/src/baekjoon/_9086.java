package baekjoon;

import java.util.Scanner;
 
/**
 * 문자열
 * 문자열을 입력 으로 주면 문자열의 첫 글자와 마지막 글자를 출력하라.
 * 1. 첫 줄 : 테스트 케이스 개수 t
 * 2. 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다.
 */
public class _9086 {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for ( int i =0 ; i < n ; i++ )
		{
			String test = sc.next();
			
			System.out.print(test.charAt(0));
			System.out.print(test.charAt(test.length()-1));
			System.out.println();
		}
		
		
		sc.close();
	}
}