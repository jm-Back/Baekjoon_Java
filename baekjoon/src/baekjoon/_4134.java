package baekjoon;

import java.util.Scanner;

/**
 * 다음 소수 
 * 정수 n이 주어졌을 때, n보다 크거나 같은 소수 중에 가장 작은 소수를 찾는 프로그램을 작성하시오.
 * @author Back
 *
 */
public class _4134 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long testCaseCount = sc.nextLong();
		
		for ( int i = 0; i < testCaseCount; i++ ) {
			long testCase = sc.nextLong();
			test(testCase);
		}
		
		sc.close();
		
	}
	
	private static long test(long testCase) {
		
		while(true) {
			++testCase; //7
			if ( getSosu(testCase) ) {
				System.out.println(testCase);
				break;
			}
		}
		
		return testCase;
	}

	private static boolean getSosu(long num) {
		boolean sosu = true;
		long b = 2;
		while( b < num ) {
			if ( num % b == 0 ) {
				sosu = false;
				break;
			}
			b++;
		}
		return sosu;
	}
	

}
