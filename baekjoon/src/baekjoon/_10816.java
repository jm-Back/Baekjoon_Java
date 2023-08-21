package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * 10816번 풀이 - 숫자 카드 2
 * 숫자 카드는 정수가 하나 적혀 있다. 숫자 카드는 n개 가지고 있다.
 * 정수 m이 주어졌을 때, 이 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지 구하라. 
 * 
 * 1. 숫자 카드 개수 n 입력.
 * 2. 숫자 카드에 적힌 정수가 주어진다.
 * 3. 셋째 줄에는 m이 주어진다. 
 * 넷째 줄에는 m개의 정수들이 주어진다. 
 * 
 * * 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.
 * 
 */
public class _10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for ( int i =0; i < n; i++ ) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr); //이진탐색 정렬 필수.
		
		int m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		StringBuilder sb =  new StringBuilder();
		
		for ( int i = 0; i < m; i++ ) {
			int quiz = Integer.parseInt(st.nextToken());
			
			sb.append(upperBound(arr, quiz) - lowerBound(arr, quiz) + " ");

		}
		
		System.out.println(sb.toString());
	}
	
	private static int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (target <= arr[mid]) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
	
	private static int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (target < arr[mid]) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
	

}
