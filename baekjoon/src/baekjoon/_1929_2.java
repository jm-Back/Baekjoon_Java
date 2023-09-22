package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class _1929_2 {
	
	private static int maxNumber = 100000;
	private static int[] a;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long m = sc.nextLong();
		long n = sc.nextLong();
		
		sc.close();
		
		a = new int[100001];
		
		findPrimeNumber(m,n);

	}
	
	
	public static void findPrimeNumber(long m, long n) {
		
		//1. 배열 생성
		for ( int i = 2; i <= maxNumber ; i++ ) {
			a[i] = i;
		}
		
		//2. 2부터 특정 수의 배수에 해당되는 수 모두 삭제.
		for ( int i = 2; i <= maxNumber; i++ ) {
			if ( a[i] == 0 ) continue; 
			
			//지워진 숫자가 아니라면 가능한 숫자 모두 지우기
			for ( int j = 2*i; j <= maxNumber; j++ ) {
				a[j] = 0;
			}
		}
		
		//3. 2부터 남은 수 모두 출력하기.
		for ( int i = 2; i <= maxNumber; i++ ) {
			if ( a[i] != 0 ) {
				System.out.println(a[i]);
			}
		}
		
	}

}
