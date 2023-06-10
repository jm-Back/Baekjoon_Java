package baekjoon;

import java.io.IOException;
import java.util.Scanner;

/**
 * A+B - 8
 */
public class _11022 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = 0;
		int b = 0;
		
		for(int i = 1; i <= n; i ++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println("Case #" + i + ": " +a+ " + " +b+ " = " + (a+b));
		}
		
		sc.close();
		
	}

}
