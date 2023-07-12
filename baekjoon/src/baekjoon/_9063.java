package baekjoon;

import java.util.Scanner;

/**
 * 대지
 * 9063번 풀이
 *
 *임씨의 이름이 새겨진 옥구슬이 나오는 모든 지점을 포함하는 가장 작은 평행한 변을 갖는 직사각형을 대지로 인정한다. 
 *옥구슬의 위치 N개가 주어질 때, 임씨에게 돌아갈 대지의 넓이를 계산하라. 
 *옥구슬은 같은 위치에 여러 개가 발견될 수 있으며, x는 양의 방향의 동쪽, y축의 양의 방향을 북쪽으로 가정한다. 
 *
 *첫째 줄에는 점의 개수 n이 주어진다. 
 *이어지는 n줄에는 각 점의 좌표가 두 개의 정수로 한 줄에 하나씩 주어진다. 
 *좌표는 -10000 이상 10000 이하의 정수이다. 
 *
 *
 */
public class _9063 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int x_max = -10001;
		int y_max = -10001;
		
		int x_min = 0;
		int y_min = 0;
		
		for ( int i = 0; i < n; i++ )
		{
			int x = sc.nextInt();
			
			if ( x > x_max ) x_max = x;
			
			//초기 최솟값 세팅
			if ( i == 0 ) {
				x_min = x;
			}
			else
			{
				if ( x < x_min ) x_min = x;
			}
			
			int y = sc.nextInt();
			
			if ( y > y_max ) y_max = y;
			
			//초기 최솟값 찾기
			if ( i == 0 ) {
				y_min = y;
			}
			else
			{
				if ( y < y_min ) y_min = y;
			}	
		}
		
		System.out.println((x_max - x_min) * (y_max - y_min));
		
		sc.close();

	}

}
