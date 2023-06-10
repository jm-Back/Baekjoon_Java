package baekjoon;

import java.io.IOException;
import java.util.Scanner;

/**
 * 별찍기 - 1
 */
public class _2438 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
		
		//줄 수
		int n = sc.nextInt();
		
		for ( int i = 0; i < n ; i ++)
		{
			for ( int j = 0; j <= i ; j ++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
		
	}

}
