package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 최소공배수
 * - 한 줄에 두 정수 a, b가 공백으로 구분되어 주어진다.
 * - 큰 수 입력에 대하여 변수를 64비트 정수로 선언하시오. java 는 long형을 선언한다.
 * - 출력 : a와 b의 최소 공배수를 한 줄에 출력하시오.
 * @author Back
 *
 */
public class _13241 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long result = gcd(a,b);
		
		System.out.println((a*b)/result);
		
	}
	
	private static long gcd(long a, long b) {
		
		while(b != 0 ) {
			long r = a % b;
			a = b;
			b = r;	
		}
		
		return a;
	}

}
