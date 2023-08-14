package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 1181번 - 단어 정렬
 * 알파벳 소문자로 이루어진 N개의 단어가 들어오면
 * 1. 길이가 짧은 순으로
 * 2. 길이가 같으면 사전 순으로 정렬하라. 
 * 단, 중복된 단어는 하나만 남기고 제거해야 한다. 
 * 
 */
public class _1181 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] arr = new String[n];
		
		for ( int i = 0; i < n; i++ ) 
		{
			arr[i] = sc.next();
			
		}

		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);	
				}
				// 그 외의 경우
				else {
					return o1.length() - o2.length();
				}
			}

		});
		
		System.out.println(arr[0]);
		
		for (int i = 1; i < n; i++) {
			// 중복되지 않는 단어 출력
			if (!arr[i].equals(arr[i - 1])) {
				System.out.println(arr[i]);
			}
		}
		

		sc.close();
	}

}
