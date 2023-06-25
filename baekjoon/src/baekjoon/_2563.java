package baekjoon;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * 색종이
 * 1. 색종이 수가 주어진다.
 * 2. 둘째줄부터 한 줄에 하나씩 색종이 위치가 주어진다. 
 * 3. 첫 자연수 : 색종이 왼쪽 변과 도화지의 오른쪽 변 사이의 거리이고,
 * 두번째 자연수는 색종이 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다. 
 * 색종이는 도화지 밖으로 나가는 경우가 없다.  
 * 
 */
public class _2563 {
	
	public static void main(String args[]) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] arr = new int[100][100];
		
		//색종이 면적 = 1로 보기
		int count = 0;
		
		for ( int i = 0; i < n; i++ )
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for ( int j = x; j < x+10; j++ )
			{
				for (int k = y; k < y+10; k++ )
				{
					arr[j][k] = 1;
				}
			}
		}
		
		for ( int i = 0; i < 100; i++ )
		{
			for ( int j = 0; j < 100; j++ )
			{
				if ( arr[i][j]==1 ) count++;
			}
		}
		
		System.out.println(count);
		
		
		
		sc.close();
	}
}