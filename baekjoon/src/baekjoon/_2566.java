package baekjoon;

import java.io.IOException;
import java.util.Scanner;

/**
 * 최댓값
 * 9*9 격차 판에 81개의 자연수 또는 0이 들어있다.
 * 이들 중 최댓값을 찾고 최댓값이 몇 행 몇 열에 위치한지 확인하라
 */
public class _2566 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc = new Scanner(System.in);
		
		int [][] pan = new int [9][9];
		int max = -1;
		
		//행,열
		int n = 0;
		int m = 0;
		
		//pan 넣기
		for ( int i = 0; i < 9; i++ )
		{
			for ( int j = 0; j < 9; j++ )
			{
				pan[i][j] = sc.nextInt();
				
				if ( pan[i][j] > max )
				{
					max = pan[i][j];
					
					n = i+1;
					m = j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(n + " " + m);

		sc.close();
		
	}

}