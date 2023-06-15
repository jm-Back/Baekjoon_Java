package baekjoon;

import java.util.Scanner;

/**
 * 과제 안 내신 분...?
 * 학생별로 1번부터 30번까지 출석번호가 있다. 
 * 특별 과제를 28명이 제출했는데, 그 중에 제출 안 한 학생 2명의 출석 번호를 구하라. 
 * 총 28개의 줄로 출석번호를 입력하며, 출석번호는 중복이 없다. 
 * 출력은 2줄이다. 1번째 줄에는 가장 작은 출석번호, 2번째 줄엔느 그 다음 출석번호를 출력하라.
 * 
 */
public class _5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int[] arr = new int[30];
		
		for ( int i = 0; i < 28; i++ )
		{
			num = sc.nextInt();
			arr[num-1] = num;
		}
		
		for ( int j = 0; j < arr.length; j++ )
		{
			if ( arr[j] == 0 )
			{
				System.out.println(j+1);
			}
		}

		sc.close();
	}

}
