package baekjoon;

import java.util.Scanner;
 
/**
 * 평균
 * 자기 점수 중에 최댓값을 고른다. 이 값은 M이며, 모든 점수를 <점수/M * 100>으로 고친다.
 * 해당 방법으로 성적을 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
 * 첫째 줄에는 시험 본 과목의 수 n 이 주어진다. 
 * 둘째 줄에는 현재 성적이 주어진다. 
 */
public class _1546 {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double [] arr = new double [n];
		
		double max = 0;
		double avg = 0;
		
		for ( int i = 0; i < arr.length; i++ )
		{
			arr[i] = sc.nextDouble();
			
			if ( max < arr[i] )
			{
				max = arr[i];
			}
		}

		for ( int j = 0; j < arr.length; j++ )
		{
			arr[j] = (double)(arr[j]/max*100);
			
			avg += arr[j];
		}
		
		System.out.println(avg/n);
		
		
		sc.close();
	}
}