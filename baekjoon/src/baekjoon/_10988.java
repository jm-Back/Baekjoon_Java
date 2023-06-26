package baekjoon;

import java.io.IOException;
import java.util.Scanner;

/**
 * 팰린드롬인지 확인하기 
 */
public class _10988 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		char [] arr = new char[s.length()];
		
		for ( int i = 0; i < s.length(); i++ )
		{
			arr[s.length()-1-i] = s.charAt(i);
			
		}
		
		int result = 1;
		
		for ( int i = 0; i < s.length(); i++ )
		{
			if ( arr[i] != s.charAt(i) )
			{
				result = 0;
				break;
			}
			else
			{
				result = 1;
			}
		}
		
		System.out.println(result);
		
		sc.close();
		
	}

}
