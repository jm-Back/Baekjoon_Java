package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * 1620 - 나는야 포켓몬 마스터 이다솜
 * 포켓몬 도감을 완성시킨다. 
 * 1. 현재 가진 도감에서 이름을 보면 번호를 말하거나, 
 * 번호를 보면 이름을 말하는 연습을 해라. 
 * 
 * 1. 도감에 수록된 포켓몬 수 n / 맞춰야할 문제 개수 m
 * 2. n개의 줄에 포켓몬 번호가 1인 포켓몬부터 n번 포켓몬까지 입력
 * (모두 영어이름, 첫글자만 대문자, 나머지는 소문자.)
 * but 일부 포켓몬은 마지막 문자만 대문자일 수 있음
 * 
 * 그 다음에 m개의 줄에 내가 맞춰야할 문제가 입력됨
 * 알파벳 -> 번호 말하기. 번호 -> 알파벳 (이름) 말하기. 
 * 문제는 반드시 도감에 있는 포켓몬만 주어짐. 
 *  
 *  
 *
 */
public class _1620 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		HashMap<Integer, String> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		
		for ( int i = 0; i < n; i++ ) 
		{
			String monster = br.readLine();
			map1.put(i+1, monster);
			map2.put(monster, i+1);
		}
		
		StringBuilder sb = new StringBuilder();
		
		//바로 문제 시작.
		for ( int i = 0; i < m; i++ ) 
		{
			String quiz = br.readLine();
			
			if ( isNumber(quiz) ) 
			{
				sb.append(map1.get(Integer.parseInt(quiz))+"\n");
			}
			else 
			{
				sb.append(map2.get(quiz)+"\n");
			}
		}
		
		System.out.println(sb.toString());

	}
	
	public static boolean isNumber(String word) {
		
		try {
			
			Integer.parseInt(word);
			return true;
			
		} catch (NumberFormatException e) {
			return false;
		}

	}

}
