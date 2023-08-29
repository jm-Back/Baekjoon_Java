package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 두 자연수 a,b에 대하여, a의 배수이면서 b의 배수인 자연수를 
 * a와 b의 공배수라고 한다.
 * 
 * 이 공배수 중에서 가장 작은 공배수를 최소 공배수라고 한다. 
 * 두 자연수가 주어졌을 때, a와b의 최소공배수를 구하시오.
 * @author Back
 *
 */
public class _1934 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//테스트 케이스 개수
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		//t개의 줄에 걸쳐 a,b가 주어진다. 
		for ( int i = 0; i < t; i++ ) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int result = gcd(a,b); // 6 10 -> 2
			System.out.println((a/result)*b);
			
		}
	}
	
	public static int gcd(int a, int b) {
		
		while(b!=0) {
			int r = a % b;
			a = b;
			b = r;	
		}
		
		return a;
	}
	

}
