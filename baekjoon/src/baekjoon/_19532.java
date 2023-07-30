package baekjoon;

import java.util.Scanner;

/**
 * 19532번 풀이 - 수학은 비대면강의입니다.
 *수현이의 버추얼 선생님은 문자가 2개인 
 *연립방정식을 해결하는 방법에 대해 강의하고, 다음과 같은 문제를 숙제로 냈다.
 * ax + by = c
 * dx + ey = f
 * x와 y를 계산하시오.
 * a,b,c,d,e,f가 공백으로 구분되어 주어진다.
 * 문제의 답인 x와 y 를 공백으로 구분해 출력한다.
 * 
 */
public class _19532 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		for ( int i = -999; i <= 999; i++ ) {
			for ( int j = -999; j <= 999; j++ ) {
			
				if ( (a*i) + (b*j) == c && (d*i) + (e*j) == f ) {
					System.out.print(i + " ");
					System.out.print(j);
				}
				
			}
		}

		sc.close();

	}

}
