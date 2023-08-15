package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * 14425번 풀이 - 문자열 집합 
 * 총 N개의 문자열로 이루어진 집합 S가 주어진다.
 * 입력으로 주어지는 M개의 문자열 중에서
 * 집합 S에 포함되어 있는 것이 총 몇 개인지 구하는 프로그램을 작성
 *
 */
public class _14425 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		
		HashMap<Integer, String> map = new HashMap<>();
		for ( int i = 0; i < n; i ++ ) {
			map.put(i, br.readLine());
		}
		
		int count = 0;
		for ( int i = 0; i < m; i++ ) {
			if ( map.containsValue(br.readLine())) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
