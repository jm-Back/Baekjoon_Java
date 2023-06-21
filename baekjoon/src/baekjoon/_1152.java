package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
/**
 * 단어의 개수
 * 영어 대소문자와 공백으로 이뤄진 문자열이 주어진다. 
 * 단어는 공백 하나로 구분되며, 공백의 연속은 없다. 또한 공백으로 시작하거나 끝날 수 있다.
 * 1. 첫 줄에 단어의 개수를 입력한다. 
 * 
 */
public class _1152 {
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String [] n = s.split(" ");
		
		int count = n.length;
		
		for ( int i =0; i < n.length; i++ )
		{
			if ( n[i] == "")
			{
				count--;
			}
		}
		
		System.out.println(count);
		
	}
}