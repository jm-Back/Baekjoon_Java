package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 11650번 - 좌표 정렬하기 
 * 2차원 평면 위의 점 N개가 주어진다. 
 * 좌표를 x좌표가 증가하는 순으로, 
 * x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
 * 
 */
public class _11650 {
	
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
			if ( arr1[0] == arr2[0]) {
				return arr1[1] - arr2[1];
			} else {
				return arr1[0] - arr2[0];
			}
			
		});
		
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
		

		sc.close();
	}

}
