package baekjoon;

import java.util.Arrays;
import java.util.Scanner;
 
/**
 * N개의 정수가 주어진다.
 * 이때, 최솟값, 최대값을 구하는 프로그램을 작성한다.
 * 첫째 줄에는 정수의 개수가 주어진다. 
 * 둘째 줄에는 N개의 정부를 공백으로 구분해 주어진다.
 *
 */
public class _10818 {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		int[] num = new int[n];

		for ( int i = 0; i < n; i++ )
		{
			num[i] = sc.nextInt(); 
		}
		
		Arrays.sort(num);

		System.out.println(num[0] + " " + num[n-1]);
		
		sc.close();
	}
}