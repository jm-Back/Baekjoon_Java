package baekjoon;

import java.util.Scanner;

/**
 * 수학은 체육과목 입니다.
 * 15894번 
 * 
 * 문제 짱웃겨...ㅎㅎ
 * 한 변의 길이가 1인 정사각형을 겹치지 않게 빈틈없이 붙여나간다.
 * 가장 아랫부분 정사각형이 n개가 되었을 때, 실선으로 이뤄진 도형의 둘레 길이를 구하시오.
 * 
 * 첫번째 줄에 가장 아랫부분 정사각형의 개수 n이 주어진다.
 * ex) 3 -> 12 / 1 -> 4
 * 
 */
public class _15894 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		System.out.println((n * 3) + n);
 
		sc.close();
	}
}