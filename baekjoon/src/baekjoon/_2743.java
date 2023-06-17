package baekjoon;

import java.util.Scanner;
 
/**
 * 단어 길이 재기
 * 알파벳으로 이루어진 단어를 입력받아 길이를 출력하라 
 * 첫째 줄에는 영어 소문자 대문자로 이뤄진 단어가 입력된다.
 * 첫째 줄에 주어진 단어의 길이를 출력하라.
 * 
 */
public class _2743 {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		
		System.out.println(st.length());
		
		sc.close();
	}
}