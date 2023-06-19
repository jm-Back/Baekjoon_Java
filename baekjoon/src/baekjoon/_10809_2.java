package baekjoon;

import java.util.Scanner;
 
/**
 * 알파벳 찾기
 * 소문자로 이뤄진 단어 s가 주어진다.
 * 각각 알파벳에 대하여 단어가 포함된 경우 처음 등장하는 위치를,
 * 포함되지 않은 경우 -1 이 출력되도록 하시오.
 * 
 * 다시 풀이. 이렇게 푸는 것이 아닌 아스키 코드를 활용한다. 
 */
public class _10809_2 {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int arr[] = new int[26];
		
		for (int i = 0; i < 26; i++) {
			arr[i] = -1;
		}		
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		
		for (int var : arr) {
			System.out.print(var + " ");
		}
		
		sc.close();
	}
}