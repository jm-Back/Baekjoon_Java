package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 11651번 - 좌표 정렬하기 2
 * 2차원 평면 위의 점 N개가 주어진다. 
 * 이번에는 y순으로 정렬, y가 같으면 x순으로 정렬한다. 
 */
public class _11651 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n][2];
		
		
		for ( int i = 0; i < n; i++ ) 
		{
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		//x값(0번째숫자)가 같은 경우, y값(1번째숫자) 비교
		//그렇지 않으면 그냥 0번째 숫자 비교에서 그친다. 
		//****람다식 사용하는 것이 중요하군요....
		Arrays.sort(arr, (arr1, arr2) -> {
			if ( arr1[1] == arr2[1]) {
				return arr1[0] - arr2[0];
			} else {
				return arr1[1] - arr2[1];
			}
			
		});
		
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
		

		sc.close();
	}

}
