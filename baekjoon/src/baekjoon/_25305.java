package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 25305번 풀이 - 커트라인
 * 2022 연세대학교 미래캠퍼스 코딩 대회에 n명의 학생이 응시했다. 
이들 중 점수가 가장 높은 
k명은 상을 받을 것이다. 이 때, 상을 받는 커트라인이 몇 점인지 구하라.
 * 
 */
public class _25305 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		
		for ( int i = 0; i < n; i++ ) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[n-k]);
		
		sc.close();
		
	}

}
