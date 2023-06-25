package baekjoon;

import java.io.IOException;
import java.util.Scanner;
 
/**
 * 중앙 이동 알고리즘
 *  정사각형 각 변의 중앙에 점이 하나씩 추가된다.
 *  정사각형 중심에 점을 하나 추가한다. 
 * 
 */
public class _2903 {
	
	public static void main(String args[]) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//1 4 4의2 4의3 ... 제곱으로 정사각형 수가 늘어남.
		//그리고 점의 개수는 한 변의 길이 + 1 로 넓이를 구한 값임
		
		System.out.println((int)Math.pow(Math.pow(2, n) +1, 2));
		
		sc.close();
	}
}