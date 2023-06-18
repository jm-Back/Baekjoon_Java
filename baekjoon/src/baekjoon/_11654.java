package baekjoon;

import java.util.Scanner;
 
/**
 * 아스키 코드
 * 아스키 코드값을 출력하는 프로그램!
 */
public class _11654 {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.next().charAt(0);
		
		System.out.println(a);
		
		
		sc.close();
	}
}