package baekjoon;

import java.io.IOException;
import java.util.Scanner;

/**
 * 행렬 덧셈
 * n*m 크기의 두 행렬 a,b가 주어졌을 때 두 행렬을 더하라 
 */
public class _2738 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //행
		int m = sc.nextInt(); //열
		
		//행렬 a, 행렬 b
		int [][] a = new int[n][m];
		int [][] b = new int[n][m];
		
		for ( int i = 0; i < n; i ++ )
		{
			for ( int j = 0; j < m; j++ )
			{
				a[i][j] = sc.nextInt();
			}
			
		}
		for ( int i = 0; i < n; i ++ )
		{
			for ( int j = 0; j < m; j++ )
			{
				b[i][j] = sc.nextInt();
			}
			
		}
		
		//결과행
		int [][]sum = new int[n][m];
		
		for ( int i = 0; i < n; i ++ )
		{
			for ( int j = 0; j < m; j++ )
			{
				sum[i][j] = a[i][j] + b[i][j];
			
				System.out.print(sum[i][j] + " ");
			}
			
			System.out.println();
			
		}

		sc.close();
		
	}

}
