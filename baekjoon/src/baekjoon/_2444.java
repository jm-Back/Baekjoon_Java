package baekjoon;

import java.util.Scanner;

/**
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 
 *     *
      ***
     *****
    *******
   *********
   	*******
   	 *****
   	  ***
   	   *
 *
 */
public class _2444 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int star = 1;
		
		//첫번째별모음
		for ( int i = n; i > 1; i-- ) 
		{
			
			for ( int j = i; j > 1; j-- ) {
				System.out.print(" ");
			}
			
			for ( int j = 1; j <= star; j++ ) {
				System.out.print("*");
			}
			
			star += 2;
			System.out.println();
		}
		
		//중간별
		for ( int i = 0; i < star; i++ ) 
		{
			System.out.print("*");
		}
		
		System.out.println();
		
		//마지막별
		for ( int i = 0; i < n ; i++ ) 
		{
			
			star -= 2;
			
			for ( int j = 0; j <= i; j++ ) {
				System.out.print(" ");
			}
			
			for ( int j = 1; j <= star; j++ ) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}

		sc.close();

	}

}
