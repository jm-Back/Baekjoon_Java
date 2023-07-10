package baekjoon;

import java.util.Scanner;

/**
 * 네 번째 점
 * 3009번
 * 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해 필요한 네 번째 점을 찾는 프로그램을 만들어라
 * 세 점의 좌표가 하나씩 주어진다. 
 * 
 */
public class _3009 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//배열 저장 
		int[][] arr = new int[3][2];
		
		for ( int i = 0; i < 3; i ++ )
		{
			for ( int j = 0; j < 2; j++ )
			{
				arr[i][j] = sc.nextInt();	
			}
		}
		
		int count1 = 0;
		int count2 = 0;
		
		int x = 0;
		int y = 0;
		
		
		for ( int i = 1; i < 3; i ++ )
		{
			//x
			if ( arr[i][0] == arr[0][0]) count1 ++;
			else x = i;
			
			//y
			if ( arr[i][1] == arr[0][1]) count2 ++;
			else y = i;
 
		}
		
		if ( count1 == 0 )
		{
			System.out.print(arr[0][0] + " ");
		}
		else
		{
			System.out.print(arr[x][0] + " ");
		}
		
		if ( count2 == 0 )
		{
			System.out.print(arr[0][1]);
		}
		else
		{
			System.out.print(arr[y][1]);
		}
		
 
		sc.close();
	}
}