package baekjoon;

import java.util.Scanner;
 
/**
 * 알파벳 찾기
 * 소문자로 이뤄진 단어 s가 주어진다.
 * 각각 알파벳에 대하여 단어가 포함된 경우 처음 등장하는 위치를,
 * 포함되지 않은 경우 -1 이 출력되도록 하시오.
 */
public class _10809 {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		char [] alpha = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		
		for ( int i = 0; i < alpha.length; i++ )
		{
			if ( s.indexOf(alpha[i]) > -1 )
			{
				System.out.print(s.indexOf(alpha[i]) + " ");
			}
			else //없는 경우
			{
				System.out.print("-1" + " ");
			}
		}
		
		//1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
		//1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 7 -1 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 
		
		sc.close();
	}
}