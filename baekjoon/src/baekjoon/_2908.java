package baekjoon;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * 상수
 * 상수는 숫자를 거꾸로 읽는다. 
 * 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 만들어라.
 * 1. 첫째 줄에 상근이가 적은 두 수 a.b 가 주어진다.
 * 2. 두 수는 세 자리 수이며 0이 포함되어 있지 않다. 
 */
public class _2908 {
	
	public static void main(String args[]) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		a = (a % 10) * 100 + (a % 100 / 10) * 10 + (a / 100); // 일의자리 십의자리 백의자리
		b = (b % 10) * 100 + (b % 100 / 10) * 10 + (b / 100); // 일의자리 십의자리 백의자리
		
		System.out.println(a > b ? a : b);
		
		
		sc.close();
	}
}