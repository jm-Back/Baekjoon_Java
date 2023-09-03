package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 가로수
 * - 같은 간격으로 가로수 추가 심기. 
 * - 단, 예산은 가장 적은 수의 나무를 심고 싶다. 
 * 거리 = 기준점으로부터 떨어지는 거리. 모두 양의 정수이다. 
 * 
 * 1. 심어진 가로수의 위치가 주어질 때, 
 * 모든 가로수가 같은 간격으로 심어지도록 하는 가로수의 최소수를 구하여라. 
 * 
 * @author Back
 *
 */
public class _2485 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//이미 심어진 가로수의 수 
		int n = Integer.parseInt(br.readLine());
		
		//가로수의 위치가 주어진다. 
		int[] arr = new int[n];
		int[] m = new int[n-1];
		
		for ( int i = 0; i < n; i ++ ) {
			arr[i] = Integer.parseInt(br.readLine());
			if ( i != 0 ) m[i-1] = arr[i] - arr[i-1];
		}
		
		Arrays.sort(m);
		
		//최대공약수 구하기.
		int gcd = 0;
		for ( int i = 0; i < m.length; i++ ) {
			gcd = gcd(m[i], gcd);
		}
		
		//일정하게 심은 나무 수 - 이미 심은 나무 수
		System.out.println((arr[n-1]-arr[0])/gcd +1 - (arr.length));
		
	}
	
	private static int gcd(int a, int b) {
		while(b!=0) {
			int r = a%b;
			a = b;
			b = r;
		}
		
		return a;
	}

}
