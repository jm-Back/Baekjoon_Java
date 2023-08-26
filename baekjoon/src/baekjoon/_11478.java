package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * 서로 다른 부분 문자열의 개수 
 * - 문자여 s가 주어졌을 때, s의 서로 다른 부분 문자열의 개수를 구하시오.
 * 부분 문자열은 s에서 연속된 일부분을 말한다. 
 * 예를 들어, ababc 의 부분 문자열은 a,b,a,b,c,ab,ba,bc,aba,bab,abc,abab,babc,ababc가 있고
 * 서로 다른 것의 개수는 12개 이다. 
 * 
 *
 */
public class _11478 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		//s는 소문자로만 이루어졌다. 
		Set<String> map = new HashSet<>();
		
		int len = 1;
		while ( true ) {

			for ( int i = 0; i < s.length(); i++ ) {
				try {
					//System.out.println(s.substring(i,i+len));
					map.add(s.substring(i,i+len));
				} catch (Exception e) {
					continue;
				}
			}
			
			len++;
			if ( s.length() < len ) {
				break;
			}
		}
		
		System.out.println(map.size());

	}
}
