package baekjoon;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * 1269 : 대칭 차집합
 * 자연수를 원소로 갖는 집합 a, b가 있다.
 * 
 * 두 집합의 대칭 차집합의 원소의 개수를 출력하는 프로그램을 작성하시오.
 * 두 집합이 있을 때, (a-b)와 (b-a)의 합집합을 a,b의 대칭 차집합이라고 한다.
 * 
 * 가령, a={1,2,4} / b={2,3,4,5,6} 일 때,
 * a-b={1} 이고 b-a={3,5,6} 이다. 
 * 그리하여 차집합의 원소의 개수는 1+3 = 4이다. 
 * 
 * * 입력
 * 1. 첫째 줄에는 집합 a의 원소 개수와 집합 b의 원소 개수가 주어진다.
 * 2. 둘째 줄에는 집합 a, 셋째 줄에는 집합 b가 주어진다. 
 *
 */
public class _1269_1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a_len = Integer.parseInt(st.nextToken());
		int b_len = Integer.parseInt(st.nextToken());
		
		Set<Integer> a_map = new HashSet<>();
		Set<Integer> b_map = new HashSet<>();
		
		st = new StringTokenizer(br.readLine());
		
		for ( int i = 0; i < a_len; i++ ) {
			int n = Integer.parseInt(st.nextToken());
			a_map.add(n);
		}
		
		st = new StringTokenizer(br.readLine());
		
		for ( int i = 0; i < b_len; i++ ) {
			int n = Integer.parseInt(st.nextToken());
			b_map.add(n);
		}
		
		int result = 0;
		for ( int num : a_map) {
			if(! b_map.contains(num)) {
				result++;
			}
		}
		
		for ( int num : b_map) {
			if(! a_map.contains(num)) {
				result++;
			}
		}
		
		System.out.println(result);
		
		
	}

}
