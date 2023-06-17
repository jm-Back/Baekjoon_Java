package baekjoon;

import java.util.Scanner;
 
/**
 * 문자와 문자열 (문자열 첫 단계)
 * 
 */
public class _27866 {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		int n = sc.nextInt() - 1;
		
		System.out.println(st.charAt(n));
		
		sc.close();
	}
}