package baekjoon;

import java.io.IOException;
import java.util.Scanner;

/**
 * 별찍기 - 2
 * 별을 오른쪽으로 정렬하시오
 */
public class _2439 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
		
		//줄 수
		int n = sc.nextInt();
		
		for ( int i = 0; i < n ; i ++ )
		{
			for ( int j = n-1; j > i ; j-- )
			{
				System.out.print(" ");
			}
			
			for ( int z = 0; z <= i; z++ )
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

		sc.close();
		
	}

}
