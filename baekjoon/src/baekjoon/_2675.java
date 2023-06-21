package baekjoon;

import java.util.Scanner;
 
/**
 * 문자열 반복
 * 문자열 s를 입력 받아 각 문자를 r번 반복해 새 문자열 p를 만든 후 출력하라 
 * 즉 첫 문제를 r번 반복하고 두번째 문자를 r번 반복해 만든다. 
 * 1. 테스트 케이스 개수 t가 주어진다. 
 * 2. 각 테스트 케이스는 반복 횟수 r, 문자열 s가 공백으로 주어진다. 
 * 
 */
public class _2675 {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		//횟수
		for ( int i = 0; i < t ; i++ )
		{
			int r = sc.nextInt();
			String s = sc.next();
			
			for ( int j = 0; j < s.length() ; j++ )
			{
				for ( int z = 0; z < r ; z++ )
				{
					System.out.print(s.charAt(j));
				}
				
			}
			
			System.out.println();
			
		}

		sc.close();
	}
}