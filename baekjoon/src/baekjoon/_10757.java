package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 큰 수 A+B 
 *
 */
public class _10757 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		
		a = a.add(b);
		
		System.out.println(a);
		
		sc.close();

	}

}
