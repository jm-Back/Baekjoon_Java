package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class _1929 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long m = sc.nextLong();
		long n = sc.nextLong();
		
		sc.close();
		
		findSosu(m,n);

	}
	
	public static void findSosu(long m, long n) {
		
		for ( long i = m; i <= n; i++ ) {
			BigInteger primeNumber = new BigInteger(String.valueOf(i));
			
			if ( primeNumber.isProbablePrime(10)) {
				System.out.println(primeNumber);
			} 
		}
		
	}

}
