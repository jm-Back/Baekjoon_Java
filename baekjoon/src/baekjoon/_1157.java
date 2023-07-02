package baekjoon;

import java.util.Scanner;

/**
 * 단어 공부
 * 알파벳 대소문자가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 
 * 알아내는 프로그램을 작성한다. 
 * 대소문자는 구분하지 않는다! 
 * 1. 첫줄에 단어가 입력된다.
 * 2. 가장 많이 사용된 알파벳을 대문자로 출력한다. 
 * 만약, 가장 많이 사용된 알파벳이 여러 개 존재하면 ?를 출력한다. 
 *
 */
public class _1157 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		s = s.toUpperCase();
		
		int [] arr = new int[s.length()];
		int [] count = new int[26];
		
		for ( int i = 0; i < s.length(); i++ )
		{
			arr[i] = (char) (s.charAt(i)-65);
		}
		
		for ( int i = 0; i < arr.length; i++ )
		{
			count[arr[i]]++;
		}

		
		int max = -1;
		boolean same = false;
		int num = 0;
		
		for ( int i = 0; i < count.length; i++ )
		{
			//System.out.println((char)(i+65) + "개수 " + count[i]);
			
			if ( count[i] > max )
			{
				max = count[i];
				num = i;
				same = false;
			}
			else if ( max > 0 && max == count[i] )
			{
				same = true;
			}
			
		}
		
		if ( same )
		{
			System.out.println("?");
		}
		else
		{
			System.out.println((char)(num+65));
		}
		
		
		sc.close();

	}

}
