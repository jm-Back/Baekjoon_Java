package baekjoon;

import java.util.Scanner;

/**
 * 9개의 서로 다른 자연수가 주어질 때 최댓값을 찾고 그 최댓값이 몇 번째 인지 구하라
 * 한 줄 마다 하나의 자연수가 주어진다.
 */
public class _2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int max = 0;
		int idx = 0;
		
		for ( int i = 0; i < 9 ; i++ )
		{
			arr[i] = sc.nextInt();
			
			if( arr[i] > max )
			{
				max = arr[i];
				idx = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(idx);
		
		sc.close();
	}

}
